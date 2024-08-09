import sys
import markdown

def main():
    if sys.argv[1] == "markdown":
        convert()
    else:
        print(sys.argv[2])
        print("ERROR: Your input is not correct")


def convert():
    inputfile = sys.argv[2]
    outputfile = sys.argv[3]
    contents = ''

    with open(inputfile, 'r', encoding='utf-8') as f:
        contents = f.read()

    with open(outputfile, 'x') as f:
        result = markdown.markdown(contents)
        f.write(result)

if __name__ == "__main__":
    main()