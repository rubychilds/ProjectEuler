def main():
	solution = None
	x = 200
	while divided_by_all(x) == False:
		print x
		x += 1
	print x

def divided_by_all(number):
	check_numbers = [11, 13, 14, 16, 17, 18, 19, 20]
	for check_number in check_numbers:
		if number % check_number != 0:
			return False
	return True

if __name__ == "___main__":
	main()
