
class prob36 {
	def solve(){
		def sum=0
		for(i in 1..1000000){
			if(isPalindrome(i.toString())){
				if(isPalindrome(Integer.toBinaryString(i))){
					sum+=i	
				}
			}
		}
		return sum
	}
	
	def isPalindrome(input){
		if(input.length()==1){
			return true;
		}else if(input.length()==2){
			if(input.charAt(0)==input.charAt(1)){
				return true;
			}
			return false;
		}
		else{
			if(input.charAt(0)==input.charAt(input.length()-1)){
				return isPalindrome(input.substring(1,input.length()-1))
			}
			return false
		}
	}
}
