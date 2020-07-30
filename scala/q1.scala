 object q1 extends App{
 val x= new Rational(3,4)
 val y= new Rational(5,8)
 val z= new Rational(2,7)
 val a=x.neg
 val b=x-y-z

  println(a)
  println(b)

}

class Rational(n:Int,d:Int){
  def numer=n/gcd(n,d)
  def denom=d/gcd(n,d)
  private def gcd(a:Int,b:Int):Int=if(b==0)a else gcd(b,a%b)
  def +(r:Rational)= new Rational(this.numer*r.denom+this.denom*r.numer,this.denom*r.denom)
  def neg =new Rational(-this.numer,this.denom)
  def -(r:Rational)=this+r.neg
  override def toString= numer+"/"+denom
}

