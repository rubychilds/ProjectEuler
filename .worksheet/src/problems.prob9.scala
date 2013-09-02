package problems

object prob9 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(212); 

	// we must for loop where j > i and k = 1000-i-j
	// we need a limit for both i and j - this is determined by...
	val limit = (1 to 1000).find(n => n + Math.sqrt(n) >= 1000).get;System.out.println("""limit  : Int = """ + $show(limit ));$skip(143); 

  val ans = for{ i <- (2 to limit)
  							 j <- (i to limit)
								 k = (1000- i - j)
								 if(i*i + j*j == k*k)
								 }yield i*j*k;System.out.println("""ans  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(ans ));$skip(64); 
  // we take the first ans of the vector
  val product = ans(0);System.out.println("""product  : Int = """ + $show(product ))}
                
}
