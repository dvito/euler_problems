#If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.
#
#{20,48,52}, {24,45,51}, {30,40,50}
#
#For which value of p  1000, is the number of solutions maximised?

class Triangle
  attr_accessor(:a)
  def a
    @a || 0
  end
  attr_accessor(:b)
  def b
    @b || 0
  end
  attr_accessor(:c)
  def c
    @c || 0
  end

  def initialize(a,b,c)
    self.a = a
    self.b = b
    self.c = c
  end

  def valid?
    a**2+b**2==c**2 || a**2+c**2==b**2 || c**2+b**2==a**2
  end
end

hash={}
(800..1000).each do |p|
  (1..p-1).each do |a|
    rem= p-a
    (1..rem-1).each do |b|
      c= rem-b
      if Triangle.new(a,b,c).valid?
        if hash[(a+b+c).to_s] != nil
            hash[(a+b+c).to_s] =  hash[(a+b+c).to_s] + 1
        else
          hash[(a+b+c).to_s]=1
        end
      end
    end
  end
end
largest=0
key=0
hash.each_pair{|k,v|
  if v > largest
    puts "#{k},#{v}"
    key = k
    largest=v
  end
}
puts key