require 'mathn'
max_a = 1000
max_b = 1000
a = -999
b = -999

largest=0
n=0
while a < 1000
	while b < 1000
			break_n_test = false
			while break_n_test == false
				prime_possibility = n * n + a * n + b
				if !prime_possibility.prime?
					break_n_test = true
					if n > largest
						largest=n
						puts "a=#{a},b=#{b},n=#{n},l=#{largest}"
					end
				else
					n=n+1
				end
			end
		n=0
		b=b+1
	end
	a = a + 1
	b = -999
end
