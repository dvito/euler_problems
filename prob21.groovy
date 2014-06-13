
class prob21 {
	def solve(){
		def list = []
		def list2 = []
		def sum=0
		
		for(i in 1..10000){
			for(n in 1..i){
				if(i%n==0&&i!=n){
					list.add(n)
				}
			}
			sum = list.sum()
			list=[]
			if(sum!=null&&sum>i){
				for(j in 1..sum){
					if(sum%j==0&&sum!=j){
						list.add(j)
					}
				}
				if(i==list.sum()){
					list2.add(i)
					list2.add(sum)
				}
			}
		}
		list2.each{println it}
		return list2.sum()
	}
}
