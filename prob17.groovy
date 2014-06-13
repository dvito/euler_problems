
class prob17 {

	def solve(input){
		def map=['1':"one",'2':"two",'3':"three",'4':"four",'5':"five",'6':'six','7':'seven','8':'eight',
			'9':'nine','10':'ten','20':'twenty','30':'thirty','40':'forty','50':'fifty','60':'sixty',
			'70':'seventy','80':'eighty','90':'ninety','11':'eleven','12':'twelve','13':'thirteen','14':'fourteen'
			,'15':'fifteen','16':'sixteen','17':'seventeen','18':'eighteen','19':'nineteen']
		def str = ""
		def num=0
		for(i in 1..999){
			num=i
			if(num>=100){
				str+= map[""+num.toString().charAt(0)]+"hundred"
				num=num%100
				if(num>0){
					str+='and'
				}
			}
			if(num>=20){
				str+=map[""+num.toString().charAt(0)+"0"]
				num=num%10
			}
			if(num>=10){
				str+=map[num.toString()]
			}
			else if(num>0){
				str+=map[""+num.toString().charAt(0)]
			}else{
			
			}
		}
		str = str + "onethousand"
		println str
		return str.length()
	}
}
