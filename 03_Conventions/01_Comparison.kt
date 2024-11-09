data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    // Adding compareTo() operator overload will make it comparable class
    override operator fun compareTo(other: MyDate): Int {
        // Compare in order of year, month and then day (if anything unequal return a value)
        return when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            else -> dayOfMonth - other.dayOfMonth
        }
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
