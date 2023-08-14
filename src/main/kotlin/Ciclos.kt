fun main(args: Array<String>) {
    val listaDeFrutas = listOf("Manzana", "Pera", "Frambuesa", "Durazno")
    for(fruta in listaDeFrutas){
        println("Hoy voy a comer la fruta llamada $fruta")
    }

    listaDeFrutas.forEach{
            fruta -> println("Hoy voy a comer la fruta nueva llamada $fruta")
    }

    val caracteresDeFruta = listaDeFrutas.map{ fruta -> fruta.length}
    println(caracteresDeFruta)

    val listaFiltrada = caracteresDeFruta.filter{ tamano -> tamano > 5}
    println(listaFiltrada)
}