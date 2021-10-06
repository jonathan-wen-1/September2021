class Crowd:

   def testCrowded(listPeople):
       if(len(listPeople) >5):
           print("This is a mob")
       elif(len(listPeople) >= 3):
           print("This room is crowded")
       elif(len(listPeople) >=1):
            print("This room is not crowded")
       else:
            print("This room is empty")

listOfPeople = ["jon", "jerry", "joan", "jocelyn", "jack", "jasmine"]
crowdModify = Crowd
crowdModify.testCrowded(listOfPeople)
listOfPeople.remove("joan")
listOfPeople.remove("jocelyn")
crowdModify.testCrowded(listOfPeople)
listOfPeople.remove("jack")
listOfPeople.remove("jasmine")
crowdModify.testCrowded(listOfPeople)
listOfPeople.remove("jerry")
listOfPeople.remove("jon")
crowdModify.testCrowded(listOfPeople)
