def sum_roman_numeral(str_numeral,hash)
	sum = 0
	skip_next = false
	char_array = str_numeral.chars.to_a
	char_array.each_with_index do |char,index|
		if !skip_next
			if char == "I"
				if char_array[index+1] == "V"
					sum = sum + 4
					skip_next = true
			    elsif char_array[index+1] == "X"
			    	sum = sum + 9
					skip_next=true
				else
					sum = sum + 1
				end
			elsif char == "X"
				if char_array[index+1] == "L"
					sum = sum + 40
					skip_next = true
			    elsif char_array[index+1] == "C"
			    	sum = sum + 90
					skip_next = true
				else
					sum = sum + 10
				end
			elsif char == "C"
				if char_array[index+1] == "D"
					sum = sum + 400
					skip_next = true
			    elsif char_array[index+1] == "M"
			    	sum = sum + 900
					skip_next = true
				else
					sum = sum + 100
				end
			else
				sum = sum + hash[char.to_s].to_i
			end
		else
			skip_next=false
		end
	end
	sum
end
NUMERALS = { M: 1000, CM: 900, D: 500, CD: 400, C: 100, XC: 90,
               L: 50, XL: 40, X: 10, IX: 9, V: 5, IV: 4, I: 1 }

def create_roman_numeral(number)
  return '' if number <= 0
  NUMERALS.each { |key, val| return key.to_s + solution(number - val) if number >= val }
end

def dif_most_efficient(str_numeral,hash)
	old_sum = sum_roman_numeral(str_numeral,hash)
	new_num = create_roman_numeral(old_sum,hash)
	puts "N:#{str_numeral} Sum:#{old_sum} Length:#{str_numeral.length} New_num:#{new_num} New_Length:#{new_num.length}"
	if new_num.length < str_numeral.length
		return str_numeral.length - new_num.length
	else
		0
	end
end
hash= Hash.new
hash["I"] = 1
hash["V"] = 5
hash["X"] = 10
hash["L"] = 50
hash["C"] = 100
hash["D"] = 500
hash["M"] = 1000
sum = 0
IO.readlines("roman.txt").each do |x|
	sum = sum + dif_most_efficient(x.strip,hash)
end
puts sum