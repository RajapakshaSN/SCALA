object Q3{

    def main(args: Array[String]) {
        println(sum(10))
    }

    def sum(n:Int):Int=n match{
	case 0=>0
	case _=>n+sum(n-1)
	
    }
}