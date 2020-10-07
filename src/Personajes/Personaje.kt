package Personajes

enum class Estado{vivo,muerto}
open class Personaje(var nombre:String, var estado: Estado)