import requests
import re
from requests.exceptions import RequestException
import json
from multiprocessing import Pool

def get_one_page(url):
    try:
        response = requests.get(url)
        if response.status_code == 200:
            return response.text
        return None
    except RequestException:
        return None

def parse_one_page(html):
    pattern = re.compile('<dd>.*?board-index.*?>(\d+)</i>.*?data-src="(.*?)".*?name"><a'
                         +'.*?>(.*?)</a>.*?star">(.*?)</p>.*?releasetime">(.*?)</p>'
                         +'.*?integer">(.*?)</i>.*?fraction">(.*?)</i>.*?</dd>',re.S)
    items = re.findall(pattern,html)

    for item in items:
        yield {
            "index": items[0],
            "image": items[1],
            "title": items[2],
            "actor": items[3].strip()[3:],
            "time": items[4].strip()[5:],
            "score": items[5]+items[6]

        }
def write_to_file(content):
    with open('result.txt','a',encoding='utf-8') as f:
        f.write(json.dumps(content,ensure_ascii=False)+'\n')
        f.close()
def main(offset):
    url = 'https://maoyan.com/board/4?offset'+str(offset)
    html = get_one_page(url)
    print(html)
    parse_one_page(html)
    for item in parse_one_page(html):
        print(item)
        write_to_file(item)

if __name__=='__main__':
    pool =Pool()
    pool.map(main,[i*10 for i in range(10)])
    pool.close()
    pool.join()