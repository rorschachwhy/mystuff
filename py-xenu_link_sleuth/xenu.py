#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-02-05 11:00:00
# @Author  : why (1556106627@qq.com)
# @Link    : https://github.com/rorschachwhy
# @Version : $Id$
# weibo 

import requests
import sys
import re
from bs4 import BeautifulSoup


def check_dead_links(url):
    headers = {
        'Upgrade-Insecure-Requests': '1',
        'User-Agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.119 Safari/537.36',
        'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8',
        'Accept-Language': 'zh-CN,zh;q=0.9',
        'Accept-Encoding': 'gzip, deflate, br',
        'Connection': 'keep-alive',
        'Cache-Control': 'max-age=0',
        'Cookie': 'SUB=_2AkMtAjl3f8NxqwJRmPwdz2njbIt-yAvEieKbXsisJRMxHRl-yT9jqmgStRB6BoIXmKYXOoGyrZc5mZCETjaoCuldm_SV; SUBP=0033WrSXqPxfM72-Ws9jqgMF55529P9D9WFSbHOoHWfbUW6bARJylymW; SINAGLOBAL=6481293759199.948.1516156481980; UOR=,,jy5.sxl.cn; TC-Page-G0=6fdca7ba258605061f331acb73120318; TC-V5-G0=52dad2141fc02c292fc30606953e43ef; YF-V5-G0=69afb7c26160eb8b724e8855d7b705c6; YF-Page-G0=86b4280420ced6d22f1c1e4dc25fe846; _s_tentry=-; Apache=276772398374.20984.1517803951272; ULV=1517803951607:3:1:1:276772398374.20984.1517803951272:1516632859813; login_sid_t=4159b9f0176db1dea33138e7ebf1c9dd; cross_origin_proto=SSL; YF-Ugrow-G0=56862bac2f6bf97368b95873bc687eef; wb_cusLike_3655689037=N',
    }

    r1 = requests.get(url, headers=headers)  # 发送请求

    soup = BeautifulSoup(r1.text, 'lxml')  # 得到soup对象
    # metas = soup.head.findAll("meta")
    # print(metas)

    # yn = soup.head.find("meta", {"name":re.compile("description")})

    description = soup.head.find("meta", {"name": ("description")})

    # print(description)

    if description is None:
        return (False)
    else:
        return (True)


# 关闭文件
def closefile(successFile, failFile):
    successFile.close()
    failFile.close()


if __name__ == '__main__':
    init_url_paths_nologin = set()  # 未登陆url集合
    init_url_paths_login = set()  # 需要登陆才可访问的初始url集合

    successFile = open('./success.txt', 'w')
    failFile = open('./fail.txt', 'w')
    exceptionFile = open('./exception.txt', 'w')

    with open(sys.argv[1], 'r') as f:
        line = f.readline()

        while line:

            line = line.strip(' ')
            line = line.rstrip('\n')

            if re.match(r'^(https?|ftp|file)://.+$', line):
                try:
                    # 转化http为https
                    httpsUrl = line.replace('http:', 'https:')
                    print(httpsUrl)

                    # 判断是否可以正常打开
                    if (check_dead_links(httpsUrl)):
                        # 存储访问成功的页面url
                        successFile.write(line)
                        successFile.write('\n')
                        successFile.flush()
                        print("success")
                    else:
                        # 存储访问失败的页面url
                        failFile.write(line)
                        failFile.write('\n')
                        failFile.flush()
                        print("fail")
                except Exception as e:
                    # 存储访问异常的页面url
                    exceptionFile.write(line)
                    exceptionFile.write('\n')
                    exceptionFile.flush()
                    print("exception")

            line = f.readline()

    closefile(successFile, failFile)
