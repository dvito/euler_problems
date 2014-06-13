
class prob26 {
	def list=[]
	def solve(){
		def handle = new File("primesTo1000.txt")
		list = handle.readLines()
		def maxLength=0
		def length=0
		def result=0
		
		for (i in 0..3){
			length = lengthOfRemainderCycle(Integer.parseInt(list[i]))
			println " "+result
			if(length>maxLength){
				maxLength=length
				result=i
			}
		}
		return result
	}
	
	def lengthOfRemainderCycle(input){
		ArrayList<Integer> quotients= new ArrayList<Integer>()
		ArrayList<Integer> remainders= new ArrayList<Integer>()
		remainders.add(1)
		quotients.add(0)
		println input
		for(i in 1..quotients.size()-1){
			quotients.add(remainders[i-1]*10/input)
			remainders.add(remainders[i-1]*10 - quotients[i]*input)
			println quotients[i]
			println remainders[i]
			for(j in 1..i){
				if( quotients[j]==quotients[i] & remainders[j]==remainders[i]){
					return (i-j);
				}
			}
		}
		return -1
	}
}
