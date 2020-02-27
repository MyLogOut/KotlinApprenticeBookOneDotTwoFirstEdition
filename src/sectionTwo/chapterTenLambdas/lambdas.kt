package sectionTwo.chapterTenLambdas

import java.text.DecimalFormat

fun main() {
    val names = arrayOf("ZZZZZZ", "BB", "A", "CCCC", "EEEEE")
    println("Names: ${names.toList()}")
    println("Names: ${names.sorted().toList()}")

    val namesByLength = names
        .sortedWith(
            compareBy {
                -it.length
            })
    println("NamesByLength: $namesByLength")

    val values = listOf(1, 2, 3, 4, 5, 6)
    values.forEach { println("$it: ${it * it}") }

    val prices = listOf(1.5, 10.0, 4.99, 2.30, 8.19)
    val largePrices = prices.filter {
        it > 5.0
    }
    println("Prices: $prices\nLargest prices: $largePrices")

    val discountPercentage = 0.90
    val salePrices = prices.map { it*discountPercentage }
    println("With discount of ${discountPercentage*100}%: $salePrices")

    val userInput = listOf("0", "11", "hack", "42")
    var numbers = userInput.map { it.toIntOrNull() }
    println("User input: $userInput\nTo integer or null: $numbers")
    numbers = userInput.mapNotNull { it.toIntOrNull() }
    println("User input: $userInput\nTo integer or null but not nulls printed: $numbers")

    val pricesSum = prices.fold(0.0) { a, b -> a + b }
    println("Prices: $prices\nTotal with Fold [.fold]: $pricesSum")

    val pricesReduceMethod = prices.reduce { a, b -> a + b }
    println("Total with Reduce [.reduce]: $pricesReduceMethod")

    val stock = mapOf(1.5 to 5, 10.0 to 2, 4.99 to 20, 2.30 to 5, 8.19 to 30)
    var stockSum = 0.0
    stock.forEach { stockSum += it.key * it.value;println(stockSum) }

    println("Stock: $stock\nStock total: $stockSum")


}