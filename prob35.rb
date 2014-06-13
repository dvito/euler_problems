require 'mathn'
count = 0
(2..1000000).each do |n|
	is_rotating_prime = true
	puts n
	if n.prime?
		cur = n.to_s.chars.to_a.rotate.join.to_i
		breakloop=false
		while cur != n && breakloop == false
			if !cur.prime?
				is_rotating_prime = false
				breakloop=true
			end
			cur = cur.to_s.chars.to_a.rotate.join.to_i
			puts cur
			if cur.to_s.length < n.to_s.length
				if !cur.prime?
					is_rotating_prime = false
					breakloop=true
				end
				cur = ('0'.concat(cur.to_s)).chars.to_a.rotate.join.to_i
				puts cur
			end
			
		end
		if !cur.prime?
			is_rotating_prime = false
		end
	else
		is_rotating_prime=false
	end
	count = count + 1 if is_rotating_prime
end

puts count