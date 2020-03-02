package sectionThree.chapterEleven

class User(
    var firstName: String,
    var lastName: String
) {
    var movieList: MutableMap<String, MovieList> = mutableMapOf()

    fun addMovies(movie: MovieList) {
        movieList[movie.listName] = movie
    }

    fun list(name: String): MovieList? {
        return if (movieList.keys.contains(name))
            movieList[name]
        else null
    }
}