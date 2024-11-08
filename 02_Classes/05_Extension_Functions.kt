fun Int.r(): RationalNumber = RationalNumber(this, 1)

// Since extension functions can access public members, no need to use this.member_name (like this.first and this.second)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(val numerator: Int, val denominator: Int)
