sum = 0
[0,1,2,3,4,5,6,7,8,9].permutation(10).each do |n|
  if n[1,3].join('').to_i % 2 == 0 &&
      n[2,3].join('').to_i % 3 == 0 &&
      n[3,3].join('').to_i % 5 == 0 &&
      n[4,3].join('').to_i % 7 == 0 &&
      n[5,3].join('').to_i % 11 == 0 &&
      n[6,3].join('').to_i % 13 == 0 &&
      n[7,3].join('').to_i % 17 == 0
    sum += n.join('').to_i
    puts sum
  end
end