
class prob12 {

	def solve(){
		def notDone= true
		def divisors =0
		def curNum =0
		def tester=1
		def sqrt=0
		def counter=1
		while(notDone){
			divisors=0
			curNum+=counter
			tester=1
			sqrt=Math.sqrt(curNum)
			if(tester==sqrt){
				divisors+=1
			}
			while(tester<sqrt){
				if(curNum%tester==0){
					divisors+=2
				}
				tester++
			}
			if(divisors>=500){
				notDone=false
			}
			counter++
			println curNum + ":"+divisors
		}
		return curNum
	}
}
