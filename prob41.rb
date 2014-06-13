#We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once.
#For example, 2143 is a 4-digit pandigital and is also prime.
#
#What is the largest n-digit pandigital prime that exists?require 'prime'
require 'mathn'
class Integer
  def n_pandigital(n)
    arr=["1","2","3","4","5","6","7","8","9"]
    intersection = arr[0..n-1] & self.to_s.chars
    intersection.length == n && !intersection.include?("0")
  end
end

largest = 1
(1234567..7654321).reverse_each do |n|
  if n.prime?
    if n.n_pandigital(n.to_s.length)
       puts n
       break;
    end
  end
end