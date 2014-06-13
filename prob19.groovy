
class prob19 {
	Date day =new Date(1,0,1)
	def sum=0
	def leapYears=0
	def solve(){
		for(i in 1..100){
			println day.format('yyyy')
			day=day.plus(31)
			test()
			if(Integer.parseInt(day.format('yyyy'))%4==0){
				
				day=day.plus(29)
				leapYears++
			}
			else{
				day=day.plus(28)
			}
			test()
			day=day.plus(31)
			test()
			day=day.plus(30)
			test()
			day=day.plus(31)
			test()
			day=day.plus(30)
			test()
			day=day.plus(31)
			test()
			day=day.plus(31)
			test()
			day=day.plus(30)
			test()
			day=day.plus(31)
			test()
			day=day.plus(30)
			test()
			day=day.plus(31)
			test()
		}
		if(day.format('E').contains("Sun")){
			sum--
		}
		println leapYears
		return sum
	}
	def test(){
		if(day.format('E').contains("Sun")){
			sum++
		}
	}
}
