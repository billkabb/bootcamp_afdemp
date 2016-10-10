##Exercise 5
##Write a program that calculates the first five terms of the harmonic sequence, that is, the numbers:
##1
##1+1/2
##1+1/2+1/3
##1+1/2+1/3+1/4
##1+1/2+1/3+1/4+1/5
##
##These are the numbers:
##
##1
##1.5
##1.8333333333333333
##2.083333333333333
##2.283333333333333

for j in range(5):
    count1 =0
    for i in range(j+1):
        base = i+1
        count = 1/base
        count1 += count
    print(count1)
