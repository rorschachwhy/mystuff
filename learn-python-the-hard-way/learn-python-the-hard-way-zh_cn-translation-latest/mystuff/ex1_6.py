
#ϰ��1����һ������
print "Hello World!"
print "Hello Again"
print "I like typing this."
print "This is fun."
print "Yay! Printing."
print "I'd much rather you  'not'."
print 'I "said" do not touch this.'



#ϰ��2��ע�ͺ;���

#A comment, this is so you can read your program later.
#Anything after the # is ignored by python.

print "I could have code like this." # and the comment after is ignored

#You can also use a comment to "disable" or comment out a piece of code:
#print "This won't run."

print "This will run."



#ϰ��3�����ֺ���ѧ����

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




print "��������д��100 - 25. * 3 / 4?", 100 - 25. * 3 / 4


#ϰ��4��������variable��������

#��������
cars = 100

#ÿ������������
space_in_a_car = 4.0

#˾������
drivers = 30

#�˿�����
passengers = 90

#û�б���ʻ������
cars_not_driven = cars - drivers

#����ʻ������
cars_driven = drivers

#����������
carpool_capacity = cars_driven * space_in_a_car

#ÿ��������ƽ���˿���
average_passengers_per_car = passengers / cars_driven


print "There are", cars, "cars available."
print "There are only", drivers, "drivers available."
print "There will be", cars_not_driven, "empty cars today."
print "We can transport", carpool_capacity, "people today."
print "We have", passengers, "peole to carpool today."
print "We need to put about", average_passengers_per_car, "in each car."



#ϰ��5������ı����ʹ�ӡ

#�����ʹ���˷� ASCII �ַ����������˱�����󣬼ǵ�����˼�һ�� # -- coding: utf-8 -- ��
my_name = '����'
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

#ע�⣺����ʹ���� %f���������� �� %r�� %r �����Ƿǳ����õ�һ�������ĺ����ǡ�����ʲô����ӡ��������
print "If I add %f, %d, and %d I get %r." % (
    my_age, my_height, my_weight, my_age + my_height + my_weight)


	
	
#ϰ�� 6: �ַ���(string)���ı�

x = "There are %d types of people." % 10
binary = "binary"
do_not = "don't"
y = "Those who know %s and those who %s." % (binary, do_not)

print x
print y


#�ַ�����Ƕ�ף����������ǵ����ţ�
print "I said: '%r'." % x
print "I also said: '%s'." % y

#######
#ע�������÷�
#######
hilarious = False
joke_evaluation = "Isn't that jock so funny?! %r"

print joke_evaluation % hilarious
#######

w = "This is the left said of ..."
e = "a string with a right side."

print w + e



