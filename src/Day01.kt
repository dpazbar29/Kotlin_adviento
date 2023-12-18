fun main() {
    fun part1(input: List<String>): Int {
        var cont = 0
        val salida = mutableListOf<String>()
        while (cont < 999){
            for (caracter in input[cont]){
                val numeros = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "0")
                if (numeros.toString().contains(caracter)){
                    salida.add(caracter.toString())
                }
            }
            println(salida)
            cont++
        }
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }


    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}

