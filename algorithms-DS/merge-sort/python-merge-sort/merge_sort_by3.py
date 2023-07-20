def merge_sort(arr):
    if(len(arr) == 1):
        return
    if(len(arr) == 2):
        if(arr[0] < arr[1]):
            return
        else:
            tmp = arr[0]
            arr[0] = arr[1]
            arr[1] = tmp
        return

    arr1 = arr[:len(arr)//3]
    arr2 = arr[len(arr)//3:2*len(arr)//3]
    arr3 = arr[2*len(arr)//3:]

    merge_sort(arr1)
    merge_sort(arr2)
    merge_sort(arr3)

    merge(arr, arr1, arr2, arr3)

def merge(arr, arr1, arr2, arr3):

    i = 0
    while((len(arr1) > 0) and (len(arr2) > 0) and 
          (len(arr3) > 0)):

        if  ((arr1[0] < arr2[0]) and (arr1[0] < arr3[0])):
            arr[i] = arr1.pop(0)
        elif((arr2[0] < arr1[0]) and (arr2[0] < arr3[0])):
            arr[i] = arr2.pop(0)
        elif((arr3[0] < arr1[0]) and (arr3[0] < arr2[0])):
            arr[i] = arr3.pop(0)
        i += 1

    while((len(arr1) > 0) and (len(arr2) > 0)):
        if(arr1[0] < arr2[0]):
            arr[i] = arr1.pop(0)
        else:
            arr[i] = arr2.pop(0)
        i += 1
    while((len(arr1) > 0) and (len(arr3) > 0)):
        if(arr1[0] < arr3[0]):
            arr[i] = arr1.pop(0)
        else:
            arr[i] = arr3.pop(0)
        i += 1
    while((len(arr2) > 0) and (len(arr3) > 0)):
        if(arr2[0] < arr3[0]):
            arr[i] = arr2.pop(0)
        else:
            arr[i] = arr3.pop(0)
        i += 1

    while(len(arr1) > 0):
        arr[i] = arr1.pop(0)
        i += 1
    while(len(arr2) > 0):
        arr[i] = arr2.pop(0)
        i += 1
    while(len(arr3) > 0):
        arr[i] = arr3.pop(0)
        i += 1
