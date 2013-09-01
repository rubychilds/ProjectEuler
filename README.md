#Project Euler

This is for my solutions to Project Euler.

You can find the Project Euler webite <a href='http://projecteuler.net/'>here</a>

Most of my solutions are in Python, but will soon be in Scala as well. The main reason for working on Project Euler is as a learning process. This began when I started teaching myself Python at HackerSchool and am now recently teaching myself Scala. 

##Problem 9 : Scala solution
Q. Find the Pythagorean triplet such that a + b + c = 1000 and a^2 + b^2 = c^2 where a &lt; b &lt;  c.
A. Uses forloops, whereby we always ensure a &lt; b and rewrite c = 1000 - a - b. Where the conditions hold, we yield a*b*c to return the first answer from the vector.

##Problem 10 : Scala solution
Q. Find the sum of all the primes below two million.
A. I have given two solutions, one using a isPrime function in method one. The other uses Scala Streams whereby we filter the stream as we iterate through the numbers. The stream only gives us up to the desired number when requested through use of a takeWhile.

