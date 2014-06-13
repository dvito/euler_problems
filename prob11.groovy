
class prob11{
	
	
	
	def solve(){
		def handle = new File("prob11.txt")
		def list1 = handle.readLines()
		def list2 = []
		for(i in 0..list1.size()){
			list2.add(list1[i].split())
		}
		def largestProduct = 0
		def product
	 	for(i in 0..19){
			 for(j in 0..19){
				 // check right
				 if(j+3<=19){
					 product= Integer.parseInt(list2[i][j])*Integer.parseInt(list2[i][j+1])*Integer.parseInt(list2[i][j+2])*Integer.parseInt(list2[i][j+3])
					 print product + " "
					 if(product>largestProduct){
						 largestProduct=product
					 }
				 }
				 //check down
				 if(i+3<=19){
					 product= Integer.parseInt(list2[i][j])*Integer.parseInt(list2[i+1][j])*Integer.parseInt(list2[i+2][j])*Integer.parseInt(list2[i+3][j])
					 print product + " "
					 if(product>largestProduct){
						 largestProduct=product
					 }
				 }
				 //forward diagonal
				 if(i+3<=19 && j+3<=19){
					 product= Integer.parseInt(list2[i][j])*Integer.parseInt(list2[i+1][j+1])*Integer.parseInt(list2[i+2][j+2])*Integer.parseInt(list2[i+3][j+3])
					 print product + " "
					 if(product>largestProduct){
						 largestProduct=product
					 }
				 }
				 // backward diagonal
				 if(i+3<=19 && j-3>=0){
					 product= Integer.parseInt(list2[i][j])*Integer.parseInt(list2[i+1][j-1])*Integer.parseInt(list2[i+2][j-2])*Integer.parseInt(list2[i+3][j-3])
					 print product + " "
					 if(product>largestProduct){
						 largestProduct=product
					 }
				 }
				 println i + " " + j
			 }
		 }
		 return largestProduct
	}	
}
