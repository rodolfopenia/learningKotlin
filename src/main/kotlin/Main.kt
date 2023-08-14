import java.lang.Exception

// Constants
const val PI = 3.1416
fun main(args: Array<String>) {
    var nombre : String? = null
    println(nombre?.length)
    try{
        throw NullPointerException("Ha ocurrido un error")
    } catch (exception : NullPointerException){
        println("Ha ocurrido un error")
    } finally{
        println("Finalmente ha ocurrido un error, cerrando app")
    }

    val primerValor = 10
    val segundoValor = 0
    val resultado: Int = try{primerValor / segundoValor}
    catch(ex : Exception){ 0 }
    println(resultado)

    val nombre2: String? = null
    val caracteresDeNombre: Int = nombre2?.length ?: 0

    println(caracteresDeNombre)

}