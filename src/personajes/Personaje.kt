package personajes

enum class Estado{vivo,muerto}
open class Personaje(var nombre:String, var estado: Estado){
    override fun toString(): String {
        return "Personaje creado: "
    }
}