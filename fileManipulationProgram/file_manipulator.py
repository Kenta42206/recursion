import sys

def main():
    if sys.argv[1] == "reverse":
        reverse()
    elif sys.argv[1] == "copy":
        copy()
    elif sys.argv[1] == "duplicate-contents":
        duplicate_contents()
    elif sys.argv[1] == "replace-string":
        replace_string()
    else:
        print("ERROR: Your input is not correct")

def reverse():
    inputpath = sys.argv[2]
    outputpath = sys.argv[3]
    contents = ''
    with open(inputpath) as f:
        contents = f.read()

    with open(outputpath, 'w') as f:
        result = ''.join(reversed(contents))
        f.write(result)
        print("done!")


def copy():
    inputpath = sys.argv[2]
    outputpath = sys.argv[3]
    contents = ''
    with open(inputpath) as f:
        contents = f.read()

    with open(outputpath, 'w') as f:
        f.write(contents)
        print("done!")

def duplicate_contents():
    inputpath = sys.argv[2]
    count = int(sys.argv[3])
    contents = ''
    with open(inputpath) as f:
        contents = f.read()

    with open(inputpath, 'a') as f:
        while count > 0:
            f.write("\n" + contents)
            count -= 1
            print("done!")

def replace_string():
    inputpath = sys.argv[2]
    beforeString = sys.argv[3]
    afterString = sys.argv[4]
    contents = ''
    with open(inputpath) as f:
        contents = f.read()

    with open(inputpath, 'w') as f:
        result = contents.replace(beforeString,afterString)
        f.write(result)
        print("done!")

if __name__ == "__main__":
    main()