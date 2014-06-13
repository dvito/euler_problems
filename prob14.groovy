


class prob14 {

	def solve(){
		def map = [1:1]
		def largestChain=1
		def largestNumber=1
		def secondChain=0
		def secondNumber=0
		def curTestNum=2
		def curNum=2
		def curChain=1
		while(curTestNum<1000000){
			curNum=curTestNum
			curChain=1
			while(curNum!=1){
				curNum=nextNumber((BigInteger)curNum)
				if(map[curNum]!=null){
					curChain+=map[curNum]+1
					curNum=1
				}else{
					curChain++
				}
			}
			if(curChain>largestChain){
				secondChain=largestChain
				secondNumber=largestNumber
				largestChain=curChain
				largestNumber=curTestNum
			}
			map.put(curTestNum,curChain)
			curTestNum++
		}
		println largestNumber +" "+largestChain
		println secondNumber+" "+secondChain
		return curTestNum+" "+map[curTestNum]
	}
	
	
	def nextNumber(input){
		if(input%2==0){
			return input/2	
		}
		return input*3 + 1
	}
}
