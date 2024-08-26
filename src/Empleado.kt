 open class Empleado(
     nombre: String,
     apellido: String,
     cedula: Int,
     estadoCivil: String,
     private var anioIncorporacion: Int,
     private var numeroDespacho: Int
 ) : Persona(nombre, apellido, cedula, estadoCivil) {

fun reasignarDespacho(nuevoDes:Int){
    this.numeroDespacho = nuevoDes
}

}