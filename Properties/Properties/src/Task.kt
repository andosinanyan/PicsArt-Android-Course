class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(value){
            counter++
            field = value
        }
}
