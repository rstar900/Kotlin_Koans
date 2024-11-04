fun containsEven(collection: Collection<Int>): Boolean =
        collection.any {x -> val hasEven = x % 2 == 0;
            hasEven}
