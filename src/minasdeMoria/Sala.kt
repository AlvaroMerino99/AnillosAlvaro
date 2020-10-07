
package minasdeMoria

import personajes.*
import java.io.FileWriter
import kotlin.random.Random
import personajes.Hobbit as Hobbit

enum class Peligro{Magico,Accion,Habilidad}

class Sala
/**
 * Constructor de la clase Peligro
 * numeroSala: representa el número de la sala
 * peligro: representa el tipo de peligro previamente definido en el enum
 * poderMaligno: es el valor(entero) que tiene de poder maligno esa sala
 * flechas: son las flechas que tendría esa sala y que el elfo las podría coger.
 */(//VARIABLES QUE VAMOS A UTILIZAR EN LAS SALAS
         var numeroSala: Int) {
         var peligro:Peligro
         var poderMaligno:Int
         var flechas:Int=0

    init {
        when (Random.nextInt(until = 3)+1) {
            1 -> {
                this.peligro=Peligro.Magico
            }
            2 -> {
                this.peligro=Peligro.Habilidad
            }
            else -> {
                this.peligro=Peligro.Accion
            }
        }
        when (peligro) {
            Peligro.Magico -> {
                this.poderMaligno= Random.nextInt(10)

            }
            Peligro.Accion -> {
                this.poderMaligno=Random.nextInt(20)
                this.flechas=Random.nextInt(10)
            }
            else -> {
                this.poderMaligno=Random.nextInt(30)
            }
        }
    }

    /**
     * Método salaAcción
     * en este método recorremos las salas que sean de acción y legolas actuará para continuar su camino a moria
     * en esta sala el poder maligno representará a los enemigos que hay en la sala, y legolas lo matará con su arco
     * y sus flechas, si se queda sin flechas tiene un 80% de posibilidad de huir, si no huye muere.
     */
    fun salaAccion(legolas:Elfo, sala:Sala, file: FileWriter){
        for(i in 1..sala.poderMaligno){
            if(legolas.carcaj.flechas>0){
                legolas.lanzaFlechas()
            }else{
                file.write("Intentando huir \n")
                if((Random.nextInt(100)+1)<80){
                    file.write("Han huido con éxito \n")
                       }else{
                    legolas.estado=Estado.muerto
                    file.write("Legolas ha muerto \n")
                    file.write("Si con mi vida, o con mi muerte puedo protegerte, lo haré… cuenta con mi espada, y con mi arco y con mi hacha \n")

                }
                break
            }
        }
    }

    /**
     * Método salaMagica
     * en este método recorremos las salas que sean mágicas y gandalf actuará para continuar su camino a moria
     * en esta sala el poder maligno se compara con la energía de la vara de gandalf, si es superior simepre se pasa de sala
     * si es igual se pasa el 60% de las veces y si es menor se pasa el 30, si no se pasa se intenta huir,
     * y si no se huye gandalf muere.
     */
    fun salaMagica(gandalf: Mago, sala:Sala, file:FileWriter ){
        val probabilidad:Int=Random.nextInt(until = 100)+1

        if(gandalf.poderVara()>poderMaligno){

                file.write("Han pasado la sala \n")

        }else if(gandalf.poderVara()==poderMaligno) {
            if (probabilidad < 60) {
                file.write("Han pasado la sala \n")
            } else{
                file.write("Gandalf ha muerto. \n")
                file.write("Muchos de los que viven merecen morir y algunos de los que mueren merecen la vida \n")
                gandalf.estado=Estado.muerto
            }
        }else{
                    if(probabilidad<30) {
                        file.write("Han pasado la sala \n")
                    }else{
                        file.write("Gandalf ha muerto. \n")
                        file.write("Muchos de los que viven merecen morir y algunos de los que mueren merecen la vida. \n")
                        gandalf.estado=Estado.muerto
                    }
                }
        }

    /**
     * Método sala habilidad
     * en este método recorremos las salas que sean de habilidad y frodo actuará para continuar su camino a moria
     * si frodo se pone el anillo continuamos el 90% de las veces, sino el 20%, sino continuan, se intenta huir,
     * si no huye, frodo muere.
     */
    fun salaHabilidad(frodo: Hobbit, sala:Sala, file: FileWriter){
        val probabilidad:Int=Random.nextInt(until = 100)+1
        if(probabilidad>50){
            frodo.ponerseAnillo()
                    if(probabilidad>90){
                        file.write("Han pasado la sala \n")
                    }else{
                        if (probabilidad < 80) {
                            file.write("Han pasado la sala \n")
                        } else{
                            file.write("Frodo ha muerto. \n")
                            file.write("No conozco a la mitad de vosotros ni la mitad de lo que desearía, y lo que deseo es menos de la mitad de lo que la mitad merecéis.\n")
                            frodo.estado=Estado.muerto
                        }
                      }
        }else{
            frodo.quitarseAnillo()
        }
    }

    /**
     * método to string
     */

    override fun toString(): String {
        return super.toString()+"Sala número $numeroSala, con peligro $peligro, poder maligno $poderMaligno, y con $flechas flechas\n"
    }

}