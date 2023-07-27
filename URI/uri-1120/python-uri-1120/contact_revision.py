while(True):

    broken_digit, number = input().split(" ")

    if(broken_digit == "0" and number == "0"):
        break

    corrected_number = ""

    for digit in number:
        if(digit != broken_digit):
            corrected_number += digit

    if(corrected_number == ""):
        print(0)
    else:
        print(int(corrected_number))
