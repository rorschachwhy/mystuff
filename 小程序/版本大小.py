#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2017-03-02 14:31:52
# @Author  : why (1556106627@qq.com)
# @Link    : https://github.com/rorschachwhy
# @Version : 1

# 实现version compare函数，目标是对任意软件的版本号做比较，返回大的版本号，输入参数为两个版本号;
# function versionCompare(v1, v2)，v1、v2是任意软件的两个版本号


def versionCompare(v1, v2):
    try:
        arr1 = v1.split('.')
        arr2 = v2.split('.')

        min_num = min(len(arr1), len(arr2))

        # 使用最小长度，即公共长度遍历，如果发现有一位较大，即返回
        for i in range(min_num):
            if(arr1[i] > arr2[i]):
                return v1
            elif(arr1[i] < arr2[i]):
                return v2
            else:
                pass

        # 如果公共长度部分相同，返回总长度长的
        if len(arr1) > len(arr2):
            return v1
        else:
            return v2

    except Exception as e:
        print(e)


if __name__ == '__main__':
    print(versionCompare('1.3', '1.0.3.4'))
    print(versionCompare('1.2.5.4', '1.2.3.4'))
    print(versionCompare('1.2.', '1.2.3.4'))
    print(versionCompare('0.5', '1.0.3.4'))
