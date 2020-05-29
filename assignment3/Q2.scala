object Q2{

    def main(args: Array[String]) {
        primeseq(15)
    }

    def gcd(x:Int,y:Int):Int=y match{
	case 0=>x
	case y if(y>x)=>gcd(y,x)
	case _=>gcd(y,x%y)
    }

    def prime(p:Int,n:Int=2):Boolean=n match{
 	case x if(p==x)=>true 
	case x if(gcd(p,x)>1)=>false
	case x=>prime(p,x+1)
    }
 
    def primeseq(a:Int):Unit={
	if(prime(a)==true){
	     
		println(a)
		   if(a>1){
		     primeseq(a-1)
	          }	
	}
	else{
	     if(a>1){
		primeseq(a-1)
	      }
	}

    }
		
	
}