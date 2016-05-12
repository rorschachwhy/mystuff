#习题7：更多打印

print "Mary had a little lamb."
print "Its fleece was white as %s." % 'snow'
print "And everywhere that Mary went."

#打印出10个点
print "." * 10

end1 = 'C'
end2 = 'h'
end3 = 'e'
end4 = 'e'
end5 = 's'
end6 = 'e'
end7 = 'B'
end8 = 'u'
end9 = 'r'
end10 = 'g'
end11 = 'e'
end12 = 'r'


#注意逗号（comma）的用法，逗号表示“空格”
print end1 + end2 + end3 + end4 + end5 + end6,
print end7 + end8 + end9 + end10 + end11 +end12


#习题8：打印， 打印

formatter = "%r %r %r %r"

print formatter % (1, 2, 3, 4)

#注意打印出的是单引号！（python优先打印出单引号？）
print formatter % ("one", "two", "three", "four")

#注意大小写，大写的是布尔值，小写的是未知参数，要么赋值，要么加引号当字符串
print formatter % (True, 'false', False, "true")

#把formatter当字符串打印出来，注意优先使用了单引号！
print formatter %(formatter, formatter, formatter, formatter)

#
print formatter % (
    "I had this thing.",
    "That you could type up right.",
    "But it didn't sing.",
    "So I said goodnight.",
)


#习题9：打印打印打印

days = "Mon Tue Wed Thu Fri Sat Sun"

#注意里面的 \n 会导致回车
months = "Jan\nFeb\nMar\nApr\nMay\nJun\nJul\nAug"

#这种打印多个内容的，会以“空格”分开
print "Here are the days: %s" % 'aaa', days, "ddddd"

#把\n打印成回车
print "Here are the months: ", months


#三引号在打印出来时，前后都会有换行
print """
There's something going on here.
With the three double-quotes.
We'll be able to type as much as we like.
even 4 lines if we want, or 5, or 6.
"""
print "www"


#习题10：那是什么？

tabby_cat = "\tI'm tabbed in."
persian_cat = "I'm split\non a line."

#转义字符
backslash_cat = "I'm \\ a \\ cat."

#三引号
fat_cat = """
I'll do a list:
\t* Cat food
\t* Fishies
\t* Catnip\n\t* Grass
"""

print tabby_cat
print persian_cat
print backslash_cat
print fat_cat


#两个转义例子
print "I am 6'2\" tall."
print 'I am 6\'2" tall.'

