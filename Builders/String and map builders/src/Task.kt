import javax.swing.UIManager.put

fun <K, T>buildMap(buildMap: HashMap<K, T>.() -> Unit): Map<K, T> {
    val returnMap  = HashMap<K, T>() ;
    returnMap.buildMap();
    return returnMap
}
fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
