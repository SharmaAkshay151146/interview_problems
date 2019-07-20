# Leetcode problem 26
# Remove duplicates from a sorted array

def dup_remove(arr):
	j = 0
	for i in range(0,len(arr)-1):
		if arr[i] != arr[i+1]:
			arr[j] = arr[i]
			j += 1

	arr[j] = arr[len(arr)-1]
	j += 1
	print(arr[:j])
	

def main():
	arr = [1,1,2,2,2,3,3,3,4,4,4,5,5,5]
	print(arr)
	dup_remove(arr)

main()