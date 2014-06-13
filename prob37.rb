require 'mathn'


arrTruncatable=[0]

def checkTruncatable(n,arrTruncatable)
	isPrime=true
	# left to right
	n.to_s.chars.each_with_index do |x,index|
		if !n.to_s[index,n.to_s.length].to_i.prime?
			isPrime=false;
		end
	end
	# right to left
	n.to_s.chars.each_with_index do |x,index|
		if !n.to_s[0,n.to_s.length-index].to_i.prime?
			isPrime=false;
		end
	end
	if isPrime
		puts n
		arrTruncatable << n
	end
end

(8..1000000).each do |n|

	if n.prime?
		checkTruncatable(n,arrTruncatable)
	end
end


sum =0 
arrTruncatable.each do |y|
	sum += y
end
puts sum

