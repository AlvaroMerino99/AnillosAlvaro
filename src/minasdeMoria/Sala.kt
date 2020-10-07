
package minasdeMoria

import personajes.*
import java.io.FileWriter
import kotlin.random.Random

enum class Peligro{Magico,Accion,Habilidad}

class Sala
/**
 * Constructor de la clase Peligro
 * numeroSala: representa el número de la sala
 * peligro: representa el tipo de peligro previamente definido en el enum
 * poderMaligno: es el valor(entero) que tiene de poder maligno esa sala
 * flechas: son las flechas que tendría esa sala y que el elfo las podría coger.
 */(//VARIABLES QUE VAMOS A UTILIZAR EN LAS SALAS
        private var numeroSala: Int) {
        private var peligro:Peligro
        private var poderMaligno:Int
        private var flechas:Int=0

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
    fun salaAccion(legolas:Elfo, sala:Sala, file: FileWriter){
        for(i in 1..sala.poderMaligno){
            if(legolas.carcaj.flechas>0){
                legolas.lanzaFlechas()
            }else{
                file.write("Intentando huir")
                if((Random.nextInt(100)+1)<80){
                    file.write("Han huido con éxito")
                    file.write("Si con mi vida, o con mi muerte puedo protegerte, lo haré… cuenta con mi espada, y con mi arco y con mi hacha")
                }else{
                    legolas.estado=Estado.muerto
                    file.write("Legolas ha muerto")
                }
                break
            }
        }
    }
    fun salaMagica(gandalf: Mago, sala:Sala, file:FileWriter ){
        val probabilidad:Int=Random.nextInt(until = 100)+1

        if(gandalf.poderVara()>poderMaligno){

                file.write("Han pasado la sala")

        }else if(gandalf.poderVara()==poderMaligno) {
            if (probabilidad < 60) {
                file.write("Han pasado la sala")
            } else{
                file.write("Gandalf ha muerto.")
                file.write("Muchos de los que viven merecen morir y algunos de los que mueren merecen la vida")
                gandalf.estado=Estado.muerto
            }
        }else{
                    if(probabilidad<30) {
                        file.write("Han pasado la sala")
                    }else{
                        file.write("Gandalf ha muerto.")
                        file.write("Muchos de los que viven merecen morir y algunos de los que mueren merecen la vida")
                        gandalf.estado=Estado.muerto
                    }
                }
        }



    override fun toString(): String {
        return super.toString()+"Sala número $numeroSala, con peligro $peligro, poder maligno $poderMaligno, y con $flechas flechas\n"
    }

}