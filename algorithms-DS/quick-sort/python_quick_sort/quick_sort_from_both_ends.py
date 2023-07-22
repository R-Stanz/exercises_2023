def quick_sort(arr, floor, ceil):
    if(floor < ceil):
        pivot = partition(arr, floor, ceil)

        quick_sort(arr, floor, pivot - 1)
        quick_sort(arr, pivot + 1, ceil)

def partition(arr, floor, ceil):
    left_marker = floor
    right_marker = ceil - 1

    print("in : ", arr, floor, ceil)
    while(left_marker <= right_marker):
        
        if((arr[left_marker] >= arr[ceil]) and
           (arr[right_marker] < arr[ceil])):

            swap(arr, left_marker, right_marker)

        if(arr[left_marker] < arr[ceil]):
            left_marker += 1
        if(arr[right_marker] >= arr[ceil]):
            right_marker -= 1

    swap(arr, left_marker, ceil)
    return left_marker

def swap(arr, pos1, pos2):
    tmp = arr[pos1]
    arr[pos1] = arr[pos2]
    arr[pos2] = tmp
