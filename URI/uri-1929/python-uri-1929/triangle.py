def check(a, b, c):

    if((a**2 + b**2 - 2 * a * b <= c**2) and
       (a**2 + b**2 + 2 * a * b > c**2)):

        print("S")
        return True

    return False

arr = input().split(" ")
arr = [int(i) for i in arr]

arr = sorted(arr)

for a in range(len(arr)-2):
    for b in range(a + 1, len(arr) - 1):
        for c in range(b + 1, len(arr)):

            if(check(arr[a], arr[b], arr[c])):
                quit()

print("N")
