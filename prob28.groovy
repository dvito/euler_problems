
class prob28 {
	def solve(){
		def sum=0
		def curNum=1
		def adder=2
		def curRows=3
		while (curRows<=1001){
			for(i in 0..3){
				sum+=curNum
				curNum+=adder
				println curNum
			}
			adder+=2
			curRows+=2
		}
		sum+=curNum
		return sum
	}
}
