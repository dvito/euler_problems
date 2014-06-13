string="2."

number = 2
third = 2
while number < 103
	if number % 3 == 0
		string += third.to_s
		third +=2
	else
		string += "1"
	end
	number += 1 
	rat = string.to_r
	puts "#{number}-#{rat.numerator.to_s.chars.map{|n| n.to_i}.each.inject(:+)}" 
end



