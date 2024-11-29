fun main(args: Array<String>) {
    val doisPontos = 22
    var numberSign = 1
    var total = 45
    var linhas = 10
    var i = 0

    for (i in 0 until linhas) {
        if (i == 9) {
            imprimirCaracter(':', total)
            println()
        } else {
            imprimirCaracter(':', doisPontos)
            imprimirCaracter('#', numberSign)
            imprimirCaracter(':', doisPontos)
            println()

            if (i > 3) {
                doisPontos += 3
                numberSign -= 6
            } else {
                doisPontos -= 3
                numberSign += 6
            }
        }
    }
}

private fun imprimirCaracter(caractere: Char, quantidade: Int) {
    repeat(quantidade) {
        println(caractere)
    }
}
