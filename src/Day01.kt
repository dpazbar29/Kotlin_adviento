fun main() {
    fun part1(input: List<String>): Int {
        val suma = mutableListOf<Int>()
        var final : Int = 0
        for (lineas in input){
            val linea = lineas.lines()

            for (lineaFinal in linea) {
                val numeros = lineaFinal.filter { it.isDigit() }.map { it.toString().toInt() }


                val primerNumero = numeros.firstOrNull() ?: 0
                val ultimoNumero = numeros.lastOrNull() ?: 0

                val numeroTotal = (primerNumero.toString() + ultimoNumero.toString()).toInt()
                suma.add(numeroTotal)
            }
            final = suma.sum()
        }

        return final
    }

    fun part2(input: List<String>): Int {
        for (linea in input){
            val numeros = linea.filter {it.isDigit() || it in setOf("o", "n", "e", "t", "w", "h", "f", "u", "r", "v", "s", "x")}
        }

        for (linea in input.reversed()){

        }
        return input.size
    }


    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}