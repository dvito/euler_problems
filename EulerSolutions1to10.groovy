class EulerSolutions1to10 {
	
	def problem10(){
		long sum = 0
		File handle = new File("primesTo2000000.txt")
		def list = handle.readLines()
		list.each{sum+=Integer.parseInt(it)}
		return sum
	}
	def problem9(){
		def c
		for(a in 1..1000){
			for (b in a..1000){
				c= 1000-(b+a)
				if((a*a + b*b) == (c*c)){
					println a+" "+b+" "+c
					return a*b*c
				}
			}
		}
	}
	def problem8(){
		def target= "1000digitnum.txt"
		File handle = new File(target)
		def numberLine
		handle.eachLine {line -> numberLine= line}
		def list = numberLine.getChars()
		def largestProd =0
		def currentProd =0
		for(int i=0; i<list.size()-4;i++){
			currentProd = Integer.parseInt(""+list.getAt(i))*Integer.parseInt(""+list.getAt(i+1))*Integer.parseInt(""+list.getAt(i+2))*
			Integer.parseInt(""+list.getAt(i+3))*Integer.parseInt(""+list.getAt(i+4))
			if(currentProd>largestProd)
				largestProd=currentProd
		}
		return largestProd
	}
	def problem7(){
		def prime=3
		for(i in 3..10002){
			prime=getNextPrime(prime)
			println prime
		}
		return prime
	}
	def problem6(){
		def list = []
		for( i in 1..100){
			list.add(i)
		}
		def sum = 0
		list.each{sum+=it}
		def squareOfSum = sum * sum
		
		def list2= []
		list.each{list2.add(it*it)}
		def sumOfSquares=0
		list2.each{sumOfSquares+=it}
		
		list.each{println it}
		println list.size()
		println squareOfSum
		println sumOfSquares
		
		return squareOfSum - sumOfSquares
		
	}
	def problem5(){
		def notFound=true
		def num=20
		while(notFound){
			foo: for(i in 1..20){
				if(num%i==0){
					if(i==20)
						notFound=false
				}else{
					break foo
				}
			}
			num+=2
		}
		return num-2
	}
	def problem4(){
		def largestPalindrome = 0
		def curNum
		foo:for (i in 999..100){
			bar:for(j in 999..100){
				curNum= j * i
				if (isPalindrome((String)curNum)&& curNum>largestPalindrome)
					largestPalindrome = curNum
			}
		}
		return largestPalindrome
	}
	
	
	def isPalindrome(num){
		num == num.reverse()
	}
	
	def problem3(numToFactor){
		def currentPrime =3
		def lastGoodPrime = 0
		if(numToFactor%2==0){
			lastGoodPrime=2
		}
		if(numToFactor%3==0){
			lastGoodPrime=3
		}
		def stop = Math.sqrt (numToFactor)
		while(currentPrime<stop){
			if(numToFactor%currentPrime==0){
				lastGoodPrime=currentPrime
			}
			currentPrime = getNextPrime(currentPrime)
			println currentPrime
		}
		return lastGoodPrime
	}
	
	def getNextPrime(inputPrime){
		def curNum = inputPrime
		curNum+=2
		def tester=2
		def stop= curNum/2
		while(tester<=stop){
			if(curNum%tester==0){
				curNum+=2
				tester=2
				stop= curNum/2
			}else if(tester==2){
				tester = 3
			}else{
				tester = tester + 2
			}
		}
		return curNum
	}
	def problem2(limit){
		def lastFib = 0
		def curFib = 1
		def temp = 0
		def sum=0
		while (curFib< limit){
			temp=curFib
			curFib = lastFib +curFib
			lastFib=temp
			if(curFib%2==0){
				sum+=curFib
			}
		} 
		return sum
	}
	
		
	def problem1(limit){
		def i=3
		def j=5
		def sum=0
		while(i<limit){
			sum+=i
			i+=3
		}
		while(j<limit){
			if(j%3!=0){
				sum+=j
			}
			j+=5
		}
		return sum
	}

}
