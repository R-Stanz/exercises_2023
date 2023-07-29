first_card, second_card = input().split(" ")

if(first_card == second_card):
    print(first_card)
elif(int(first_card) >= int(second_card)):
    print(first_card)
else:
    print(second_card)
