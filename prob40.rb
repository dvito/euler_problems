arr=[]
val = 1
(0..10).each do |x| 
	arr << val * 10 ** x
end
digits=0
digit_arr=[]
pos=0
puts arr.inspect
(1..1000000).each do |n|
	digits = digits + n.to_s.length
	if digits == arr[pos]
		digit_arr << n.to_s.chars.to_a.last
		pos = pos + 1
		puts "n#{n},digits#{digits},post#{pos}"
		puts n.to_s.chars.to_a.last
	elsif digits > arr[pos]
		digit_arr << n.to_s.chars.to_a[n.to_s.length-(digits-n.to_s.length)-1]
		pos = pos + 1
		puts "n#{n},digits#{digits},post#{pos},arr_pos#{arr[pos]-(digits-n.to_s.length)-1}"
		puts n.to_s.chars.to_a[arr[pos]-(digits-n.to_s.length)-1]
	else
	end
end
product = 1
(0..7).each do |y|
	product = product * digit_arr[y].to_i
end
puts product