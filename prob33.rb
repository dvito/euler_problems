# The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.

# We shall consider fractions like, 30/50 = 3/5, to be trivial examples.

# There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing two digits in the numerator and denominator.

# If the product of these four fractions is given in its lowest common terms, find the value of the denominator.
fractions = []
n=10.0
while n<100
  numerator = n
  denominator = 99.0
  while denominator > n
  	if numerator % 10 != 0 || denominator % 10 != 0
  		first_n = numerator.to_s.chars.to_a[0].to_f
  		second_d = denominator.to_s.chars.to_a[1].to_f
	  	if first_n / second_d == numerator/denominator 
	  		fractions << [numerator,denominator]
	  	end
  	end
  	denominator -= 1
  end
  n+=1
end
top = 1.0
bottom = 1.0 
fractions.each do |x|
	top *= x[0]
	bottom *= x[1]

  puts "#{x[0]} - #{x[1]}"
end
puts top
puts bottom
puts (top/bottom).denominator

puts ((13.0/65.0)*(19.0/95.0)*(16.0/64.0)*(49.0/98.0)).denominator



