# -*- coding: utf-8 -*-

import threading
import paramiko

hostnames = {
    # t1
    "t101": "58.68.148.50",
    "t102": "58.68.148.51",
    "t111": "58.68.148.52",
    "t112": "58.68.148.53",
    # t2
    "t201": "58.68.233.90",
    "t202": "58.68.233.91",
    "t211": "58.68.233.92",
    "t212": "58.68.233.93",
    # t3
    "t301": "123.56.16.9",
    "t302": "123.56.16.14",
    "t311": "123.56.16.19",
    "t312": "123.56.16.24",
    # t4
    "t401": "58.68.148.59",
    "t402": "58.68.148.60",
    "t411": "58.68.148.61",
    # t5
    "t501": "58.68.224.154",
    "t502": "58.68.224.155",
    "t511": "58.68.224.156",
    # t6
    "t601": "58.68.148.57",
    "t602": "58.68.148.58",
    "t611": "58.68.233.94",
}


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
    CMD = ['rm -r test526', '']
    USERNAME = 'shbj'
    PASSWORD = 'shbj123'
    print("Begin....")
    # env = input("Enter env")
    threads = []
    for hostname in hostnames.values():
        s = threading.Thread(target=ssh, args=(
            hostname, USERNAME, PASSWORD, CMD))
        threads.append(s)
    for t in threads:
        t.start()
    for t in threads:
        t.join()
    var = input("Press any key to continue...")
