class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        // We create an anonymous object which implements the
        // Iterator<MyDate> interface
        return object: Iterator<MyDate> {

            // We need to keep state of currently
            // iterated date, so we create a MyDate object
            // to track it
            var currentDate: MyDate = start

            // We need to implement next() and hasNext() to
            // iterate over the sequence of MyDate

            override fun hasNext(): Boolean {
                // Check if the current date is valid
                // and within bounds

                return currentDate.year > 0 &&
                        currentDate.month > 0 &&
                        currentDate.dayOfMonth > 0 &&
                        currentDate <= end

            }

            override fun next(): MyDate {
                // Since we need to return current date first
                // we store it in oldDate and progress
                // currentDate to the next
                val oldDate = currentDate
                if (this.hasNext()){
                    currentDate = currentDate.followingDate()
                }
                return oldDate
            }
        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
