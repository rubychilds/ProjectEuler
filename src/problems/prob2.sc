object prob2 {
  
	def fib(bound: Int): Int = {
		
		def fibH(a: Int, b:Int, sum: Int): Int =
			if(b > bound)	sum
			else fibH(b, a+b, sum+b)
	
		fibH(1,2,1)
	}

}