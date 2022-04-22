fun main(args: Array<String>) {
    var ListaActivos = ArrayList<Int>()
    var ListaPasivos= ArrayList<Int>()
    var ListaSocios=ArrayList<Socio>()
println("          Hola, bienvenido!     ")
    println("Ingrese el número de operación que desea realizar:")
    println("1.- Iniciar Sesión")
    println("2.- Registrarse")
    println("3.- Salir")

    var opcion= readLine()!!.toInt()

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
        3-> {
            println("Gracias por utilizar nuestro servicio!")

        }
        else -> {
            println("Esta opción no es válida")
        }

    }
}
fun nuevoSocio():Socio {
    println("DNI: ")
    val DNI = readLine()!!.toInt()
    println("Nombre: ")
    val Nombre = readLine()!!.toString()
    println("Apellido: ")
    val Apellido = readLine()!!.toString()
    println("Día de nacimiento: ")
    val DiaNac = readLine()!!.toInt()
    println("Mes de nacimiento: ")
    val MesNac = readLine()!!.toInt()
    println("Año de nacimiento: ")
    val AnioNac = readLine()!!.toInt()
    println("Domicilio: ")
    val Domicilio = readLine()!!.toString()
    println("Localidad: ")
    val localidad = readLine()!!.toString()
    println("Teléfono: ")
    val tel = readLine()!!.toInt()
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

    var categoria: String
    val edad = 2022 - AnioNac
    if (edad >= 18 && edad <= 56 && enfermedad == false && medicamentos == false) {
        categoria = "Activo"
    } else {
        categoria = "Pasivo"
    }

    val socio=Socio(DNI =DNI, nombre =Nombre, apellido = Apellido, DiaNac = DiaNac, MesNac = MesNac,
        AnioNac = AnioNac, domicilio =  Domicilio, localidad = localidad, telefono = tel, email = email,
        grupo_Sanguineo = grupoSanguineo, factor = factor, enfermedad = enfermedad,
        medicamentos = medicamentos, categoria = categoria)
    return socio
}