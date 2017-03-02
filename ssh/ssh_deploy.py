# -*- coding: utf-8 -*-

import threading
import paramiko
import re

hostnames = {
    # t1
    # "t101": "58.68.148.50",
    "t102": "58.68.148.51",
    "t111": "58.68.148.52",
    "t112": "58.68.148.53",
    # t2
    # "t201": "58.68.233.90",
    "t202": "58.68.233.91",
    "t211": "58.68.233.92",
    "t212": "58.68.233.93",
    # t3
    # "t301": "123.56.16.9",
    "t302": "123.56.16.14",
    "t311": "123.56.16.19",
    "t312": "123.56.16.24",
    # t4
    # "t401": "58.68.148.59",
    "t402": "58.68.148.60",
    "t411": "58.68.148.61",
    # t5
    # "t501": "58.68.224.154",
    "t502": "58.68.224.155",
    "t511": "58.68.224.156",
    # t6
    # "t601": "58.68.148.57",
    "t602": "58.68.148.58",
    "t611": "58.68.233.94",
}


def ssh(envnm, ip, username, passwd, cmd):
    try:
        myClent = paramiko.SSHClient()
        myClent.set_missing_host_key_policy(paramiko.AutoAddPolicy())
        myClent.connect(ip, 22, username, passwd)
        for m in cmd:
            stdin, stdout, stderr = myClent.exec_command(cmd)
            out = stdout.readlines()
            err = stderr.readlines()
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
    PASSWORD = 'XXXX'
    CMD = ['sudo /opt/shbj/utility/mysqlbk_backup', 'mkdir test52627']

    print('''=========================备份数据库=============================
    1、输入要备份的环境号，支持模糊匹配，如输入t1即t102,t111,t112，输入t11即t111,t112
    2、输入 all 或者 t ，可以对所有环境操作
    3、可以同时输入多个环境号，如t1 t502 t312 ，使用空格分开
    ''')
    print("Begin....")
    var = input("Enter env:\n")
    if var == 'all':
        envs = ['t']
    else:
        envs = var.split()

    threads = []
    for (envnm, ip) in hostnames.items():
        for env in envs:
            p = re.compile(env)
            if(p.search(envnm)):
                # print(env, envnm, ip)
                s = threading.Thread(target=ssh, args=(
                    envnm, ip, USERNAME, PASSWORD, CMD))
                threads.append(s)

    for t in threads:
        t.start()
    for t in threads:
        t.join()
    print('%s environment has been changed.\n' % len(threads))
    var = input("Press any key to continue...")
