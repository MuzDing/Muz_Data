# -*- coding:utf-8 -*-  
__author__ = 'Muz'
__date__ = '18-4-26 下午8:40'


import requests,json
class YunPian(object):
    def __init__(self,api_key):
        self.api_key=api_key
        self.single_send_url='https://sms.yunpian.com/v2/sms/single_send.json'

    def send_sms(self,code,mobile):
        parmas={
            'apikey':self.api_key,
            'mobile':mobile,
            'text':'【丁丁网】您的验证码是{code}。如非本人操作，请忽略本短信'.format(code=code)
        }
        #text必须要跟云片后台的模板内容 保持一致，不然发送不出去！
        r=requests.post(self.single_send_url,data=parmas)
        re_dict=json.loads(r.text)
        print(re_dict)



