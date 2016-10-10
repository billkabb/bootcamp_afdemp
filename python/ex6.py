
## version 1

##user_in = int(input("please enter the number of triangular numbers to calculate : "))
##print("The first ",user_in," triangular numbers are : ",end="")
##for i in range(user_in):
##    j=i+1
##    print(int((j*(j+1))/2)," ",end="")


##version 2
user_in = int(input("please enter the number of triangular numbers to calculate : "))
print("The first ",user_in," triangular numbers are : ",end="")
list1=[]
for i in range(user_in):
    j=i+1
    list1.append(int((j*(j+1))/2))
    #print(int((j*(j+1))/2)," ",end="")
for k in list1:
    print(k," ",end="")
