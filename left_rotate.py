# Rotates an array by certain places
# Eg. rotation of [0,1,2,3,4,5,6] by 2 places = [2,3,4,5,6,0,1]

def left_rotate(arr, n):
    for i in range(0,n):
        d = arr[0]
        for j in range(1, len(arr)):
            arr[j-1] = arr[j]
            #print(arr)
        arr[len(arr)-1] = d 

    return arr

def left_rotate_efficient(arr, n):
    rotate = n%len(arr)
    temp = arr[:rotate+1]
    for i in range(0, len(arr) - n):
        arr.append(temp[i])

def main():
    arr = [0,1,2,3,4,5,6]
    n = 2
    print(arr)
    print(left_rotate(arr,n))

if __name__ == "__main__":
    main()