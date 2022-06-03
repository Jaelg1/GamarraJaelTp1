import kotlin.text.toInt as toInt1

fun main(args: Array<String>) {
    var Socio1=Socio(43844509, "Jael", "Gamarra", 18,2,2002,"Calle 13 N 380", "Frontera",
        332441, "jaelgamarra15@gmail.com", "A","+", false, false, "Activo")
    val ListaActivos = ArrayList<Int>()
    val ListaPasivos= ArrayList<Int>()
    val ListaSocios=ArrayList<Socio>()
println("          Hola, bienvenido!     ")
    println("Ingrese el número de operación que desea realizar:")
    println("1.- Iniciar Sesión")
    println("2.- Registrarse")
    println("3.- Obtener Liquidación de Cuotas")
    println("4.- Salir")

    var opcion= readLine()!!.toInt1()

    when(opcion){
        1-> {
            println("Usuario: ")
            var Usuario=readLine()!!.toString()
            println("Contraseña: ")
            var Contraseña=readLine()!!.toString()

            println("Usted ${Usuario} ha iniciado sesión con éxito!")
        }
        2-> {
            val socio=nuevoSocio()
            ListaSocios.add(socio)
            if (socio.categoria=="Activo"){
                ListaActivos.add(socio.DNI)
            } else{
                ListaPasivos.add(socio.DNI)
            }
        }
        3->{
            var totalActivos=0
            var totalPasivos=0
            var contActivos=0
            var contPasivos=0
            var porcentajeAct=0
            var porcentajePas=0

            for(socio in ListaActivos){
                totalActivos += 300
                contActivos++
                porcentajeAct=contActivos*totalActivos/100
            }
            println("El porcentaje de cuotas pagas del mes de la categoria activo es: ${porcentajeAct}")
            for(socio in ListaPasivos){
                totalPasivos += 250
                contPasivos++
                porcentajePas=contPasivos*totalPasivos/100
            }
            println("El porcentaje de cuotas pagas del mes de la categoria pasivo es: ${porcentajePas}")
        }
        4-> {
            println("Gracias por utilizar nuestro servicio!")

        }
        else -> {
            println("Esta opción no es válida")
        }
    }
}
fun nuevoSocio():Socio {
    println("DNI: ")
    val DNI = readLine()!!.toInt1()
    println("Nombre: ")
    val Nombre = readLine()!!.toString()
    println("Apellido: ")
    val Apellido = readLine()!!.toString()
    println("Día de nacimiento: ")
    val DiaNac = readLine()!!.toInt1()
    println("Mes de nacimiento: ")
    val MesNac = readLine()!!.toInt1()
    println("Año de nacimiento: ")
    val AnioNac = readLine()!!.toInt1()
    println("Domicilio: ")
    val Domicilio = readLine()!!.toString()
    println("Localidad: ")
    val localidad = readLine()!!.toString()
    println("Teléfono: ")
    val tel = readLine()!!.toInt1()
    println("e-mail: ")
    val email = readLine()!!.toString()
    println("Grupo Sanguíneo: ")
    val grupoSanguineo = readLine()!!.toString()
    println("Factor: ")
    val factor = readLine()!!.toString()
    println("Tiene alguna enfermedad crónica?: ")
    val enfermedad = readLine()!!.toBoolean()
    println("Toma medicamentos de forma permanente?: ")
    val medicamentos = readLine()!!.toBoolean()
    if (medicamentos == true) {
        println("Que medicamentos?: ")
        val nombreMedic = readLine()!!.toString()
    }

    val categoria: String
    val edad = 2022 - AnioNac
    if (edad >= 18 && edad <= 56 && enfermedad == false && medicamentos == false) {
        categoria = "Activo"
    } else {
        categoria = "Pasivo"
    }

    val socio=Socio(
        DNI =DNI, nombre =Nombre, apellido = Apellido, DiaNac = DiaNac, MesNac = MesNac,
        AnioNac = AnioNac, domicilio =  Domicilio, localidad = localidad, telefono = tel, email = email,
        grupo_Sanguineo = grupoSanguineo, factor = factor, enfermedad = enfermedad,
        medicamentos = medicamentos, categoria = categoria)
    return socio
}
