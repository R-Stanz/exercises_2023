interations = int(input())

for i in range(interations):

    phrase = input()
    answer = ""

    first_half = True
    chars = [ord(k) for k in phrase]
    for j in range(len(chars)):

        if(j > (len(chars) - 1)//2):
            first_half = False

        val = chars[j]

        if((val > 64 and val <= 90) or
           (val > 96 and val <= 122)):

            if(first_half):
                val += 2
            else:
                val += 3
        elif(first_half):
            if(val == 255):
                val = 0
            else:
                val -= 1

        answer += chr(val)
    print(answer[::-1])
