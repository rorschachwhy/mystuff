# -*- coding: utf-8 -*-

import pexpect

USERNAME = 'shbj'
PASSWORD = 'shbj123'
cmd = 'sudo /opt/shbj/utility/mysqlbk_backup'
ip = '58.68.148.50'

ssh = pexpect.spawn('ssh %s@%s' % (USERNAME, ip))
try:
    i = ssh.expect(['password:', 'continue connecting (yes/no)?'], timeout=5)
    if i == 0:
        ssh.sendline(PASSWORD)
    elif i == 1:
        ssh.sendline('yes\n')
        ssh.expect('password:')
        ssh.sendline(PASSWORD)
        ssh.sendline(cmd)
        r = ssh.read()
        print(r)
except pexpect.EOF:
    print("EOF")
    ssh.close()
except pexpect.timeout:
    print("timeout")
    ssh.close()


var = input("Press any key to continue...")
