
class prob30 {
	def solve(){
		def sum=0
		def cur=0
		def str=""
		for(i in 2..480000){
			str=i.toString()
			cur=0
			for(n in 0..str.size()-1){
				cur+=(Integer.parseInt(""+str.charAt(n))**5)
			}
			if(i==cur){
				sum+=i
				println i
			}
		}
		println 4**5+1**5+5**5+0**5
		return sum
	}
}
