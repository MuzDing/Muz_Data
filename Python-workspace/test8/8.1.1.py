poem = '''
oh cap!
my cap
'''

fout = open('poem','wt')
#fout.write(poem)
#fout.close()
print(poem,file = fout,sep='',end='')

fout.close()