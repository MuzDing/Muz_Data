import csv
villains = [
    ['Doctor','NO'],
    ['Rosa','klebb'],
    ['Mister','Big'],
    ['Auric','Goldfinger'],
]

with open('villains','wt') as font:
    csvout = csv.writer(font)
    csvout.writerows(villains)

import csv
with open('villains','rt') as fin:
    cin = csv.reader(fin)
    villains = [row for row in cin]

print(villains)

import csv
with open('villains','rt') as fin:
    cin = csv.DictReader(fin,fieldnames=['first','last'])
    villains=[row for row in cin]
print(villains)