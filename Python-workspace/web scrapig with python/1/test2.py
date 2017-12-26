from urllib.request import urlopen
from urllib.error import HTTPError,URLError
from bs4 import BeautifulSoup

def getTitle(url):
    try:
        html = urlopen(url)
    except HTTPError as e:
        return None
    try:
        bsObj = BeautifulSoup(html.read())
        title = bsObj.body.div
    except ArithmeticError as e:
        return None
    return title
title = getTitle("http://www.czu.cn")
if title is None:
    print("url is not found")
else:
    print(title)