#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2017-03-03 16:59:49
# @Author  : why (1556106627@qq.com)
# @Link    : https://github.com/rorschachwhy
# @Version : $Id$

from sympy import *

x1, x2, x3 = symbols('x1, x2, x3')
a11, a12, a13, a22, a23, a33 = symbols(
    'a11, a12, a13, a22, a23, a33')

m = Matrix([[x1, x2, x3]])
n = Matrix([[a11, a12, a13], [a12, a22, a23], [a13, a23, a33]])
v = Matrix([[x1], [x2], [x3]])

f = m * n * v
print(f)
pprint(f)
print(f[0])
pprint(f[0])

print(f[0].subs({x1: 1, x2: 1, x3: 1}))
