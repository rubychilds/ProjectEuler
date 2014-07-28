
# The prime factors of 13195 are 5, 7, 13 and 29.
# What is the largest prime factor of the number 600851475143 ?

def findPrimeNos(number):
	z = 2
	output = 1
	while (z*z <= number):
		if(number % z == 0):
			output = z
			number /= z
		else:
			z += 1
	print number

if __name__ == "__main__":
	findPrimeNos(600851475143)