
class prob29 {
	HashSet set = new HashSet()
	def solve(){
		for(i in 2..100){
			for(j in 2..100){
				set.add(i**j)
			}
		}
		return set.size()
	}
}
