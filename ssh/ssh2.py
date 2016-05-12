#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import paramiko
import threading

def ssh2(ip,username,passwd,cmd):
	try:
		myClent = paramiko.SSHClient()
		myClent.set_missing_host_key_policy(paramiko.AutoAddPolicy())
		myClent.connect(ip,22,username,passwd)
		for m in cmd:
			stdin,stdout,stderr = myClent.exec_command(m)
			out = stdout.readlines()
			for o in out:
				print (o)
		print ('%s\tOK\n' % ip)
		myClent.close()
	except:
		print ('%s\tERROR\n' % ip )

if __name__=='__main__':
	cmd= ['mkdir testwhy']
	s= ssh2("58.68.224.156", 22, "shbj", "shbj123")
	print(s)
