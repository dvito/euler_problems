
class prob34 {
	def solve(){
		def total=0
		for(i in 1..100000000){
			def num = sumFactorials(i.toString())
			if(i==sumFactorials(i.toString())){
				total= total + i
			}
		}
		println total
	}
	
	
	def sumFactorials(input){
		def sum=0
		for(i in 0..input.length()-1){
			sum+=factorial(Integer.parseInt(""+input.charAt(i)))
		}
		return sum
	}
	def factorial(input){
		def fact=1
		for(i in 1..input){
			fact = fact * i
		}
		return fact
	}
}
