str_number = input()
number = str_number.split()

float_number = float(str_number)

if(str_number[0] == "-"):
    answer = ["-"]
    number.pop(0)
else:
    answer = ["+"]

distance_to_zero        = 0
digits_on_notation      = 0
digit_after_precision   = 0
after_precision         = False

if(float_number == 0):
    answer += ["0", "."]
    digits_on_notation += 1
    after_precision = True

else:

    digit_after_zero    = False
    has_first_digit     = False

    for digit in str_number:

        if(digit == "."):
            digit_after_zero = True

        elif(has_first_digit):
            if(digits_on_notation < 5):
                answer              += digit
                digits_on_notation  += 1
            if(not digit_after_zero):
                distance_to_zero    += 1

        elif(digit != "-" and digit != "+"):
            if(digit != "0"):
                has_first_digit = True
                answer += digit + "."
                digits_on_notation  += 1
            if(digit_after_zero):
                distance_to_zero    -= 1

        if(digit_after_zero and digits_on_notation == 5):
            if(after_precision):
                digit_after_precision = int(digit)
                break
            else:
                after_precision = True


for i in range(digits_on_notation, 5):
    answer += "0"

if(digit_after_precision >= 5):
    answer[-1] = str(int(answer[-1]) + 1)


if(distance_to_zero >= 0):
    answer += "E+"
else:
    answer += "E-"
    distance_to_zero *= -1


if(distance_to_zero < 10):
    answer += "0"

answer += str(distance_to_zero)

print(''.join(answer))
