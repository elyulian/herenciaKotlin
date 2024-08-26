
class Estudiante(nombre: String, apellido: String, cedula: Int, estadoCivil: String, private var cursoMatriculado:String) : Persona(nombre, apellido, cedula,
    estadoCivil
) {
     fun Imprimir() {
        super.imprimir()
        println("Curso :${cursoMatriculado}")
    }


}