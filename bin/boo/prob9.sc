package problems

object prob9 {

	// we must for loop where j > i and k = 1000-i-j
	// we need a limit for both i and j - this is determined by...
	val limit = (1 to 1000).find(n => n + Math.sqrt(n) >= 1000).get
                                                  //> limit  : Int = 969

  val ans = for{ i <- (2 to limit)
  							 j <- (i to limit)
								 k = (1000- i - j)
								 if(i*i + j*j == k*k)
								 }yield i*j*k
                                                  //> ans  : scala.collection.immutable.IndexedSeq[Int] = Vector(31875000)
  // we take the first ans of the vector
  val product = ans(0)                            //> product  : Int = 31875000
                
}