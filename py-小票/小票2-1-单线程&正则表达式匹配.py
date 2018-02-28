# -*- coding: utf-8 -*-
from urllib import request
import re

#单线程、正则表达式匹配、下载进度、下载总数

#filepath：下载的图片的目录
filepath = r'C:\Users\Rorsc\Desktop\1'

#txt存储下载链接的文件
txt = r'C:\Users\Rorsc\Desktop\1.txt'

def callbackfunc(blocknum, blocksize, totalsize):
    '''回调函数
    @blocknum: 已经下载的数据块
    @blocksize: 数据块的大小
    @totalsize: 远程文件的大小
    '''
    percent = 100.0 * blocknum * blocksize / totalsize
    if percent > 100:
        percent = 100
    print ("%.2f%%"% percent)
    
def downPic(filepath,txt):
    imgUrl=re.compile(r"((http://|https://)[\w/\.\-/]*\.(jpg|png|gif))",re.I)
    cnt=0
    with open(txt, 'r') as f:
        for line in imgUrl.findall(f.read()):
            item = line[0]  # 把末尾的'\n'删掉
            print(item)           
            try:
                filename = filepath + '\\' + str(item).split('/')[-1] # 获取图片名
                request.urlretrieve(item,filename,callbackfunc)    # 下载图片      
                cnt+=1
            except Exception as e:
                print(e)
                pass           
    print("--- %s picture ---" % cnt)

downPic(filepath,txt)
