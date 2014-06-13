
class prob20 {

	def solve(){
		BigInteger num = factorial(100)
		def sum=0
		def str = num.toString()
		for(i in 0..str.size()-1)
			sum+= Integer.parseInt(""+str.charAt(i))
		return sum	
	}
	
	BigInteger factorial(BigInteger input){
		if(input>0){
			return factorial(input-1)*input
		}else{
			return 1
		}
	}
}
