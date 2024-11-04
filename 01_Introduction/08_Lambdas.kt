fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { it % 2 == 0 } // Implicit param should be named 'it'
