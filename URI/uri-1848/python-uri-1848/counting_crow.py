for scream in range(3):
    line = input()
    summ = 0
    while(line[0] != "c"):
        for i in range(3):
            if(line[i] == "*"):
                summ += 1 << (2 - i)
        line = input()
    print(summ);
