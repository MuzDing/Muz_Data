try:
    my_file = open('/path/to/filename','r')
    contents= my_file.read()
finally:
    my_file.close()