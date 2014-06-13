# The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330, is unusual in two ways: (i) each of the three terms are prime, and, (ii) each of the 4-digit numbers are permutations of one another.

# There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, exhibiting this property, but there is one other 4-digit increasing sequence.

# What 12-digit number do you form by concatenating the three terms in this sequence?
require 'mathn'
primes = []
(1000..9999).each do |n|
	if n.prime?
		primes << n
	end
end

validarr=[]
primes.each do |n|
	testarray=primes.select { |num| 
		a = n.to_s.chars.uniq
		b = num.to_s.chars.uniq
		if a.length == b.length
			((a & b ).length == a.length)
		else
			false
		end}
	testarray.each_with_index do |n,index|
		t = index+1
		while t < testarray.length
			sum = testarray[t] - n
			if testarray.include?(n + sum) && testarray.include?(n+(sum*2))
				if !validarr.include? [n,n+sum,n+(sum*2)]
					validarr << [n,n+sum,n+(sum*2)]
				end
			end
			t+=1
		end
	end
end
puts validarr.inspect