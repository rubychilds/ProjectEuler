def main():

	prime = 2
	count = 1
	number = 3

	while count < 1001:
		if len(getFactors(number)) == True
			count += 1
			prime  = number
		num += 2

	return prime

# Prime function - removes need to create list of factors
def prime(number):
	if number%2 == 0:
		return False
	
	p = 3

	while p < number**0.5 +1:
		if number% p == 0:
			return False
		p +=2

	return True



def getFactors(number):
	
	factors = []

	# removes even factors
	while number%2 == 0:
		factors.append(2)
		number = number/2

	p = 3
	while n != 1:
		if n%p == 0:
			return False
		p += 2

	return True






if __name__ == "__main__":
	main()