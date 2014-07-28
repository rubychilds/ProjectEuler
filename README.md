#Project Euler

This is for my solutions to Project Euler.

You can find the Project Euler webite <a href='http://projecteuler.net/'>here</a>

Most of my solutions are in Python, but will soon be in Scala as well. The main reason for working on Project Euler is as a learning process. This began when I started teaching myself Python at HackerSchool and am now recently teaching myself Scala. 

##[Problem 1](https://projecteuler.net/problem=1)
### Scala solution
Uses a stream of natural numbers. We filter these by %3 and %5 and do a takeWhile < 2 million
### Python solution
Three answers, one using a for-loop with a recursive call - main. Second solution creates a numpy array and only keeps values adherring to multiplication requirement. Final solution sums the values in using a generator function. 

##[Problem 2](https://projecteuler.net/problem=2) 
###Scala solution
To be completed: so far implemented a function which sums the fibonacci seq below a given bound - must now add the even condition

##[Problem 3](https://projecteuler.net/problem=3)
###Python solution
Uses trial division method, which increments a number z finding if it can divide the number T. If not, we increment z and try again. If a divisor is found, we use the newly divided number D and try z again. We continue on to find factors that are prime.

##[Problem 4](https://projecteuler.net/problem=4)
###Python solution
Initialises variables, x and y as the highest 3-digit number being 999. Multiples these by one another checking product for palidomic characteristic, which if exits saves and continues to ensure largest is found. Alternative solution using a generator to find maximum, hence not keeping anything in memory to be faster. 

##[Problem 5](https://projecteuler.net/problem=5)
###Python solution
For loops through a checklist of relevant numbers. Note the use of relevant: by a nummber being divisible by 18, its divisible by 9 hence check 18 not 9. Helper function 'divide_by_all' returns false if the number is not divisble by all checkable numbers. When this helper function returns false we move onto next number. In order to find the smallest number, we begin at 200 and increment, on a hope to reduce iterations.

##[Problem 6](https://projecteuler.net/problem=6)
###Python solution
One method uses numpy, the others use generators. 

##[Problem 7](https://projecteuler.net/problem=7)
###Python solution

##[Problem 9](https://projecteuler.net/problem=9)
###Scala solution
Uses forloops, whereby we always ensure a &lt; b and rewrite c = 1000 - a - b. Where the conditions hold, we yield a*b*c to return the first answer from the vector.

##[Problem 10](https://projecteuler.net/problem=10) 
I have given two solutions, one using a isPrime function in method one. The other uses Scala Streams whereby we filter the stream as we iterate through the numbers. The stream only gives us up to the desired number when requested through use of a takeWhile.