fun main(args: Array<String>) {
    val nombreColor = "Carmesí"

    when (nombreColor) {
        "Amarillo" -> println("El amaraillo es el color de la alegría")
        "Rojo", "Carmesí" -> println("El rojo simboliza el calor")
        else -> println("Error, no tengo información del color")
    }

    val code = 404
    when (code){
        in 200..299 -> println("Todo ha ido bien")
        in 400..500 -> println("Algo ha fallado")
        else -> println("Código desconocido, algo ha fallado")
    }

// When debe ocupar todas las posibilidades
    val tallaZapato = 42
    val mensaje = when(tallaZapato){
        41,43 -> "Tenemos disponible"
        42,44 -> "Casi no nos quedan!"
        45 -> "Lo siento, no tenemos disponible"
        else -> "Estos zapatos solo vienen en tallas 41, 42, 43, 44, 45"
    }

    println(mensaje)
}

