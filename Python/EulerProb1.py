import sys
import numpy as np 

def main():

	# running_sum = 0
	sum = total(10000, 1,  0)

	print "sum ", sum
	# print "The running total is %d" % sum

# must use new variable as creating a new one everytime 

def total(end, number, running_sum):

	if(number%5 == 0 or number%3 == 0):
		running_sum += number

	print running_sum

	# Breaks recurssion
	if(number is end):
		print running_sum
		return running_sum
	else:
		return total( end, number + 1, running_sum)

def main2():
	# creates an array of numbers from 0-1000
	a = np.arange(1,1000)
	# keeps all the numbers divisible by 3 or 5
	a = a[(a%3 == 0) | (a%5 == 0) ]
	# now sum the total
	total = a.sum()
	print total

if __name__ == "__main__":
	main2()