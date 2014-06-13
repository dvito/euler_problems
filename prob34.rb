

def factorial(n)
	product=1
	while n>0
		product = product * n
		n = n -1
	end
	product
end

hash = {}
(0..9).each do |x|
	hash["#{x}"]=factorial(x)
end

totalsum=0
(3..3628800).each do |x|
	sum = 0
	x.to_s.chars.each do |char|
		sum = sum + hash[char].to_i
	end
	if sum == x
		puts x
		totalsum= totalsum+x
	end
end
puts totalsum
puts hash.inspect