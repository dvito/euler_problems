def factorial(num)
	if num > 0 
		(1..num).inject(:*)
	else
		1
	end
end
n=1
hash={}
count = 0
while n <= 100
	nfact = hash.fetch(n){|num| factorial(num) }
	r = n
	while r > 0 
		rfact = hash.fetch(r){|num| factorial(num) }
		nrfact = hash.fetch(n-r){|num| factorial(num)}
		combinations = nfact / (rfact * nrfact)
		if combinations > 1000000
			count +=1
		end
		r-=1
	end
	n +=1
end
puts count