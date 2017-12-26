with open('bfile','wb') as bfile:
    m_str=bytes(range(256))
    bfile.write(m_str)

fin = open('bfile','rb')

#print(fin.tell())

print(fin.seek(1))

bdata = fin.read()
print(len(bdata))
print(bdata[0])


