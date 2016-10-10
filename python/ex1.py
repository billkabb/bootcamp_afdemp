a=0

for i in range(9):
    print()
    
    a=0
    for b in range(8-i):
        print(0,end="")
    while a <= i:
        print(i+1,end="")
        a+=1
