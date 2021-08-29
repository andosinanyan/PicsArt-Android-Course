fun Shop.getSetOfCustomers(): Set<Customer> {
        var custumer = mutableSetOf<Customer>()
        customers.forEach { custumer.add(it) }
        return custumer
        // = customers.toSet()
}

