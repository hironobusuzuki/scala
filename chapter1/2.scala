// 新しい型をつくれる言語
def factorical(x: BigInt): BigInt =
  if (x == 0) 1 else x * factorical(x - 1)
println(factorical(30))
