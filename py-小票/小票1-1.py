# -*- coding: utf-8 -*-
from urllib import request

#filepath：下载的图片的目录
filepath = r'C:\Users\Rorsc\Desktop\1'

#txt存储下载链接的文件
txt = r'C:\Users\Rorsc\Desktop\1.txt'

def downPic(filepath,txt):
    
    with open(txt, 'r') as f:
        for line in f.readlines():
            item = line.strip()  # 把末尾的'\n'删掉
            print(item)           
            try:
                filename = filepath + '\\' + item.split('/')[-1] # 获取图片名
                request.urlretrieve(item,filename)    # 下载图片            
            except Exception as e:
                print('%s'%item,e)
                pass           

downPic(filepath,txt)
