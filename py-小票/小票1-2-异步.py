# -*- coding: utf-8 -*-
from urllib import request
import asyncio

#异步方式
#filepath：下载的图片的目录
filepath = r'C:\Users\Rorsc\Desktop\1'
#txt存储下载链接的文件
txt = r'C:\Users\Rorsc\Desktop\1.txt'

@asyncio.coroutine
def downPic(filepath,item):
    print(item)           
    try:
        filename = filepath + '\\' + item.split('/')[-1] # 获取图片名
        yield from request.urlretrieve(item,filename)    # 下载图片            
    except Exception as e:
        print('%s'%item,e)
        pass           
loop = asyncio.get_event_loop()
with open(txt, 'r') as f:
    tasks = [downPic(line.strip(),filepath) for line in f.readlines()]
loop.run_until_complete(asyncio.wait(tasks))
loop.close()
