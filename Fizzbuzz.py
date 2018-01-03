import sys

def main():
	try:
		x,y,z = input('').split(" ")
		x = int(x)
		y = int(y)
		z = int(z)
	except ValueError:
		sys.exit()
	for i in range(1,z+1):
		if(i < x):
			print (i)
		elif(i >= y and i % x == 0 and i % y == 0):
			print ('FizzBuzz')
		elif(i % x == 0):
			print ('Fizz')
		elif(i % y == 0):
			print ('Buzz')
		else:
			print (i)	
#main()