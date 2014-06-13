x = 90

totals = []

while x < 100
	y = 90
	while y < 100
		n = x ** y
		totals << n.to_s.chars.map{|i| i.to_i}.inject{|accum, num| accum + num }
		y +=1
	end
	x +=1
end
puts totals.sort