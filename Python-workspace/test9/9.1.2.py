import urllib.request as ur
url = 'http://www.iheartquotes.com/api/v1/random'
conn = ur.urlopen(url)
print(conn.start)