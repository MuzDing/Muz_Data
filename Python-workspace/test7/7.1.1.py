def unicode_test(value):
    import unicodedata
    name = unicodedata.name(value)
    value2 = unicodedata.lookup(name)
    print('value= "%s",name = "%s",value2 = "%s"' %(value,name,value2))

unicode_test('a')

snowman = '\u2603'

print(snowman)
print(len(snowman))

ds = snowman.encode('utf-8')
print(ds)
print(len(ds))

