import  os
os.mkdir('poems')
print(os.listdir('poems'))

os.mkdir('poems/mcintype')
print(os.listdir('poems'))

fout = open('poems/mcintype/mans','wt')
fout.write('''
oh cap,
my cap!
''')

print(os.listdir('pomes/mcintype'))