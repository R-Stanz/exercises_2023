def quick_sort(arr, floor, ceil):
    if(floor > ceil):
        return

    pivot = partition(arr, floor, ceil)

    quick_sort(arr, floor, pivot - 1)
    quick_sort(arr, pivot + 1, ceil)

def partition(arr, floor, ceil):
   smallers = floor - 1

   for marker in range(floor, ceil, 1):
       if(arr[marker] <= arr[ceil]):
           swap(arr, marker, smallers+1)
           smallers += 1
   
   swap(arr, smallers + 1, ceil)
   return smallers + 1

def swap(arr, pos1, pos2):
    tmp         = arr[pos1]
    arr[pos1]   = arr[pos2]
    arr[pos2]   = tmp
