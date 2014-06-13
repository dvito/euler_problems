
class prob25 {
	
	def list=[(BigInteger)0,(BigInteger)1]
	def num=1
	def solve(){
		while(list[list.size()-1].toString().length()<1000){
			if(list.size()>1000){
				list=[(BigInteger)list[list.size()-2],(BigInteger)list[list.size()-1]]
			}
			generateFactorial()
			num++
		}
		return num
	}
	
	
	BigInteger generateFactorial(){
		list[list.size()]=(BigInteger)list[list.size()-2]+(BigInteger)list[list.size()-1]
	}
}
