
##Exercise 7
##
##The pronic numbers are those that are the product of two consecutive integers,
##so that they have the form n(n+1).
##For example, the first six pronic numbers are:
##    1×2=2
##    2×3=6
##    3×4=12
##    4×5=20
##    5×6=30
##    6×7=42
##
##Write a program that asks the user the number of pronic numbers to output,
##then goes on and prints them:
##
##Enter number of pronic numbers: 10
##2 6 12 20 30 42 56 72 90 110


user_in = int(input("please enter the number of pronic numbers to calculate : "))

list1=[]

for i in range(user_in):
    list1.append(i*(i+1))

print("The first ",user_in, " pronic nums are : ",end="")
for j in list1:
    if j != 0:
        print(j," ",end="")
