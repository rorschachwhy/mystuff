# -*- coding: utf-8 -*-

import threading
import paramiko

HOSTNAMES = (
    # t1
    '58.68.148.50',
    '58.68.148.51'
    # "58.68.148.52",
    # "58.68.148.53",
    # t2
    # "58.68.233.90",
    # "58.68.233.91",
    # "58.68.233.92",
    # "58.68.233.93",
    # t3
    # "123.56.16.9",
    # "123.56.16.14",
    # "123.56.16.19",
    # "123.56.16.24",
    # t4
    # "58.68.148.59",
    # "58.68.148.60",
    # "58.68.148.61",
    # t5
    # "58.68.224.154",
    # "58.68.224.155",
    # "58.68.224.156",
    # t6
    # "58.68.148.57",
    # "58.68.148.58",
    # "58.68.233.94"
)


def ssh(ip, username, passwd, cmd):
    try:
        myClent = paramiko.SSHClient()
        myClent.set_missing_host_key_policy(paramiko.AutoAddPolicy())
        myClent.connect(ip, 22, username, passwd)
        for m in cmd:
            stdin, stdout, stderr = myClent.exec_command(m)
            out = stdout.readlines()
            for o in out:
                print(o)
        print('%s\tOK\n' % ip)
        myClent.close()
    except:
        print('%s\tERROR\n' % ip)

if __name__ == '__main__':
    CMD = ['mkdir testwhy']
    USERNAME = 'shbj'
    PASSWORD = 'shbj123'
    print("Begin....")
    for hostname in HOSTNAMES:
        s = threading.Thread(target=ssh, args=(
            hostname, USERNAME, PASSWORD, CMD))
        # ssh(hostname, USERNAME, PASSWORD, CMD)
        s.start()
