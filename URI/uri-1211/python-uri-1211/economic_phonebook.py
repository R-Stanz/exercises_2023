while(True):

    try:
        iterations = int(input())

        if(iterations < 1):
            break
    except:
        break

    numbs = []
    for i in range(iterations):
        numbs += [input()]
    numbs = sorted(numbs)

    saved = 0
    for i in range(iterations - 1):
        for j in range(len(numbs[i])):
            numb        = numbs[i]
            next_numb   = numbs[i+1]
            if(numb[j] == next_numb[j]):
                saved += 1
            else:
                break
    print(saved)
