import math

##Exercise 3
##
##If we want to calculate the area of a triange given its sides,
##we can use Heron's formula, which is:
##A=14(a+b+c)(−a+b+c)(a−b+c)(a+b−c)−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−√
##where a, b, and c,
##are the three sides of the triangle.
##Write a program that asks the user for the three sides and calculates its area. Note that to calculate the square root in Python you have to include the line
##Note that to calculate the square root in Python you have to include the line
##import math
##at the beginning of your program.
##Then, the square root of, say, r, is math.sqrt(r).


list1=[]
for i in range(3):
    user_in=input("Please enter length for side "+str(i+1)+": ")
    list1.append(int(user_in))

a=list1[0]
b=list1[1]
c=list1[2]
area=math.sqrt((a+b+c)*((-a)+b+c)*(a-b+c)*(a+b-c))/4
print("Area of given triangle is : ",format(area, '.2f'))
