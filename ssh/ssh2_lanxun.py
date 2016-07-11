# -*- coding: utf-8 -*-

import threading
import paramiko
import re

# 所有的环境名称和域名，使用dict存储
hostnames = {
    # t-1
    "t1-01": "58.68.148.50",
    "t1-02": "58.68.148.51",
    "t1-11": "58.68.148.52",
    "t1-12": "58.68.148.53",
    # t-2
    "t2-01": "58.68.233.90",
    "t2-02": "58.68.233.91",
    "t2-11": "58.68.233.92",
    "t2-12": "58.68.233.93",
    # t-3
    "t3-01": "123.56.16.9",
    "t3-02": "123.56.16.14",
    "t3-11": "123.56.16.19",
    "t3-12": "123.56.16.24",
    # t-4
    "t4-01": "58.68.148.59",
    "t4-02": "58.68.148.60",
    "t4-11": "58.68.148.61",
    # t-5
    "t5-01": "58.68.224.154",
    "t5-02": "58.68.224.155",
    "t5-11": "58.68.224.156",
    # t-6
    "t6-01": "58.68.148.57",
    "t6-02": "58.68.148.58",
    "t6-11": "58.68.233.94",
}


# 定义函数，功能是使用paramiko进行ssh连接


def ssh(envnm, ip, username, passwd, cmd, fo, fe):
    try:
        myClent = paramiko.SSHClient()
        myClent.set_missing_host_key_policy(paramiko.AutoAddPolicy())
        # 连接环境
        myClent.connect(ip, 22, username, passwd)
        # 打印出要执行的环境和命令
        print(envnm, ip, username, passwd, cmd)
        # 标准输入、输出、错误
        stdin, stdout, stderr = myClent.exec_command(cmd)
        out = stdout.readlines()
        err = stderr.readlines()
        # 循环打印出输出和错误信息，并写入文件
        for o in out:
            print(o)
            fo.write(o)
        for e in err:
            print(e)
            fe.write(e)
        print('%s\t%s\tOK\n' % (envnm, ip))
        myClent.close()
    except:
        print('%s\t%s\tERROR\n' % (envnm, ip))

if __name__ == '__main__':

    USERNAME = 'shbj'
    PASSWORD = 'shbj123'
    # 定义命令
    cmds = [ # 'echo y |deployer -d -p delivery -b 356 -t',
             # 'echo y |deployer -d -p content -b 58 -t',
             # 'echo y |deployer -d -p frontend -b 309 -t',
             # 'echo y |deployer -d -p bpm -b 137 -t',
             # 'echo y |deployer -d -p cas -b 70 -t',
             # 'echo y |deployer -d -p cds -b 127 -t',
             # 'echo y |deployer -d -p statistics -b 58 -t',
             # 'echo y |deployer -d -p thirdparty -b 11 -t'
             # 'echo y |deployer -d -p web -b 33 -t',
             'echo y |deployer -d -p rop -b 118 -t',
            # 'echo y | deployer --start -p web',
            # 'echo y | deployer --start -p thirdparty',
            # 'echo y | deployer --start -p bpm',
            # 'echo y | deployer --start -p cas',
            # 'echo y | deployer --start -p content',
            # 'echo y | deployer --start -p delivery',
            # 'echo y | deployer --start -p frontend',
            # 'echo y | deployer --start -p statistics',
            ]
    # 以写方式打开文件；文件不存在会创建；文件存在会清空内容
    fo = open('out.txt', 'w')
    fe = open('err.txt', 'w')
    print('''=========================执行非sudo命令=============================
    1、输入要操作的环境号，支持模糊匹配，如输入t1即t1-02,t1-11,t1-12，
        输入11即t1-11,t2-11,t3-11,t4-11,t5-11,t6-11
    2、输入 all 或者 t ，可以对所有环境操作
    3、可以同时输入多个环境号，如t1 t5-02 t3-12 ，使用空格分开
    ''')
    print("Begin....")
    var = input("Enter env:\n")
    if var == 'all':
        envs = ['t']
    else:
        # 根据空格分隔接收到的输入信息，存入envs
        envs = var.split()

    envsets = set([])
    for envnm in hostnames.keys():
        for env in envs:
            # 正则表达式匹配包含env的字符串
            p = re.compile(env)
            if(p.search(envnm)):
                # print(env, envnm, ip)
                # 把匹配到的环境名加入set([])集合中，可以去除重复的数据
                envsets.add(envnm)

    # 定义线程池
    cmd_threads = []
    # 遍历集合
    for envset in envsets:
        print(envset)
        # 遍历命令
        for cmd in cmds:
            #  每一条命令都建立一个线程
            s = threading.Thread(target=ssh, args=(
                envset, hostnames[envset], USERNAME, PASSWORD, cmd, fo, fe))
            # 把每个线程加入线程池
            cmd_threads.append(s)
            s.start()

    # 遍历线程池，启动线程
    # for t in cmd_threads:
    #    t.start()

    # 等待子线程全部执行完毕，主线程在执行
    for t in cmd_threads:
        t.join()

    # 关闭文件，会把所有的文件信息写入
    fo.close()
    fe.close()

    # 最后提示执行了多少个线程
    print('%s threads has been done.\n' % len(cmd_threads))
    var = input("Press any key to continue...")
