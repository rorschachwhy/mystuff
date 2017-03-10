#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2017-03-02 23:45:07
# @Author  : why (1556106627@qq.com)
# @Link    : https://github.com/rorschachwhy
# @Version : $Id$

from sympy import *

# 极限
x = Symbol('x')

a1 = ((x + 3) / (x + 2))**x
a2 = x * (sqrt(x**2 + 1) - x)

init_printing(a1)
init_printing(a2)
pprint(a2)

print(limit(a1, x, oo))
# print(x)

# 积分
t = Symbol('t')
m = integrate(sin(t) / (pi - t), (t, 0, x))
n = integrate(m, (x, 0, pi))
print(n)

