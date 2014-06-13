#The nth term of the sequence of triangle numbers is given by, tn = ½n(n+1); so the first ten triangle numbers are:
#
#1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
#
#By converting each letter in a word to a number corresponding to its alphabetical position and adding these values we form a word value. For example, the word value for SKY is 19 + 11 + 25 = 55 = t10. If the word value is a triangle number then we shall call the word a triangle word.
#
#Using words.csv (right click and 'Save Link/Target As...'), a 16K text file containing nearly two-thousand common English words, how many are triangle words?
require 'csv'

class Integer
  def triangle
    (self.to_i * (self.to_i + 1)) / 2
  end
end

class String
  LETTERS = ("A".."Z").to_a
  def sum_value
    sum = 0
    self.to_s.chars.each do |n|
      sum += LETTERS.index(n)+1
    end
    sum
  end
end
triangle_arr = []
(1..19).each do |n|
  triangle_arr << n.triangle
end
count = 0
CSV.foreach("words.csv", :headers => true, :return_headers => false, :quote_char=>'"', :row_sep => ',') do |row|
  sum = row[0].sum_value

  puts "N,#{row[0]}-Sum,#{sum}-Triangle,#{triangle_arr.include? sum}"
  if triangle_arr.include? sum
    count+=1
  end
end
puts count