object Q2 {      
  def main(args: Array[String]) {

   println("profit is "+(profit(15)))
   println("profit is "+(profit(20)))
   println("profit is "+(profit(10))) 	
  	
}

def attendees(p:Int)=120+(15-p)/5*20 
def revenue(p:Int)=p*attendees(p)
def cost(p:Int)=500+3*attendees(p)
def profit(p:Int)=revenue(p)-cost(p) 	

}
   



