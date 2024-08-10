import os
import socket

s = socket.socket(socket.AF_UNIX,socket.SOCK_DGRAM)

server_address = './udp_socket_file'
client_address = './udp_client_socket_file'

try:
    os.unlink(client_address)
except FileNotFoundError:
    pass

s.bind(client_address)

while True:
    try:
        message = input('> ')
        if message != 'exit':
            sent = s.sendto(message.encode('utf-8'), server_address)
            data, server = s.recvfrom(4096)
            print('received {!r}'.format(data))
        else:
            print('closing socket')
            s.close()
            print('done')
            break

    except KeyboardInterrupt:
        print('closing socket')
        s.close()
        print('done')
        break

