n = int(input())
for i in range(n):
    p1, p1Choice, p2, p2Choice = input().split(" ")
    p1Numb, p2Numb = input().split(" ")
    p1Numb, p2Numb = int(p1Numb), int(p2Numb)
    if(p1Choice.lower() == "par"):
        if((p1Numb + p2Numb) % 2 == 0):  print(p1)
        else:                            print(p2)
    else:
        if((p1Numb + p2Numb) % 2 == 0):  print(p2)
        else:                            print(p1)
