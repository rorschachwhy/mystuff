#ϰ��7�������ӡ

print "Mary had a little lamb."
print "Its fleece was white as %s." % 'snow'
print "And everywhere that Mary went."

#��ӡ��10����
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


#ע�ⶺ�ţ�comma�����÷������ű�ʾ���ո�
print end1 + end2 + end3 + end4 + end5 + end6,
print end7 + end8 + end9 + end10 + end11 +end12


#ϰ��8����ӡ�� ��ӡ

formatter = "%r %r %r %r"

print formatter % (1, 2, 3, 4)

#ע���ӡ�����ǵ����ţ���python���ȴ�ӡ�������ţ���
print formatter % ("one", "two", "three", "four")

#ע���Сд����д���ǲ���ֵ��Сд����δ֪������Ҫô��ֵ��Ҫô�����ŵ��ַ���
print formatter % (True, 'false', False, "true")

#��formatter���ַ�����ӡ������ע������ʹ���˵����ţ�
print formatter %(formatter, formatter, formatter, formatter)

#
print formatter % (
    "I had this thing.",
    "That you could type up right.",
    "But it didn't sing.",
    "So I said goodnight.",
)


#ϰ��9����ӡ��ӡ��ӡ

days = "Mon Tue Wed Thu Fri Sat Sun"

#ע������� \n �ᵼ�»س�
months = "Jan\nFeb\nMar\nApr\nMay\nJun\nJul\nAug"

#���ִ�ӡ������ݵģ����ԡ��ո񡱷ֿ�
print "Here are the days: %s" % 'aaa', days, "ddddd"

#��\n��ӡ�ɻس�
print "Here are the months: ", months


#�������ڴ�ӡ����ʱ��ǰ�󶼻��л���
print """
There's something going on here.
With the three double-quotes.
We'll be able to type as much as we like.
even 4 lines if we want, or 5, or 6.
"""
print "www"


#ϰ��10������ʲô��

tabby_cat = "\tI'm tabbed in."
persian_cat = "I'm split\non a line."

#ת���ַ�
backslash_cat = "I'm \\ a \\ cat."

#������
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


#����ת������
print "I am 6'2\" tall."
print 'I am 6\'2" tall.'

