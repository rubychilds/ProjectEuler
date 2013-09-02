package problems

object prob10 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(380); 
  // firstly must only use primes
  // sum of primes below 2 million
  
    /* ** *********************** METHOD 1 ****************************** ** */
  // Checks whether every number is a prime no.
  def isPrime(number: Int):Boolean= {
		if (number <= 1) false
		else if(number == 2) true
		else !(2 to number -1).exists(x => number% x ==0)
  };System.out.println("""isPrime: (number: Int)Boolean""");$skip(271); 
  
  // Iterates through each number, keeping hold of it if it is Prime
  def sum(max: Int): Int = {
   	val ans = for{i <- (1 until max)
   								 if(isPrime(i))
   								 }yield i
   	// takes ans and folds Left in order to sum it
  	ans.foldLeft(0L)(_+_).toInt
	};System.out.println("""sum: (max: Int)Int""");$skip(72); val res$0 = 
	// quick check that it does return a prime number as true
	isPrime(17);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(48); val res$1 = 
	// sums the primes below this number
	sum(200);System.out.println("""res1: Int = """ + $show(res$1));$skip(193); 
  
  /* ** *********************** METHOD 2 ****************************** ** */

  // Efficient way using streams
  // create infinite stream
  def from(n: Int): Stream[Int] = n #:: from(n+1);System.out.println("""from: (n: Int)Stream[Int]""");$skip(275); 
  
  // sieves list of primes - passes in stream
  def sieve(s: Stream[Int]): Stream[Int] =
  // at every point removes all elements in tail which are multiples of current head
  // i.e. removes all multiples of 2 and so on
  	s.head #:: sieve(s.tail filter(_% s.head !=0 ));System.out.println("""sieve: (s: Stream[Int])Stream[Int]""");$skip(60); 
  
  // create a prime stream
  val primes = sieve(from(2));System.out.println("""primes  : Stream[Int] = """ + $show(primes ));$skip(80); val res$2 = 
  // choose first 2 million numbers
  primes.takeWhile(_<200).foldLeft(0L)(_+_);System.out.println("""res2: Long = """ + $show(res$2))}
  
}
