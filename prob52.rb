ts = Time.now
hash = {}
n=100000
notFound=true
while notFound
	a=hash.fetch(n){|num| num.to_s.chars}
	b=hash.fetch(n*2){|num| num.to_s.chars}
	c=hash.fetch(n*3){|num| num.to_s.chars}
	d=hash.fetch(n*4){|num| num.to_s.chars}
	e=hash.fetch(n*5){|num| num.to_s.chars}
	f=hash.fetch(n*6){|num| num.to_s.chars}
	if (a & b).length == a.length &&
		(a & c).length == a.length &&
		(a & d).length == a.length &&
		(a & e).length == a.length &&
		(a & f).length == a.length
		puts n
		notFound=false
	end
	n +=1
end
tf = Time.now
puts "#{tf-ts}ms"