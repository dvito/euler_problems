
class prob18 {
	def list2=[]
	def solve(){
		def handle = new File("prob67.txt")
		def list1 = handle.readLines()
		for(i in 0..list1.size()-1){
			list2.add(list1[i].split())
		}
		return traverse(0,0)
	}
	
	def traverse(level,pos){
		if(level>list2.size()-1){
			return 0
		}
		def left = traverse(level+1,pos)+Integer.parseInt(list2[level][pos])
		def right = traverse(level+1,pos+1)+Integer.parseInt(list2[level][pos])
		if(left>right){
			return left
		}else
			return right
	}
	
}
