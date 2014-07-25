object prob1 {
                                                    //> from: (n: Int)Stream[Int]
  def from(n: Int): Stream[Int] = n #:: from(n+1)

  // filters to multiples of 3 or 5 only
  def sieve(s: Stream[Int]): Stream[Int] =
  	s filter(x => (x%3 == 0 || x%5 == 0) )
  	
 	val mults = sieve(from(3))                     
  // choose first 1000
  mults.takeWhile(_ < 1000).foldLeft(0L)(_+_)  
  	
}