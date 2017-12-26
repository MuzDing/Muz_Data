import string
import binascii

valid_png_header = b'\x89PNG\r\x1a\n'

print(binascii.hexlify(valid_png_header))

print(binascii.unhexlify(b'89504e470d1a0a'))