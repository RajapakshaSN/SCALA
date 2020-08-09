object MyApp extends App{
  val p1=Point(2,3)
  val p2=Point(3,4)  
  
  println("p1 is "+p1)
  println("p2 is "+p2)
  
  //question1
  val q1=(p1+p2)
  println("Addition of p1 and p2 is " +q1)
  
  //question2
  println("After moving (4,6) form p2 = "+p2.move(4,6))
  
  //question3
  val p3=p2.invert()
  println("After inverting p2 = "+p3)
 
  //question4 
  val p4=p1.distance(p2)
  println("Distance between p1 and p2 is "+p4)
  
}


case class Point(a: Int, b: Int) {
 def x: Int = a
 def y: Int = b   
 def +(that:Point)=Point(this.x+that.x,this.y+that.y)
 def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy) 
 def invert() =Point(this.y,this.x)
 def distance(that:Point) = scala.math.sqrt(scala.math.pow(this.x -that.x , 2) + scala.math.pow(this.y -that.y, 2))  
 
  
}


