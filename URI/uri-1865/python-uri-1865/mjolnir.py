n = int(input())
for i in range (n):
    hero, force = input().split(" ")
    if(hero.lower() == "thor"):
        print("Y")
    else:
        print("N")
