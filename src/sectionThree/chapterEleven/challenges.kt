package sectionThree.chapterEleven

import sectionThree.chapterEleven.challengeTwoClasses.Address
import sectionThree.chapterEleven.challengeTwoClasses.ShoppingCart
import sectionThree.chapterEleven.challengeTwoClasses.Tshirt
import sectionThree.chapterEleven.challengeTwoClasses.shopUser

fun main() {
    challenges()
}

fun challenges() {
    challengeOne()
    challengeTwo()
    challengeThree()
    challengeFour()
    challengeFive()
    challengeSix()
    challengeSeven()
    challengeEight()
    challengeNine()
    challengeTen()
}

fun challengeOne(){
    /*Challenge 1: Movie lists
    Imagine you’re writing a movie-viewing application in Kotlin. Users can create lists of
            movies and share those lists with other users.
    Create a User class and a MovieList class that maintains lists for users.
    • User: Has a method addList() which adds the given list to a mutable map of
    MovieList objects (using the name as a key), and list(): MovieList? which will
    return the MovieList for the provided name.
    • MovieList: Contains a name and a mutable list of movie titles. A print method will
    print all the movies in the movie list.
    • Create jane and john users and have them create and share lists. Have both jane and
    john modify the same list and call print from both users. Are all the changes
            reflected?*/
    val firstMovieList = mutableListOf("Ice age 1", "Ice age 2", "Ice age 3")
    val secondMovieList = mutableListOf("Pirates of the Caribbean 1", "Pirates of the Caribbean 2", "Pirates of the Caribbean 3")
    val firstMoviePackName = "Ice age"
    val secondMoviePackName = "Pirates of the Caribbean"
    val firstMoviePack = MovieList(firstMoviePackName, firstMovieList)
    val secondMoviePack = MovieList(secondMoviePackName, secondMovieList)
    val oneListForBoth = MovieList("Liked Movies",(firstMovieList + secondMovieList).toMutableList())

    val jane = User("Jane", "Mccarthy")
    val john = User("John", "Travolta")

    jane.addMovies(firstMoviePack)
    john.addMovies(secondMoviePack)

    jane.addMovies(secondMoviePack)
    john.addMovies(firstMoviePack)

    println("Movie Lists:")
    firstMoviePack.showMovies()
    secondMoviePack.showMovies()

    println("Movie Classes Lists:")
    println("Jane Movie list $firstMoviePackName:")
    jane.list(firstMoviePackName)
    jane.movieList[firstMoviePackName]?.showMovies()
    println("John Movie list: $firstMoviePackName")
    john.list(firstMoviePackName)
    john.movieList[firstMoviePackName]?.showMovies()

    jane.addMovies(oneListForBoth)
    john.addMovies(oneListForBoth)

    println("Jane oneForBoth movie list [Liked List]")
    jane.movieList["Liked Movies"]?.movies?.add("Rob Travolta")
    john.movieList["Liked Movies"]?.movies?.add("McLoving")
    println("John oneForBoth movie list [Liked List]")
    jane.movieList["Liked Movies"]?.showMovies()
    john.movieList["Liked Movies"]?.showMovies()

}
fun challengeTwo(){
    /*Challenge 2: T-Shirt store — data classes
    Your challenge here is to build a set of objects to support a T-shirt store. Decide if each
    object should be a class or a data class, and go ahead and implement them all.
    • TShirt: Represents a shirt style you can buy. Each TShirt has a size, color, price, and
    an optional image on the front.
    • User: A registered user of the t-shirt store app. A user has a name, email, and a
    ShoppingCart (see below).
    • Address: Represents a shipping address, containing the name, street, city, and zip
    code.
    • ShoppingCart: Holds a current order, which is composed of a list of TShirts that the
    User wants to buy, as well as a method to calculate the total cost. Additionally, there
    is an Address that represents where the order will be shipped.*/
    val newAddress = Address("Carl Address","Sabra Familiars", "San Isidro", 11901)
    val shoppingCart = ShoppingCart(mutableListOf(), newAddress)
    val tShirtList: MutableList<Tshirt> = mutableListOf(
        Tshirt("S", "red", 15.0, "dcTshirt.jpg"),
        Tshirt("M", "red", 16.5, "adidasTshirt.jpg"),
        Tshirt("X", "red", 19.0, "nikeTshirt.jpg"),
        Tshirt("XL", "red", 25.0, "pumaTshirt.jpg"))
    tShirtList.forEach { shoppingCart.addTshirt(it) }
    val carl = shopUser(name = "Carl", email = "carl@mail.com", shoppingCart = shoppingCart)

    println("${carl.name} your order, which contains the following elements:")
    shoppingCart.tShirts.forEach { println(it.toString()) }
    println("Will be shipped to: ${shoppingCart.shippingAddress.toString()}\n And has a total cost of: ${shoppingCart.totalCost()}")
}
fun challengeThree(){

}
fun challengeFour(){

}
fun challengeFive(){

}
fun challengeSix(){

}
fun challengeSeven(){

}
fun challengeEight(){

}
fun challengeNine(){

}
fun challengeTen(){

}