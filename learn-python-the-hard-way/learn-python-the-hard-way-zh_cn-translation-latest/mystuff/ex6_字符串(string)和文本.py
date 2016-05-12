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
