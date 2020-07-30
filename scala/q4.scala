
object q4
{
  def main(args:Array[String])
  {
    var a1=new Account("44744V",371,1000)
    var a2=new Account("22322V",372,5000)
    var a3=new Account("97464V",374,-5000)
    var a4=new Account("97668V",375,-20000)
    var a5=new Account("67933V",376,250000)

    val bank:List[Account]=List(a1,a2,a3,a4,a5)

    println("\naccounts with negative balance   : ")
    var slist=negativebal(bank)
    slist.foreach(x=>println(x.accNumber+"   "))


    var Balance=balance(bank);
    println("\nTotal Account balance is : "+Balance.aBalance);


    println("\nAccount balances with interest : ")
    var interestList=interest(bank);
    interestList.foreach(x=>print(x+" "));


  }

  val negativebal=(list:List[Account])=>list.filter(x=>x.aBalance<=0);
  val balance=(list:List[Account])=>list.reduce((x,y)=>new Account("V000",1000,x.aBalance+y.aBalance));
  val interest=(list:List[Account])=>list.map(x=>(if(x.aBalance>0) x.aBalance*1.05d else x.aBalance*1.01d));
}

class Account(id:String,aNumber:Int,balance:Double)
{
  var nic=id;
  var accNumber=aNumber;
  var aBalance=balance;
}