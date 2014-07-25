import math
import time


def pythTriangle():

    int a=0,b=0,c=0;
    int m,n;
 
    for m in range(15):
        for n in range(m+1, 30):
            if a+b+c != 1000:
                a = n*n - m*m
                b = 2*n*m;
                c = n*n + m*m
 	print a,b,c



def aythTriangle():

	# condition 1: a + b = c
	# condition 2: a^2 + b^2 = c^2	
	endingP = 1000
	runningTotal = 0
	triplet = False
	a = endingP
	oldA = a
	c = 0
	b = 0

	while endingP != runningTotal and triplet == False:

		b = a+1
		print a,b,c
		c = int(math.sqrt(a*a + b*b))

		# checks if it obeys first rule, to calculate next and so on 
		runningTotal = a + b + c

		if runningTotal == endingP and c == b+1:
			triplet == True

		elif runningTotal < endingP:
			if a < oldA:
				temp = a
				a = int(a + (oldA-a)/2)
				oldA = temp
			else:
				oldA = a
				a = a*2

		elif runningTotal > endingP:
			if a > oldA:
				a = int(oldA + (a-oldA)/2)
			else:
				oldA = a
				a = int(a/2)

	print a,b,c
	return a,b,c

if __name__ == "__main__":
	start = time.time()
	pythTriangle()
	print elapsed
