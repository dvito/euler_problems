
class prob24 {
	def alphabet="0123456789"
	def list = []
	
	def solve(){
		def num=System.currentTimeMillis()
		permutate(alphabet)
		def num2=System.currentTimeMillis()
		println num2-num
		return list[999999]
	}
	
	public void permutate(String s) { permutate("", s); }
	private void permutate(String prefix, String s) {
		int n = s.length();
		if(list.size()>1000000)
			return
		if (n == 0) 
			list.add(prefix);
		else {
			for (int i = 0; i < n; i++)
			   permutate(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
		}
	}
}
