object prob9 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(118); 


  val ans = for( i <- 2 until 333; j <- i until 333; k = 1000- i - j	if i*i + j*j == k*k) yield i*j*k;System.out.println("""ans  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(ans ));$skip(32); 
  
   val product = 200*375*425;System.out.println("""product  : Int = """ + $show(product ))}
  
  
}
