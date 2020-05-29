object Q1 { 
      
  def main(args: Array[String]) { 
   
  println("Take home salary is Rs."+takehome(40,20))
		 
       
} 
  def wage(h:Int)=h*150
  def ot(h:Int)=h*75
  def tax(x:Int)=x*.1
  def income(h1:Int,h2:Int)=wage(h1)+ot(h2)
  def takehome(h1:Int,h2:Int)=income(h1,h2)-tax(income(h1,h2))	
}
   


