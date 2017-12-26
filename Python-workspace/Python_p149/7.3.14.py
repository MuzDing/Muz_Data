import struct
width,height = struct.unpack('<HH',gif[6:10])
print(width,height)