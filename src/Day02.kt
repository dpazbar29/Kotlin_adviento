fun main() {
    fun part1(input: List<String>):String{
        var cont = 0
        var a: Int? = 0
        var game = ""

        while (cont < input.size){
            val delimiter = ":"
            val games = input[cont].split(delimiter)
            game = games[1].split(";").toString()
            cont += 1
        }

        return game
    }
    fun part2(input: List<String>): Int {
        return input.size
    }



    val input = readInput("Day02")
    part1(input).println()
    part2(input).println()
}

