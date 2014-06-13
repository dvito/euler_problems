# For a positive integer n, let σ(n) be the sum of all divisors of n, so e.g. σ(6) = 1 + 2 + 3 + 6 = 12.
# A perfect number, as you probably know, is a number with σ(n) = 2n.
# Let us define the perfection quotient of a positive integer as p(n) = σ(n) / n
# Find the sum of all positive integers n  1018 for which p(n) has the form k + 1⁄2, where k is an integer.
def resilience(n)
denominator = n
numerator = 1.0
resilent = denominator / 2.0
while numerator < denominator
	rational = Rational(numerator,denominator)
	if rational.denominator  == denominator
		resilent += 1
	end
	numerator += 2
end
  return Rational(resilent - 1,denominator - 1)
end



denom = 127000
notFound = true
target = Rational(15499,94744)
while notFound
	if denom % 2 == 0 && denom % 3 == 0 && denom % 5 == 0
		resil = resilience(denom)
		if resil < target
			notFound=false
		else
			puts denom
			denom +=10
		end
	else
		denom += 10
	end
end
puts denom