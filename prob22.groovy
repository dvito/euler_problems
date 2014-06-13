
class prob22 {
	def list=[]
	def solve(){
		def handle = new File("prob22.txt")
		list= handle.readLines()
		list[0]=list[0].substring(1,list[0].length()-1)
		list=list[0].split("\",\"")
		list.sort()
		long total=0
		long sum=0
		for(i in 0..list.size()-1){
			sum=0
			for(j in 0..list[i].length()-1){
				sum+=(((int)list[i].charAt(j))-64)
			}
			total+=sum*(i+1)
		}
		list.each {println it}
		return total
	}
}
