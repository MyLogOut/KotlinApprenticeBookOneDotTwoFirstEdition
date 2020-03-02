package sectionThree.chapterEleven.challengeTwoClasses

class ShoppingCart(val tShirts: MutableList<Tshirt> = mutableListOf(), var shippingAddress: Address?) {
    fun addTshirt(tShirt: Tshirt) {
        tShirts.add(tShirt)
    }
    fun totalCost(): Double {
        var total = 0.0
        tShirts.forEach { total += it.price }
        return total
    }
}