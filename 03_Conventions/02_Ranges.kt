fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    // the rangeTo() and contains() are generated if you implement
    // compareTo() for the class yourself
    return date in first..last
}
