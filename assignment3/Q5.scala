object Q5{

    def main(args: Array[String]) {
        println(sum(5))
    }

    def sum(n:Int):Int=n match{
	case 0=>0
	case x if(x%2==0)=>x+sum(x-1)
	case x if(x%2!=0)=>sum(x-1)
    }
}