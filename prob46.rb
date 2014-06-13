require 'mathn'
require 'pry'

primes =[]
(1..100000).each do |n|
	if n.prime?
		primes << n
	end
end

notFound = true
n = 15.0
while notFound
	found = false
	primes.each do |y|
		difference = n - y
		if difference > 0
			if Math.sqrt(difference/2.0 )== (Math.sqrt(difference/2.0)).to_i
				found = true
			end
		else
			break
		end
	end
	if found == false && !n.to_i.prime?
		notFound=false
		puts n
	else
		n += 2
	end
end