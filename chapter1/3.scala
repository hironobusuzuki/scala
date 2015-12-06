// 新しい型を作れる言語
import java.math.BigInteger

def factorical(x: BigInteger): BigInteger =
  if (x == BigInteger.ZERO)
    BigInteger.ONE
  else
    x.multiply(factorical(x.subtract(BigInteger.ONE)))
println(factorical(new BigInteger("30")))
