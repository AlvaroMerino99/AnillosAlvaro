package personajes

/**
 * Clase enumerada estado que es el estado del personaje
 */
enum class Estado{vivo,muerto}

/**
 * Clase padre Personaje
 *  en esta clase se hace el objeto Personaje, que tiene como parámetro el nombre, y el estado

 */
open class Personaje(var nombre:String, var estado: Estado){
    /**
     * Método toString
     */
    override fun toString(): String {
        return "Personaje creado: "
    }
}