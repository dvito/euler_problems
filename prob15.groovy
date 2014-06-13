
class prob15 {
	def solve(){
		BigInteger num=factorial(40)
		BigInteger divi=factorial(20)
		BigInteger divisor=divi*divi
		println num
		println divisor
		return num.divide(divisor)
		
	}
	
	BigInteger factorial(BigInteger input){
		if(input>0){
			return factorial(input-1)*input
		}else{
			return 1
		}
	}
}
