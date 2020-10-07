
package MinasdeMoria

import kotlin.random.Random

enum class Peligro{magico,accion,habilidad}

class Sala {
    var numeroSala:Int
    var peligro:Peligro
    var poderMaligno:Int
    var flechas:Int=0

    /**
     * Constructor de la clase Peligro
     * numeroSala: representa el número de la sala
     * peligro: representa el tipo de peligro previamente definido en el enum
     * poderMaligno: es el valor(entero) que tiene de poder maligno esa sala
     * flechas: son las flechas que tendría esa sala y que el elfo las podría coger.
     */
    constructor(numeroSala:Int, peligro:Peligro){
        this.numeroSala=numeroSala
        this.peligro=peligro

        if(peligro.equals(Peligro.magico)){
            this.poderMaligno= Random.nextInt(10)

        }else if(peligro.equals(Peligro.accion)){
            this.poderMaligno=Random.nextInt(20)
            this.flechas=Random.nextInt(10)
        } else{
            this.poderMaligno=Random.nextInt(30)
        }
    }

    override fun toString(): String {
        return super.toString()+"Sala número $numeroSala, con peligro $peligro, poder maligno $poderMaligno, y con $flechas flechas"
    }

}