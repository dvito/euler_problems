
class prob48 {
	BigInteger num = 0
	def solve(){
		for(i in 1..1000){
			num += i **i
		}
		def str = num.toString()
		return str.substring(str.length()-10,str.length())
	}
}
