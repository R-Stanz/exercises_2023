first_line = input().split(" ")
jump_height, number_of_pipes = [int(i) for i in first_line]

heights_line = input().split()
heights_line = [int(i) for i in heights_line]

win = True

last_pipe_height = heights_line[0]
for next_pipe_height in heights_line:
    if((last_pipe_height - next_pipe_height > jump_height) or
       (next_pipe_height - last_pipe_height > jump_height)):

        win = False

    last_pipe_height = next_pipe_height

if(win):
    print("YOU WIN")
else:
    print("GAME OVER")
