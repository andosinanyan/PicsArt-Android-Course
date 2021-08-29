// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer): Product? {
   return  customer.orders.filter{it.isDelivered}.flatMap { it.products }.maxBy { it.price }
}

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
   return this.customers.flatMap { it.orders }
                        .flatMap { it.products }
                        .filter{it.name == product.name}
                        .count()
}

fun Customer.getOrderedProducts(): List<Product> =
        this.orders.flatMap { it.products }
