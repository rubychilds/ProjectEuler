# A palindromic number reads the same both ways. The largest palindrome made from the product # of two 2-digit numbers is 9009 = 91  99.
# Find the largest palindrome made from the product of two 3-digit numbers.

def findCombo():
	number1, number2 = 0, 0
	largest = 0

	x = 999
	while x > 99:
		y = 999
		while y > 99:
			# print x and y
			product = x*y
			if str(product) == (str(product)[::-1]) and product > largest:
				print x
				print y
				largest = product
			y -= 1
		x -= 1 


	return largest		

# 1 line solution.
max(x*y for x in range(900,1000) for y in range(900,1000) if str(x*y) == str(x*y)[::-1])



if __name__ == "__main__":
	largest = findCombo()
	print largest