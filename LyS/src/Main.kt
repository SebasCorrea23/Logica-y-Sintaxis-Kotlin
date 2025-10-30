//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Ejercicio 1

    val edad: Int = 23
    var altura: Double = 1.78
    val nombre: String = "Sebastián"
    var esVerdadero: Boolean = true
    val caracter: Char = '#'

    println("La edad es $edad")
    println("La altura es $altura")
    println("El nombre es $edad")
    println("El booleano es $esVerdadero")
    println("El caracter es $caracter")

    altura=1.80 // ser puede cambiar pues es mutable (var)
    //nombre="Daniel" no se puede cambier, es inmutable (val)

    println("nueva altura es $altura")

    //Ejercicio 2

    print("Ingresa la temperatura en Celsius: ")
    val entrada = readLine()
    val celsius = entrada?.toDoubleOrNull()

    fun convertirTemperatura(celsius: Double): Double{

        return (celsius * 9 / 5) + 32

    }

    println("la conversion de celsius a fahrenheit es: " + convertirTemperatura(celsius!!))

    //Ejercicio 3

    print("Ingresa un número: ")
    val numero = readLine()!!.toInt()

    fun esPar(numero: Int): Boolean {
        return numero % 2 == 0
    }
    if (esPar(numero)) {
        println("El número $numero es par.")
    } else {
        println("El número $numero es impar.")
    }

    //Ejercicio 4
    print("Ingresa el primer número: ")
    val a = readLine()!!.toInt()

    print("Ingresa el segundo número: ")
    val b = readLine()!!.toInt()

    print("Ingresa el tercer número: ")
    val c = readLine()!!.toInt()

    fun mayorDeTres(a: Int, b: Int, c: Int): Int {
        return if (a >= b && a >= c) {
            a
        } else if (b >= a && b >= c) {
            b
        } else {
            c
        }
    }
    val mayor = mayorDeTres(a, b, c)
    println("El número mayor es: $mayor")

    //Ejercicio 5
    print("Ingresa la nota (0 a 100): ")
    val nota = readLine()!!.toInt()

    fun clasificarNota(nota: Int): String {
        return when (nota) {
            in 90..100 -> "Excelente"
            in 70..89 -> "Buena"
            in 50..69 -> "Regular"
            in 0..49 -> "Insuficiente"
            else -> "Nota fuera de rango"
        }
    }

    val resultado = clasificarNota(nota)
    println("La calificación es: $resultado")

    //Ejercicio 6

    val nombres = listOf("Sebastián", "Camilo", "Nicolas", "Julian")
    fun mostrarNombres(lista: List<String>) {
        for (nombre in lista) {
            println(nombre.uppercase())
        }
    }
    mostrarNombres(nombres)

    //Ejercicio 7
    val numeros = listOf(1, 2, 3, 4, 5, 6)


    fun procesarNumeros(lista: List<Int>): Int {
        return lista
            .filter { it % 2 == 0 }
            .map { it * it }
            .sum()
    }

    print(procesarNumeros(numeros))

}


