import subprocess
import os
print(os.getpid())
print(os.getcwd())
print(os.getuid())
print(os.getgid())

ret = subprocess.getoutput('date')
print(ret)

ret = subprocess.getoutput('date -u')
print(ret)

ret =subprocess.getoutput('date -u|wc')
print(ret)

ret= subprocess.check_output(['date','-u'])
print(ret)

ret = subprocess.getstatusoutput('date')
print(ret)

ret = subprocess.call('date')
print(ret)

ret = subprocess.call('date -u',shell=True)
print(ret)

ret = subprocess.call(['date','-u'])
print(ret)

#open('10.3.2.py','wt')