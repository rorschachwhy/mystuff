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
