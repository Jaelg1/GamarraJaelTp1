import kotlin.text.toInt as toInt1

fun main(args: Array<String>) {
    println("     Municipalidad de Cordoba     ")
    println("¿Que operacion desea realizar?: ")
    println("1- Registrarse")
    println("2- Iniciar Sesion")
    println("3- Registrar incidente")

    val operacion= readLine()!!.toInt1()

    when(operacion){
        1->{
            val usuario=nuevoUsuario()
            println("Usted ha sido registrado con exito!")
        }
        2->{
            val inicSes=iniciarSesion()
            println("Usted ha iniciado sesion con exito")
        }
        3->{
            val incidente=registrarIncidente()
            println("El incidente se ha registrado con exito")
        }
    }
}
fun nuevoUsuario() {
    println("DNI: ")
    val DNI = readLine()!!.toInt1()
    println("CUIL: ")
    val CUIL = readLine()!!.toLong()
    println("Nombre: ")
    val nombre = readLine()!!.toString()
    println("Apellido: ")
    val apellido = readLine()!!.toString()
    println("Domicilio: ")
    val domicilio = readLine()!!.toString()
    println("Telefono: ")
    val telefono = readLine()!!.toString()
    println("e-mail: ")
    val email = readLine()!!.toString()
}
fun iniciarSesion(){
    println("CUIL: ")
    val CUIL = readLine()!!.toLong()
    println("Contraseña: ")
    val contrasenia = readLine()!!.toString()
}
fun registrarIncidente(){
    println("Categoria: ")
    val categoria = readLine()!!.toString()
    println("Subcategoria: ")
    val subcategoria = readLine()!!.toString()
    println("Ubicacion: ")
    val ubicacion = readLine()!!.toString()
    println("Fecha(DD/MM/AA): ")
    val fecha = readLine()!!.toString()
    println("Hora: ")
    val hora = readLine()!!.toString()
}