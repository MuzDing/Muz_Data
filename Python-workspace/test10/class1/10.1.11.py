import os
os.remove('oops.txt')
print(os.path.isfile('oops.txt'))