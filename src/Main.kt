fun main() {
    println("Hello World!")
    val est = Estudiante("Julian","Herrera",100323213,"Soltero","Matematicas")
    val prof = Profesor("Jairo","Marquez",123123,"Casado",2001,32,"Matematicas")
    val ser = PersonalServicio("Dora","La exploradora",12312,"Casada",2000,12,"Gym")
    est.Imprimir()
    est.cambiarEstado("Union Libre")
    est.imprimir()
    prof.reasignarDespacho(23)
    prof.cambioDepa("Lenguaje")
    ser.cambioSeccion("Biblio")

    prof.imprimir()
    ser.imprimir()
    est.Imprimir()
}