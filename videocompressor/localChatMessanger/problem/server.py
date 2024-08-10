import os
import socket
import time
from faker import Faker

sock = socket.socket(socket.AF_UNIX, socket.SOCK_DGRAM)

server_address = './udp_socket_file'
client_address = './udp_client_socket_file'

fake = Faker()

try:
    os.unlink(server_address)
except FileNotFoundError:
    pass

print('starting up on {}'.format(server_address))

sock.bind(server_address)

while True:
    try:
        print('\nwaiting to receive message')
        data, address = sock.recvfrom(4096)
        print('received {} bytes from {}'.format(len(data), address))

        time.sleep(1)

        print('Send response to client')
        send_message = fake.text()
        sock.sendto(send_message.encode(encoding='utf-8'), client_address)

    except KeyboardInterrupt:
        print('\n...\n')
        sock.close()
        break

