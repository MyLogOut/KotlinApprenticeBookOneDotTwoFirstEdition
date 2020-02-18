package sectionOne.chapterSevenNullability


fun main() {
    val myFavoriteSong: String?
    println("How many favorite songs do you have?")
    val songs = readLine().toString().toInt()
    myFavoriteSong = if (songs > 1) null else "Sonne piano version"

    var parsedInt = "10".toIntOrNull() // It is nullable because
                                        // it could be or not null.
    println(parsedInt)
    parsedInt = "dog".toIntOrNull()
    println(parsedInt)

    println(
        if (myFavoriteSong.isNullOrEmpty()) {
            "I don't have a favorite song"
        } else "I have a favorite song called: $myFavoriteSong"
    )
}