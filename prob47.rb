require 'pry'
def generate(n, factors=[])
  return factors if n == 1
  new_factor = (2..n).find {|f| n % f == 0} 
  generate(n / new_factor, factors + [new_factor])
end

hash = {}
n = 2
notFound = true
while notFound
	a = hash.fetch(n){|n| 
		generate(n,[]).uniq}
	b = hash.fetch(n+1){|n| 
		generate(n,[]).uniq} 
	c = hash.fetch(n+2){|n| 
		generate(n,[]).uniq} 
	d = hash.fetch(n+3){|n| 
		generate(n,[]).uniq}
	if a.length==4 && b.length==4 && c.length==4 && d.length==4
		notFound = false
	else	
		n += 1
	end
end
puts n