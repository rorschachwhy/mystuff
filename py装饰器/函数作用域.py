#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2017-03-08 16:03:51
# @Author  : why (1556106627@qq.com)
# @Link    : https://github.com/rorschachwhy
# @Version : $Id$

passline = 60


def fun(val):
    print('%x' % id(val))
    passline = 90
    if val >= passline:
        print('pass')
    else:
        print('failed')

    def in_func():
        print(val)
    in_func()
    return in_func


print(passline)

f = fun(89)
f()  # in_func
print(f.__closure__)
