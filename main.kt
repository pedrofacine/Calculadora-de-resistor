fun obterValor (cor: String): Int {
    return when (cor.lowercase()) {
        "preto" -> 0
        "marrom" -> 1
        "vermelho" -> 2
        "laranja" -> 3
        "amarelo" -> 4
        "verde" -> 5
        "azul" -> 6
        "roxo" -> 7
        "cinza" -> 8
        "branco" -> 9
        else -> -1
    }
}
fun obterMultip (cor: String): Double{
    return when (cor.lowercase()){
        "preto" -> 1.0
        "marrom" -> 10.0
        "vermelho" -> 100.0
        "laranja" -> 1_000.0
        "amarelo" -> 10_000.0
        "verde" -> 100_000.0
        "azul" -> 1_000_000.0
        "violeta" -> 10_000_000.0
        "cinza" -> 100_000_000.0
        "branco" -> 1_000_000_000.0
        "dourado" -> 0.1
        "prateado" -> 0.01
        else -> -1.0
    }
}
fun tolerancia(cor: String): String{
    return when (cor.lowercase()) {
        "marrom" -> "+-1%"
        "vermelho" -> "+-2%"
        "verde" -> "+-0.5%"
        "azul" -> "+-0.25%"
        "violeta" -> "+-0.1%"
        "cinza" -> "+-0.05%"
        "dourado" -> "+-5%"
        "prateado" -> "+-10%"
        else -> "Valor inválido"
    }
}
fun main(){
    println("Quantas faixas tem? (4 ou 5)")
    val numFaixas = readLine()


}