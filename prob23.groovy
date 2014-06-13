
class prob23 {
	def max = 28123
	def abundantnums = [0]
	def cantBeSummed= new Boolean[57000]
	def sum=0
	def solve(){
		for(i in 1..max){
			if(sumFactors(i)>i){
				abundantnums.add(i)
			}
		}
		for(i in 1..56999){
			cantBeSummed[i]=false
		}
		for(j in 1..abundantnums.size()-1){
			for(k in 1..abundantnums.size()-1){
				cantBeSummed[abundantnums[k]+abundantnums[j]]=true
			}
		}
		for(i in 1..21823){
			if(cantBeSummed[i]==false){
				println i
				sum+=i
			}		
		}
		return sum
	}
	
	def sumFactors(input){
		def sumOfFactors=0;
		for(i in 1..input/2){
			if(input%i==0){
				sumOfFactors+=i
			}
		}
		return sumOfFactors
	}
}
