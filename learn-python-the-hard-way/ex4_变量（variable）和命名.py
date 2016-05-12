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
