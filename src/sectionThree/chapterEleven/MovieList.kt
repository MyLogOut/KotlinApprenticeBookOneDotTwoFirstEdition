package sectionThree.chapterEleven

class MovieList(var listName: String, var movies: MutableList<String>) {
    fun showMovies() {
        println("List name: $listName")
        movies.withIndex().forEach { println("${it.index}. ${it.value}") }
    }
}