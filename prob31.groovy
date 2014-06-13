
class prob31 {
	def list=[1,2,5,10,20,50,100]
	def counts=1
	def sum=0
	def solve(){
		for(a in 0..200){
			sum=sum+a*1
			for(b in 0..100){
				sum+=b*2
				for(c in 0..40){
					sum+=c*5
					for(d in 0..20){
						sum+=d*10
						for(e in 0..10){
							sum+=e*20
							for(f in 0..4){
								sum+=f*50
								for(g in 0..2){
									sum+=g*100
									if(sum==200){
										counts++
									}
									sum==0
								}
							}
						}
					}
				}
			}
		}
		return counts
	}
}
