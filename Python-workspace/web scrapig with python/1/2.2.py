from urllib.request import urlopen
from bs4 import BeautifulSoup
from bs4 import Comment


html = urlopen("http://www.pythonscraping.com/pages/warandpeace.html")
#bsObj = BeautifulSoup(html)
bsObj = Comment(html)
print(bsObj)
#nameList = bsObj.find_all("span",{'class':'green'})
#nameList = bsObj.find_all("h1","h2","h3")
#nameList = bsObj.find_all({'class':{'green','red'}})
#nameList = bsObj.find_all("div",{'class':'s_tab'})
#nameList = bsObj.find_all(text='the prince')
#nameList = bsObj.findAll(class_ = "green")
nameList = bsObj.findAll("",{'class':'green'})
#for name in nameList:
    #print(name.get_text())

#allText = bsObj.findAll("",{"id":"text"})

#print(allText[0].get_text())
#print(len(nameList))