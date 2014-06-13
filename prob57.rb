# It is possible to show that the square root of two can be expressed as an infinite continued fraction.

#  2 = 1 + 1/(2 + 1/(2 + 1/(2 + ... ))) = 1.414213...

# By expanding this for the first four iterations, we get:

# 1 + 1/2 = 3/2 = 1.5
# 1 + 1/(2 + 1/2) = 7/5 = 1.4
# 1 + 1/(2 + 1/(2 + 1/2)) = 17/12 = 1.41666...
# 1 + 1/(2 + 1/(2 + 1/(2 + 1/2))) = 41/29 = 1.41379...

# The next three expansions are 99/70, 239/169, and 577/408, but the eighth expansion, 1393/985, is the first example where the number of digits in the numerator exceeds the number of digits in the denominator.

# In the first one-thousand expansions, how many fractions contain a numerator with more digits than denominator?
number = 0
evalform=""
formula="Rational(1) + Rational(1)/@"
count = 0

while number < 1000
	if number == 0
		evalform=formula.gsub("@","Rational(2)")
	else
		evalform=formula.gsub("@","Rational(2)")
	end
	formula=formula.gsub("@","(Rational(2)+Rational(1)/@)")
	result = eval(evalform)
	rat = result.to_r
	if rat.numerator.to_s.chars.length > rat.denominator.to_s.chars.length
		count += 1
	end
	number += 1
end
puts count