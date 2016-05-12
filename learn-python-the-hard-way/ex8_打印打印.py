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
