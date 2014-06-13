
class prob67 {
		def list2=[]
		def solve(){
			def handle = new File("prob67.txt")
			def list1 = handle.readLines()
			for(i in 0..list1.size()-1){
				list2.add(list1[i].split())
			}
			def largest =0
			def num=0
			for(i in 98..00){
				for(j in 0..list2[i].size()-1){
					println i+","+j
					if(Integer.parseInt(list2[i+1][j])>Integer.parseInt(list2[i+1][j+1])){
						list2[i][j]=""+(Integer.parseInt(list2[i][j])+Integer.parseInt(list2[i+1][j]))
					}else{
						list2[i][j]=""+(Integer.parseInt(list2[i][j])+Integer.parseInt(list2[i+1][j+1]))
					}
				}
			}
			return list2[0][0]
		}
		
		
}
