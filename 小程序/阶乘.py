#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2017-03-09 11:59:27
# @Author  : why (1556106627@qq.com)
# @Link    : https://github.com/rorschachwhy
# @Version : $Id$


def jiecheng(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * jiecheng(n - 1)


print(jiecheng(5))

print(2**16)