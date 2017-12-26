import re;

def pipei(str1,str2):
    m = re.match(str1, str2)
    if m is not None:
        print(m.group())

def pipei1(str1,str2):
    m = re.search(str1, str2)
    if m is not None:
        print(m.group())
bt = 'bat|bet|bit'
pipei(bt,'bat')
pipei1(bt,'he bit me bat')

anyend = '.med'
pipei(anyend,'bmed')

pipei(anyend,'med')
pipei(anyend,'\nmed')

pipei1(anyend,'i med')

pipei('3\.14','3.14')
pipei('3\.14','3014')
patt = '\w+@(\w+\.)*\w+\.com'
pipei(patt,'ld56888@163.com')
pipei(patt,'ld56888@163.a.com')
pipei(patt,'ld56888@163.a.b.com')

pipei('\w\w\w-\d\d\d','xyz-123')

m = re.match('(\w\w\w)-(\d\d\d)', 'abc-123')
print(m.group())
# 完整匹配
'abc-123'
print(m.group(1))
# 子组 1
'abc'
print(m.group(2))
# 子组 2
'123'
print(m.groups())
# 全部子组
('abc', '123')

s = 'This and that.'
print(re.findall(r'(th\w+) and (th\w+)', s, re.I))

print(re.sub('X', 'Mr. Smith', 'attn: X\n\nDear X,\n'))
print(re.subn('X', 'Mr. Smith', 'attn: X\n\nDear X,\n'))
print(re.sub('[ae]', 'X', 'abcdef'))
print(re.subn('[ae]', 'X', 'abcdef'))
