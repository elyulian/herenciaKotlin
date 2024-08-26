class Profesor(nombre: String, apellido: String, cedula: Int, estadoCivil: String, anioIncorporacion: Int,
               numeroDespacho: Int,  var departamento:String
) :Empleado(nombre, apellido, cedula,
    estadoCivil,
    anioIncorporacion, numeroDespacho
) {

    override fun imprimir(){
        super.imprimir()
        println("Departamento ${this.departamento}")
    }
    fun cambioDepa(nuevoDepa:String){
        this.departamento=nuevoDepa
    }

}