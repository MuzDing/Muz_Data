blist = [1,2,3,255]
the_bytes = bytes(blist)
print(the_bytes)

the_bytes_array=bytearray(blist)
print(the_bytes_array)

print(b'\x61')

#he_bytes[1]=127
#print(the_bytes)

the_bytes_array[1]=127
print(the_bytes_array[1])


the_bytes=bytes(range(0,256))
the_bytes_array=bytearray(range(0,256))

print(the_bytes_array)
print(the_bytes)

