object prob1 {
                                                    //> from: (n: Int)Stream[Int]
  def from(n: Int): Stream[Int] = n #:: from(n+1)
  
  from(3).take(4)
  // sieves list of primes - passes in stream
  def sieve(s: Stream[Int]): Stream[Int] =
  // at every point removes all elements in tail which are multiples of current head
  // i.e. removes all multiples of 2 and so on
  	s.head #:: sieve(s.tail filter(x => (x%3 == 0 && x%5 == 0) ))
  	
 	val mults = sieve(from(3))                     
  // choose first 1000
  mults.takeWhile(_ < 1000).foldLeft(0L)(_+_)  
  	
}