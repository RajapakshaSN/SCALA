object ciper{
def main(args:Array[String]){
val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

val En=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
val De=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size)


val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

val x=cipher(En,"COME",3,alphabet)
val y=cipher(De,"FRPH",3,alphabet)

println(x)
println(y)
	
	}
}