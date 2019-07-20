# Leetcode problem 14
# Longest common prefix

def min_length(arr):
	min = len(arr[0])

	for i in range(1, len(arr)):
		if (len(arr[i]) < min):
			min = len(arr[i])

	return min 

def comm(arr):
	minlen = min_length(arr)
	res = ""
	for i in range(minlen):
		curr = arr[0][i]
		for j in range(1,len(arr)):
			if arr[j][i] != curr:
				return res
		res += curr

if __name__ == "__main__":
	arr = ['flower', 'flow', 'flour']
	print(comm(arr))