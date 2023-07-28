digits = [str(i) for i in range(10)]

while(True):
    try:
        number = input()

        if(number == ""):
            break

        digit_count = [0 for i in range(10)]

        for number_digit in number:
            for digit in digits:
                if(digit == number_digit):
                    digit_count[int(digit)] += 1
                    break

        biggest_digit_count = digit_count[0]

        for index in range(10):
            count = digit_count[index]
            if(biggest_digit_count <= count):
                biggest_digit_count             = count
                index_of_biggest_digit_count    = index

        print(index_of_biggest_digit_count)

    except EOFError:
        break
