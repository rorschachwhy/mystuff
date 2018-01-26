#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2017-05-01 15:22:03
# @Author  : why (1556106627@qq.com)
# @Link    : https://github.com/rorschachwhy
# @Version : $Id$


# while(True):
#     a = int(input("Please enter an integer a: "))
#     b = int(input("Please enter an integer b: "))
#     if(a > b):
#         print("请重新输入")


a = int(input("please input number a:\n"))
b = int(input("please input number b:\n"))
if b > a:
    for i in range(1, 10):
        for j in range(0, 10):
            for k in range(0, 10):
                if i * 100 + j * 10 + k == i**3 + j**3 + k**3 and i * 100 + j * 10 + k >= a and i * 100 + j * 10 + k <= b:
                    print(i * 100 + j * 10 + k)
