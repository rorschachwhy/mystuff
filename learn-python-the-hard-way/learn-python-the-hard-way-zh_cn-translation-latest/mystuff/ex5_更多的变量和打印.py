#习题5：更多的变量和打印

#如果你使用了非 ASCII 字符而且碰到了编码错误，记得在最顶端加一行 # -- coding: utf-8 -- 。
my_name = '海洋'
my_age = 35.1 # not a lie
my_height = 74 # inches
my_weight = 180 #lbs
my_eyes = 'Blue'
my_teeth = 'White'
my_hair = 'Brown'


print "Let's talk about %s." % my_name
print "He's %d inche tall." % my_height
print "He's %d pounds heavy." % my_weight
print "Actually that's not too heavy."
print "He's got %s eyes and %s hair." %(my_eyes, my_hair)
print "His teeth are usually %s depending on the coffee." % my_teeth

#this line is trichy, try to get it exactly right

#注意：这里使用了 %f（浮点数） 和 %r（ %r 就是是非常有用的一个，它的含义是“不管什么都打印出来”）
print "If I add %f, %d, and %d I get %r." % (
    my_age, my_height, my_weight, my_age + my_height + my_weight)
