#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import paramiko


ssh = paramiko.SSHClient()

ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())

ssh.connect("58.68.224.156", 22, "shbj", "shbj123")

stdin, stdout, stderr = ssh.exec_command("mkdir test")

# print stdout.readlines()

ssh.close()
