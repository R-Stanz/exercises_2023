x = input()
people  = input().split(" ")
people  = [int(i) for i in people]
minHits = people[0]
bestPerson = 1
for person in range(1, len(people)):
    if(minHits > people[person]):
        minHits     = people[person]
        bestPerson  = person + 1
print(bestPerson)
