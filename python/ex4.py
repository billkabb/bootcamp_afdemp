import math
##Exercise 4
##
##A quadratic equation is an equation of the form:
##ax2+bx+c
##
##The roots of a quadratic equation are given by the formula:
##x=−b±b2−4ac −−−−−−−√2a
##
##Note that if b2−4ac<0
##, then no real-valued solutions exist.
##Write a program that asks the user to enter values for a, b, c,
##then prints the solutions of the quadratic equation they define,
##if they exist. If they do not exist,
##it should output an appropriate message.

lista=["a","b","c"]
list1=[]
for i in lista:
    user_in=input("Please enter a value for "+i+": ")
    list1.append(int(user_in))

a=list1[0]
b=list1[1]
c=list1[2]
#print(a,b,c)
if ((b*b)-(4*a*c)<0):
    print("no real-valued solutions exist")
    
else:
    x1= (-b + math.sqrt((b*b)-(4*a*c)))/(2*a)
    x2= (-b - math.sqrt((b*b)-(4*a*c)))/(2*a)

    print("the solutions are : " ,format(x1, '.5f')," and ",format(x2, '.5f'))
