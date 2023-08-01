number_of_stickers = int(input())

unique_stickers = set()
repeated_stickers = 0

for i in range(number_of_stickers):
    new_sticker = int(input())

    if(new_sticker in unique_stickers):
        repeated_stickers += 1
    else:
        unique_stickers.add(new_sticker)

print( str(len(unique_stickers)) + "\n" + str(repeated_stickers))
