iterations = int(input())

for i in range(iterations):

    numb_of_people, steps_size = [int(i) for i in input().split(" ")]

    circle = [i+1 for i in range(numb_of_people)]

    last_death = 0
    while(len(circle) != 1):
        next_death = (last_death + steps_size - 1) % len(circle)
        circle.pop(next_death)
        last_death = next_death

    print("Case " + str(i+1) + ": " + str(circle.pop()))
