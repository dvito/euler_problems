# The file, poker.txt, contains one-thousand random hands dealt to two players. Each line of the file contains ten cards (separated by a single space): the first five are Player 1's cards and the last five are Player 2's cards. You can assume that all hands are valid (no invalid characters or repeated cards), each player's hand is in no specific order, and in each hand there is a clear winner.

class Hand
  VALUEHASH={
  	"2" => 2,
  	"3" => 3,
  	"4" => 5,
  	"5" => 7,
  	"6" => 11,
  	"7" => 13,
  	"8" => 17,
  	"9" => 19,
  	"T" => 23,
  	"J" => 29,
  	"Q" => 31,
  	"K" => 37,
  	"A" => 41
  }
  attr_accessor(:hand)
  def hand
    @hand || []
  end

  def initialize(hand)
    self.hand = hand
  end

  def value
  	value = 1
  	hand.map{|n| value *= VALUEHASH[n[0]]}
  	value
  end

  def flush?
  	hand.map{|n| n[1]}.uniq.length==1
  end
end

File.open('poker.txt').each do |line|
	cards = line.split(' ')
	p1 = Hand.new(cards[0,5])
	p2 = Hand.new(cards[5,5])
	puts "#{p1.inspect}-#{p1.value}-#{p1.flush?}"
	puts "#{p2.inspect}-#{p2.value}-#{p2.flush?}"
end