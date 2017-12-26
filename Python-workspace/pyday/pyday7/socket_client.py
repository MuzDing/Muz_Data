#客户端
import socket
import sys
client = socket.socket() #声明socket类型，同时生成socket连接对象
client.connect(('localhost',9999))

while True:
    msg = input(">>:").strip()
    if len(msg) == 0:
        continue
    client.send(msg.encode("utf-8"))
    data = client.recv(10240)
    print("recv:",data.decode())

client.close()

