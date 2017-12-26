from urllib.request import urlopen
html = urlopen("http://www.czu.cn")
print(html.read())
