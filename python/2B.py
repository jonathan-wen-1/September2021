#Coding Exercise 4
#1.
listVals = [1, "Hello", 1.23]
print(listVals)

#2.
#The original list was [1,1[1,2]] which didn't seem like correct declaration of a list so i modified it a little bit
testList = [1,[1,2]]
print(testList[1][1])

#3.
#Q: 3.	lst=['a','b','c'] What is the result of lst[1:]?
#A: ['b', 'c']

#4. 
week = {'Monday': 1, "Tuesday" : 2, "Wednesday": 3, "Thursday": 4, "Friday" : 5, "Saturday" : 6, "Sunday" : 7}

#5.
#Q: D={‘k1’:[1,2,3]} what is the output of d[k1][1]?
#A: Assuming the [k1] is in quotations, should return 2, as it is looking for the value associated with key k1 (a list) and returning value at 
# index 1

#6. 
lst = [1,[2,3]]
tup = tuple(lst)
print(tup)

#7. This was already done in my 2A program

#8.
stringVal = "Mississippi"
stringVal = set(stringVal)
stringVal.add("x")
print(stringVal)

#9.
#Q: Output of set([1,1,2,3])
#A: {1,2,3}

#10.
finalSet = []
for x in range(2000, 3200):
    if(x%7 == 0 and x%5 !=0):
        finalSet.append(x)

for y in finalSet:
    print(y, end=", ")

#11.
def factorial(x):
	    if x == 0:
	        return 1
	    return x * factorial(x - 1)

#12.
val = int(input())
dict = {}
for x in range (1,val+1):
    dict[x] = x*x
print(dict)

#13. 
val13 = input()
lst13= val13.split()
tup13 = tuple(val13)
print(lst13)
print(tup13)
#14.
class Something(object):
    def __init(self):
        self.s==""
    def getString(self):
        self.s = input()
    def printString(self):
        print(self.s.upper())
valueClass = Something()
valueClass.getString()
valueClass.printString()