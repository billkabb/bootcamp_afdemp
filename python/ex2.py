
##
##Exercise 2
##
##Write a program that asks the user to provide
##different numbers of banknotes and coins,
##from €50 to €1.
##Then output the total sum in euros. For example:
##
##Enter number of 50 euro banknotes: 10
##Enter number of 20 euro banknotes: 20
##Enter number of 10 euro banknotes: 30
##Enter number of 5 euro banknotes: 40
##Enter number of 2 euro coins: 50
##Enter number 1 euro coints: 60
##You have 1560 euros.
#################################


sum1=0
sum_total=0
list1=[50,20,10,5,2,1]

for i in list1:
        
    sum1=int(input("Enter number of "+str(i)+" euro banknotes: "))
    b=sum1*i
    
    sum_total=b+sum_total

print("You have ",sum_total," euros.")
