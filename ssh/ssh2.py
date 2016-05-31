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


def ssh(envnm, ip, username, passwd, cmd):
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
        # 循环打印出输出和错误信息
        for o in out:
            print(o)
        for e in err:
            print(e)
        print('%s\t%s\tOK\n' % (envnm, ip))
        myClent.close()
    except:
        print('%s\t%s\tERROR\n' % (envnm, ip))

if __name__ == '__main__':

    USERNAME = 'shbj'
    PASSWORD = 'shbj123'
    cmds = ['echo y | deployer --start -p web',
            'echo y | deployer --start -p thirdparty',
            'echo y | deployer --start -p bpm',
            'echo y | deployer --start -p cas',
            'echo y | deployer --start -p content',
            'echo y | deployer --start -p delivery',
            'echo y | deployer --start -p frontend',
            'echo y | deployer --start -p statistics',
            ]
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
        envs = var.split()

    threads = []
    envsets = set([])
    for envnm in hostnames.keys():
        for env in envs:
            p = re.compile(env)
            if(p.search(envnm)):
                # print(env, envnm, ip)
                envsets.add(envnm)
    for envset in envsets:
        print(envset)
        for cmd in cmds:
            #  print(cmd)
            s = threading.Thread(target=ssh, args=(
                envset, hostnames[envset], USERNAME, PASSWORD, cmd))
            threads.append(s)

    for t in threads:
        t.start()
    for t in threads:
        t.join()
    print('%s threads has been done.\n' % len(threads))
    var = input("Press any key to continue...")
