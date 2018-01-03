import sys
def main():
	try:
		length = input('')
		list = ((input('').split(" ")))
		length = int(length)
		counter = 0
		if (len(list) != length):
			sys.exit()
		for i in range(length):
			if(int(list.pop()) < 0):
				counter += 1
		print(counter)

	except ValueError:
		sys.exit()

main()
		 