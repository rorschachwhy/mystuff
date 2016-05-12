print('hello,world')
# name = input('please input your name:')
# print('hello',name)

a = 1
b = a
a = a + 1
print(a, b) 
print(hex(a))

print(r'\'')
print('''aa 
bb 
cc''')

s1 = "'Hello,world'"
s2 = "'Hello,\\'Adam\\''"
s3 = "r\'Hello, \"Bart\"'"
s4 = "r\'''Hello,"

print (s1)
print (s2)
print (s3)
print (s4)


# -*- coding: utf-8 -*-

height = 1.75
weight = 72
bmi = (weight/height)/height
if bmi < 18.5 :
    print('过轻')
elif bmi < 25 :
    print('正常')
elif bmi < 28 :
    print('过重')
elif bmi < 32 :
    print('肥胖')
else :
    print('严重肥胖')
	

# -*- coding: utf-8 -*-
L = ['Bart', 'Lisa', 'Adam']
for name in L:
    print('Hello, %s!' % name)
	
def my_abs (x):
	if x >= 0:
		return x
	else:
		return -x
		
print(my_abs(5))
print(my_abs(-5))
	