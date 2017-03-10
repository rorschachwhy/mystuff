#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2017-03-03 16:15:24
# @Author  : why (1556106627@qq.com)
# @Link    : https://github.com/rorschachwhy
# @Version : $Id$

from sympy import *

f = Function('f')
x = Symbol('x')

pprint(diff(f(x), x))
pprint(diff(f(x), x, 2))

# 分别求x**3的1阶、2阶、3阶导数
pprint(diff(x**3, x, 1))
pprint(diff(x**3, x, 2))
pprint(diff(x**3, x, 3))


pprint(dsolve(diff(f(x), x) - 2 * x * f(x), f(x)))
print(dsolve(diff(f(x), x) - 2 * x * f(x), f(x)))


