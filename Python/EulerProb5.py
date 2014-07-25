def main():
	print "here"

	solution = None

	x = 200

	while divides(x) == False:
		print x
		x += 1

	print x


def divides(number):
	
	a = 20
	while a > 0:
		if(number%a != 0):
			return False
		a -= 1
	return True


if __name__ == "___main__":
	print "hello"
	main()
