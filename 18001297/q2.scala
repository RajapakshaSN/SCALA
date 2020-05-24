object q2{
	def main(args:Array[String]){

	println("-----Find volume of sphere with radius 5------\n") 	
	println("The Volume of 5 radius sphere is "+(volumeOfSphere(5)))
	}

	def volumeOfSphere(r:Double):Double=(4.0/3)*math.Pi*math.pow(r,3)
	}