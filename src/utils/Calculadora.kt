package utils

/**
 * Classe singleton Calculadora.
 * D'aquesta classe només se'n podrà crear un objecte.
 * S'usa a mode de llibreria d'atributs i mètodes similar al concepte de classe estàtica
 * que podem trobar a Java.
 * @author RIS
 */
object Calculadora {
    internal fun suma(a: Float, b: Float): Float{
        return a + b
    }
}