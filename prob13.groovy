
class prob13 {

	def solve(){
		def file = new File("problem13.txt")
		def list = file.readLines()
		BigInteger number=0
		for(i in 0..list.size()-1){
			println(list[i]+" "+number)
			number+=Double.parseDouble(list[i])
		}
		return number.toString().substring(0,10)
	}
}
