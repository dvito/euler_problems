require 'mathn'
require 'pry'

primes =[]
cumsum= []
(1..1000000).each do |n|
	if n.prime?
		primes << n
	end
end

cumsum[0]=2
primes.each_with_index do |n,index|
	if index > 0
		cumsum[index]= cumsum[index-1] + n
	else
		cumsum[index]=n
	end
end

cumsum.reverse_each do |n|
	y = 0 
	index = cumsum.index(n)
	while y < index
		prime=n - cumsum[y]
		if primes.include? prime
			puts prime
		end
		y += 1
	end
end