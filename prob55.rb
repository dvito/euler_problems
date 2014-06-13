def reverse_and_sum(n)
	n + n.to_s.reverse.to_i
end

num_found=0
(0..9999).each do |n|
	lychrel_found = false
	iteration = 1
	sum=n
	while iteration < 50 && !lychrel_found
		sum = reverse_and_sum(sum)
		if sum.to_s == sum.to_s.reverse
			lychrel_found = true
		end
		iteration = iteration + 1
	end
	if iteration == 50
		num_found = num_found+1
	end
end
puts num_found