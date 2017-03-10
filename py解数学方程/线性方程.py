# -*- coding: utf-8 -*-

from sympy import *

x, y = symbols('x, y')

# 也可以分开写，注意方法没有s
# x = Symbol('x')
# y = Symbol('y')

print(solve(x * 2 - 4, x))

print(solve([2 * x - y - 3, 3 * x + y - 7], [x, y]))
