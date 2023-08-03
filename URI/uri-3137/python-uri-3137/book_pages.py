str_number_of_pages = input()
number_of_pages     = int(str_number_of_pages)

if(number_of_pages < 10):
    print(number_of_pages)
    quit()

multiple_of_10              = 10
total_number_of_digits      = 0
last_page_number_of_digits  = len(str_number_of_pages)

for i in range(1, last_page_number_of_digits + 1, 1):
    
    if(i == last_page_number_of_digits):
        total_number_of_digits += i*number_of_pages

    else:
        total_number_of_digits += i*(multiple_of_10 - 1)


    if(multiple_of_10 != 10):
        total_number_of_digits -= i*((multiple_of_10/10) - 1)

    multiple_of_10 *= 10

print(int(total_number_of_digits))
