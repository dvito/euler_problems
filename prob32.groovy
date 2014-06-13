
class prob32 {
	def str=""
	HashSet list = new HashSet()
	def total
	def solve(){
		for(i in 1..10000){
			for ( j in 1..10000){
				total = i * j
				str =(total.toString() + i.toString()+j.toString())
				if(str.length()==9){
					def works=true
					for(n in 1..9){
						if(!str.contains(n.toString())){
							works=false
						}
					}
					if(works){
						list.add(total)
					}
				}
			}
		}
		Iterator it = list.iterator()
		def sum= 0
		while(it.hasNext()){
			sum+=it.next()
		}
		return sum
	}
}
