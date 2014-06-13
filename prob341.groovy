
class prob341 {

	def solve(){
		solve2(10)
	}
	
////def solve3(input){
////		BigInteger sum =0
////		println golombNum(10**6)
////		for(i in 1..10**6){
////			sum+=Math.round(golombNum((BigDecimal)i**3))
////		}
////		return sum
////}
	
	BigDecimal golombNum(BigDecimal input){
		return ((1+Math.sqrt(5))/2)**(2-((1+Math.sqrt(5))/2))*input**(((1+Math.sqrt(5))/2)-1)
	}
	
	def solve2(input){
		BigInteger sum =0
		BigInteger max=input**3**3
		BigInteger curValue=1
		BigInteger timesToRepeat=1
		LinkedList<BigInteger> repeatList= new LinkedList<BigInteger>()
		def i=1
		def n=1
		while(i<max){
			if(i==n**3){
				sum+=curValue
				n++
			}
			if(timesToRepeat==0){
				curValue++
				repeatList.add(curValue)
				timesToRepeat=repeatList.removeFirst()
				timesToRepeat=timesToRepeat-1
			}else{
				repeatList.add(curValue)
				timesToRepeat=timesToRepeat-1
			}
			i++
		}
		return sum
	}
	BigInteger solv(input){
		BigInteger sum=0
		BigInteger max = input**3
		BigInteger curValue=1
		BigInteger timesToDo=1
		ArrayList<BigInteger> gTimes= new ArrayList<BigInteger>()
		gTimes.add(0)
		gTimes.add(1)
		for(j in 1..input){
			if(timesToDo==0){
				curValue++
				gTimes[j]=curValue
				timesToDo=gTimes[curValue]
				timesToDo=timesToDo-1
			}else{
				gTimes[j]=curValue
				timesToDo=timesToDo-1
			}
		}
		return gTimes[gTimes.size()-1]
	}
}
