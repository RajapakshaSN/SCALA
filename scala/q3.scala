package com.nidisoft.scala

object q3 extends App{
  val A1=new Account(id="98789v",6786726,908976)
  val A2=new Account(id="89786v",8976789,120987)
  println("\n---------Before Tranfering-------------")

  println("A1 is " +A1)
  println("A2 is " +A2)
  println("\n-----------Transfer 6000 money from A1 to A2-------------\n")
  A1.transfer(A2,6000)
  println("-----------After Transfering---------------")
  println("A1 is" +A1)
  println("A2 is" +A2)
}

class Account(id:String,n:Int,b: Double){
  val nic:String=id
  val Acnumber:Int=n
  var balance:Double=b

  def transfer(a:Account,b:Double): Unit ={
    this.balance=this.balance-b
    a.balance=a.balance+b
  }
  override def toString ="["+nic+":"+Acnumber +":"+ balance+"]"
}