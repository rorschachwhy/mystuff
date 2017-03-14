#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2017-03-14 11:12:25
# @Author  : why (1556106627@qq.com)
# @Link    : https://github.com/rorschachwhy
# @Version : $Id$

def fun(n):
    if n == 0:
        return 1
    else :
        return fun(n-1)* 2**n
        
print(fun(3))