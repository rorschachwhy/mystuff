
#习题1：第一个程序
print "Hello World!"
print "Hello Again"
print "I like typing this."
print "This is fun."
print "Yay! Printing."
print "I'd much rather you  'not'."
print 'I "said" do not touch this.'



#习题2：注释和井号

#A comment, this is so you can read your program later.
#Anything after the # is ignored by python.

print "I could have code like this." # and the comment after is ignored

#You can also use a comment to "disable" or comment out a piece of code:
#print "This won't run."

print "This will run."



#习题3：数字和数学计算

print "I will now count my chichens:"

print "Hens", 25 + 30 / 6
print "Rooters", 100 - 25 * 3 / 4

print "Mow I will count the eggs:"

print 3 + 2 + 1 - 5 +4 % 2 - 1 / 4 + 6

print "Is it true that 3 + 2 < 5 - 7?"

print 3 + 2 < 5 - 7

print "What is 3 + 2?", 3 + 2
print "What is 5 - 7?", 5 - 7

print "Oh, that's why it's False."

print "How about some more."

print "Is it greater?", 5 > -2
print "Is it grester or equal?", 5 >= -2
print "Is it less or equal?", 5 <= -2




print "浮点数重写：100 - 25. * 3 / 4?", 100 - 25. * 3 / 4


#习题4：变量（variable）和命名

#汽车总数
cars = 100

#每个汽车的容量
space_in_a_car = 4.0

#司机总数
drivers = 30

#乘客总数
passengers = 90

#没有被驾驶的汽车
cars_not_driven = cars - drivers

#被驾驶的汽车
cars_driven = drivers

#汽车总容量
carpool_capacity = cars_driven * space_in_a_car

#每辆汽车的平均乘客数
average_passengers_per_car = passengers / cars_driven


print "There are", cars, "cars available."
print "There are only", drivers, "drivers available."
print "There will be", cars_not_driven, "empty cars today."
print "We can transport", carpool_capacity, "people today."
print "We have", passengers, "peole to carpool today."
print "We need to put about", average_passengers_per_car, "in each car."



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


	
	
#习题 6: 字符串(string)和文本

x = "There are %d types of people." % 10
binary = "binary"
do_not = "don't"
y = "Those who know %s and those who %s." % (binary, do_not)

print x
print y


#字符串的嵌套，最里层的总是单引号？
print "I said: '%r'." % x
print "I also said: '%s'." % y

#######
#注意这种用法
#######
hilarious = False
joke_evaluation = "Isn't that jock so funny?! %r"

print joke_evaluation % hilarious
#######

w = "This is the left said of ..."
e = "a string with a right side."

print w + e



