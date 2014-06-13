#Take the number 192 and multiply it by each of 1, 2, and 3:
#
#192  1 = 192
#192  2 = 384
#192  3 = 576
#By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)
#
#The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).
#
#What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n  1?
require 'mathn'
class Fixnum

  def one_to_nine_pandigital?
   intersection = ["1", "2", "3", "4", "5", "6", "7", "8", "9"] & self.to_s.chars.to_a
   intersection.length == 9 && !intersection.include?("0")
  end

end

puts 192384576.one_to_nine_pandigital?
largest_pan = 192384576
(9182..9500).each do |n|
  concat_prod = ""
  counter = 1
  while concat_prod.length < 9
    concat_prod << (n * counter).to_s
    counter += 1
  end
  if concat_prod.to_i.one_to_nine_pandigital?
    if concat_prod.to_i > largest_pan
      largest_pan = concat_prod.to_i
    end
  end
end
puts largest_pan