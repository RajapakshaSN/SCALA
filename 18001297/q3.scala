object q3{
	def main(args:Array[String]){

	println("----Find wholesale cost----\n")
	println(whole_sale_cost(60)) 

	}
	def whole_sale_cost(c:Double):Double={

	val cover_price:Double=24.95
	val discount :Double = cover_price*(40.0/100)
	val shipping_cost:Double=if(c<=50) 3 else 3+(c-50)*0.75
	val S:Double=(cover_price - discount)*c + shipping_cost
	return S
	
	}
}

