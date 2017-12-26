import binascii

hex_str='4798232348928bab723ba4723ba273b4'+ \
        '12712467154672354672354762354623'

gif =binascii.unhexlify(hex_str)
print(len(gif))