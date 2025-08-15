package edu.unicatolica.kotlin
fun main() {
    val nombre = "Crysthian"
    val apellidos = "Escobar Herrera"
    val edad = 20
    val semestre = "6to"
    val id = 407458
    val carrera = "Ingeniería en Sistemas"
    val universidad = "Unicatolica"

    val pasatiempos = "jugar al fútbol, a menudo lo practico con mis amigos, " +
            "también voy al gimnasio durante la semana, me gustan mucho los carros y jugar videojuegos."
    val interes = "todo lo relacionado con la IA, la automatización de gestiones y la ciberseguridad."

    val presentacion = "Mi nombre es $nombre $apellidos, tengo $edad años, " +
            "actualmente soy estudiante de $carrera en la universidad $universidad, " +
            "estoy en $semestre semestre y mi ID de estudiante es $id. " +
            "Mis pasatiempos favoritos son $pasatiempos " +
            "Mi principal interés en el desarrollo de software es $interes"

    println(presentacion)
}

