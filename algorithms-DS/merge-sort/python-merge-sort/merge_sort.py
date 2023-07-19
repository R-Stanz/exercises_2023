def merge_sort(arr):

    if(len(arr) == 1):
        return

    arr1 = arr[:len(arr)//2]
    arr2 = arr[len(arr)//2:]

    merge_sort(arr1)
    merge_sort(arr2)

    merge(arr, arr1, arr2)

def merge(arr, arr1, arr2):

    i = 0
    while((len(arr1) > 0) and (len(arr2) > 0)):
        if(arr1[0] < arr2[0]):
            arr[i] = arr1.pop(0)
        else:
            arr[i] = arr2.pop(0)
        i += 1

    while(len(arr1) > 0):
        arr[i] = arr1.pop(0)
        i += 1

    while(len(arr2) > 0):
        arr[i] = arr2.pop(0)
        i += 1
