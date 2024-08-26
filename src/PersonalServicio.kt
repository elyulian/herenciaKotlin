class PersonalServicio(nombre: String, apellido: String, cedula: Int, estadoCivil: String, anioIncorporacion: Int,
                       numeroDespacho: Int, private var seccion :String
) :Empleado(nombre, apellido, cedula,
    estadoCivil,
    anioIncorporacion, numeroDespacho
) {
fun cambioSeccion(nuevaSeccion:String){
    this.seccion = nuevaSeccion
}

    override fun imprimir() {
        super.imprimir()
        println("Sección: ${seccion}")
    }
}