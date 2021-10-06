#Coding Excercise 3
#1.
print("Hello World"[8])

#2.
print("thinker"[2:5])
#Q: S=’hello’,what is the output of h[1]?
#A: You would run into an error that h is not a defined varaible-- even if you were to put "h"[1] you would run into an index out of range error

#3.
#Q: S=’Sammy’ what is the output of s[2:]”
#A: variables are case sensitive so you would run into an error that s is not defined-- if it was s="sammy" and you ran s[2:] you would return "mmy"

#4.
stringVal = "Mississippi"
stringVal = str(set(stringVal))
print(stringVal)

#5.
class Palindrome:
    def check(stringVal):
        stringVal = stringVal.replace(" ","").lower()
        reverseVal = stringVal[::-1]
        if(stringVal == reverseVal):
            return "Y"
        else:
            return "N"

listVals = []
palindromeChecker = Palindrome
output = ""
numChecks = int(input("input data: \n"))
for x in range (numChecks):
    listVals.append(input())
for x in listVals:
    print(palindromeChecker.check(x),end = " ")
    
print(output)

