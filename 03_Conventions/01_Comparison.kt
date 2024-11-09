data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    // Adding compareTo() operator overload will make it comparable class
    override operator fun compareTo(other: MyDate): Int {
        // Compare in order of year, month and then day (if anything unequal return a value)
        val result =  when (val yrRes = year.compareTo(other.year)) {
            0 -> when (val monRes = month.compareTo(other.month)) {
                0 -> when (val dayRes = dayOfMonth.compareTo(other.dayOfMonth)) {
                    0 -> 0
                    else -> dayRes
                }
                else -> monRes
            }
            else -> yrRes
        }
        return result
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
