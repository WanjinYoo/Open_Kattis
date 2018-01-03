import sys

def winner(x):
	if (x % 2 == 0):
		print ('Bob')
	else:
		print ('Alice')
def main():
 x = input('')
 try:
  x = int(x)
 except ValueError:
  sys.exit()
 if(x < 1 or x >= 10000000):
  sys.exit()
 else:
  winner(x)
main()