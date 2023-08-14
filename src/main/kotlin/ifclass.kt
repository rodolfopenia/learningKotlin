fun main(args: Array<String>) {
    val nombre = "Mar"

    if (nombre.isNotEmpty()){
        println("El largo nuestra variable nombre es ${nombre.length}")
    } else {
        println("Error, la variable está vacía")
    }

    val mensaje : String = if (nombre.length > 4){
        "Tu nombre es largo!"
    } else if (nombre.isEmpty()){
        "El nombre está vacío"
    } else {
        "Tienes un nombre corto"
    }
    println(mensaje)
}

