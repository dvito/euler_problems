
class prob16 {

	def solve(){
		BigInteger num = 2 ** 1000
		String str = num.toString()
		def sum=0
		for(i in 0..str.length()-1){
			sum += Integer.parseInt(""+str.charAt(i))
		}
		return sum
	}
}
