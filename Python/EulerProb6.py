import numpy as np 

def main():
	a = (np.power(np.arange(101),2)).sum()
	b = np.power((np.arange(101)).sum(), 2)
	return np.absolute(a-b)

if __name__ == "__main__":
	print main()

# If you do not want to use Numpy
sum(x for x in range(101)])**2 - sum([x**2 for x in range(101))
sum(x*x*(x-1) for x in range(1, 101))