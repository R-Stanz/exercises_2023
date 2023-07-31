age_1 = int(input())
age_2 = int(input())

if((age_1 < 6) or (age_2 < 6)):
    print("NO")

elif((age_1 >= 18) or (age_2 >= 18) or
     ((age_1 >= 14) and (age_2 >= 14))):

    print("YES")

else:
    print("NO")
