# Kadane's Algorithm
# Finds sub-array with the largest sum

def kadane(data):
	max_arr = 0
	max_all = 0

	for i in range(0, len(data)):
		max_arr = max_arr + data[i]
		if max_arr < 0:
			max_arr = 0
		elif max_all < max_arr:
			max_all = max_arr
	return max_all

data = [-2,1,-3,4,-1,2,1,-5,4]
print(kadane(data))