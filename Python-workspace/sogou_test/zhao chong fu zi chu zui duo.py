def chul():
    str_in = input()
    List = [int(n) for n in str_in.split()]
    a = {}
    for i in List:
        if List.count(i)>0:
            a[i] = List.count(i)
    print(sorted(a, key=lambda x: a[x])[-1])
if __name__ == '__main__':
    chul()



