fin = open('poem','rt')
poem = fin.read()
fin.close()
print(poem)

poem = ''
fin = open('poem','rt')
poem = fin.read(10)
fin.close()
print(poem)

with open('poem','rt') as font :
    font.write(poem)