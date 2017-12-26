import  configparser
cfp = configparser.ConfigParser()
cfp.read('settings.cfg')
['settings.cfg']
print(cfp['french'])
