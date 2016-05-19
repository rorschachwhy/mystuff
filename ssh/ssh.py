# -*- coding: utf-8 -*-

import paramiko


ssh = paramiko.SSHClient()

ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())

ssh.connect("58.68.148.50", 22, "shbj", "shbj123")

stdin, stdout, stderr = ssh.exec_command("mkdir test2")

# print stdout.readlines()

ssh.close()
var = input("Press any key to continue...")
