package problems

object prob10 {
  // firstly must only use primes
  // sum of primes below 2 million
  
    /* ** *********************** METHOD 1 ****************************** ** */
  // Checks whether every number is a prime no.
  def isPrime(number: Int):Boolean= {
		if (number <= 1) false
		else if(number == 2) true
		else !(2 to number -1).exists(x => number% x ==0)
  }                                               //> isPrime: (number: Int)Boolean
  
  // Iterates through each number, keeping hold of it if it is Prime
  def sum(max: Int): Int = {
   	val ans = for{i <- (1 until max)
   								 if(isPrime(i))
   								 }yield i
   	// takes ans and folds Left in order to sum it
  	ans.foldLeft(0L)(_+_).toInt
	}                                         //> sum: (max: Int)Int
	// quick check that it does return a prime number as true
	isPrime(17)                               //> res0: Boolean = true
	// sums the primes below this number
	sum(200)                                  //> res1: Int = 4227
  
  /* ** *********************** METHOD 2 ****************************** ** */

  // Efficient way using streams
  // create infinite stream
  def from(n: Int): Stream[Int] = n #:: from(n+1) //> from: (n: Int)Stream[Int]
  
  // sieves list of primes - passes in stream
  def sieve(s: Stream[Int]): Stream[Int] =
  // at every point removes all elements in tail which are multiples of current head
  // i.e. removes all multiples of 2 and so on
  	s.head #:: sieve(s.tail filter(_% s.head !=0 ))
                                                  //> sieve: (s: Stream[Int])Stream[Int]
  
  // create a prime stream
  val primes = sieve(from(2))                     //> primes  : Stream[Int] = Stream(2, ?)
  // choose first 2 million numbers
  primes.takeWhile(_<200).foldLeft(0L)(_+_)       //> res2: Long = 4227
  
}