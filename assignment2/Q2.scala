object Q2 {      
  def main(args: Array[String]) {
   println("profit is "+(profit(5))+ " for price 5")
   println("profit is "+(profit(10))+" for price 10")
   println("profit is "+(profit(15))+" for price 15")
   println("profit is "+(profit(20))+" for price 20")
   println("profit is "+(profit(25))+" for price 25")
   println("profit is "+(profit(30))+" for price 30")
  
  	
}

def attendees(p:Int)=120+(15-p)/5*20 
def revenue(p:Int)=p*attendees(p)
def cost(p:Int)=500+3*attendees(p)
def profit(p:Int)=revenue(p)-cost(p) 	

}
   



