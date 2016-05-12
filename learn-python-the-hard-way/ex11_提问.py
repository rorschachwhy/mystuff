#习题11：提问

print "How old are you?"
age = raw_input()

#注意这个疑问句，print语句后面有一个“逗号”，所以不会换行
#可以试着输入6'2"来查看输出，you're '6\'2"'tall
print "How tall are you?",

#这是一个赋值语句，把“逗号”也赋值给了height【并不是上面的不换行的意思】
height = raw_input(),
print "How much do you weight?"
weight = raw_input()

print "So, you're %r old, %r tall and %r heavy." % (
    age, height, weight)




