open class Persona( var nombre:String,
         var apellido:String,
         var cedula:Int,
         var estadoCivil:String) {
    open fun imprimir(){
        println("Persona(nombre='$nombre', apellido='$apellido', cedula=$cedula, estadoCivil='$estadoCivil')")
    }
    fun cambiarEstado(nuevoSta:String){
        this.estadoCivil= nuevoSta
    }
}


