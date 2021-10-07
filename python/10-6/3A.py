import random

# #1.
finalSet = []
for x in range(1500, 2701):
    if(x%7 == 0 and x%5==0):
        finalSet.append(x)

print(finalSet)

# #2.
def cToF(temperature):
    return (temperature*(9/5) + 32)

print(cToF(100))

# #3.
randVal = random.choice([1,2,3,4,5,6,7,8,9])
print("Guess a value!")
isIncorrect = True
while(isIncorrect):
    guessVal = int(input())
    if(guessVal == randVal):
        print("Guessed correctly!")
        isIncorrect = False
    else:
        print("Try Again!")

# #4-5.

for x in range (0,5):
    for y in range (x):
        print("* ", end="")
    print()

for x in range (5,0,-1):
    for y in range (x):
        print("* ", end="")
    print()

#6.
def reverseString():
    stringVal = input("Put in a string: ")
    stringVal = stringVal[::-1]
    print("The reverse is ", stringVal)


reverseString()


#7.
numOdd = 0
numEven = 0
numbers = (1, 2, 3, 4, 5, 6, 7, 8, 9)
for i in range(len(numbers)):
    if(numbers[i]%2 == 0):
        numEven += 1
    else:
        numOdd +=1
print("The number of evens: ", numEven)
print("The number of odds: ", numOdd)

#8.
datalist = [1452, 11.23, True, 'w3resource', (0, -1), [5, 12], {"class":'V', "section":'A'}]
for i in datalist:
    print(type(i), ": ", i)

#9.

for i in range(6):
    if(i==3 or i==6):
        continue
    print(i, end = " ")