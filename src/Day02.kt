fun main() {
    fun part1(input: List<String>): List<String> {
        var cont = 0
        var game = mutableListOf<String>()

        while (cont < input.size) {
            val games = input[cont].split(":")
            game = games[1].split(";").toMutableList()

            for (turn in game){
                println(turn)
            }
            cont++
        }
        game.map {  }
        return game
    }

    fun part2(input: List<String>): Int {
        return input.size
    }


    val input = readInput("Day02")
    part1(input).println()
    part2(input).println()
}

