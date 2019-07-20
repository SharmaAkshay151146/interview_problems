def main():
  given_list = [1,2,3,5]
  end = given_list[-1];
  start = given_list[0]
  
  for i in range(start,end+1):
      if (i != given_list[i-1]):
        print(i)
        break;

main()

def missing(arr, n):
	return int((n*(n+1))/2 - sum(arr))  
