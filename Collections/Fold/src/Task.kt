// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    val allProducts = Customer.getOrderedProducts().toSet(
}

fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap { it.products }