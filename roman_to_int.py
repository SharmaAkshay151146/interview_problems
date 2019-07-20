# Leetcode problem 13. 
# Convert roman numerals to integers

def rom_to_int(num):
	conv = {'M':1000,'D':500,'C':100,'L':50,'X':10,'V':5,'I':1}
	res = 0
	for i in range(len(num)):
		value = conv[num[i]]
		if i+1 < len(num) and conv[num[i+1]] > value:
			res -= value
		else:
			res += value
	return res

num_roman = 'MCMDXXI'
print(rom_to_int(num_roman))