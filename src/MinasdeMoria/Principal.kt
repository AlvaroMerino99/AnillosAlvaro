package MinasdeMoria

import Armas.*
import Personajes.*
import kotlin.random.Random


class Principal {
    fun main(args: Array<String>){
        val SALAS=36
        val MAXPODER=30
        val MAXFLECHAS=20
        val arraySalas= arrayListOf<Sala>()
        //ARMAS CREADAS
        var vara= Vara(Random.nextInt(MAXPODER)+1)
        var carcaj =Carcaj(Random.nextInt(MAXFLECHAS)+1)
        var anillo= Anillo()

        //PERSONAJES CREADOS
        var gandalf=Mago("Gandalf",vara)
        var legolas=Elfo("Legolas",carcaj)
        var frodo=Hobbit("Frodo",anillo)


        var peligro:Peligro=Peligro.magico
        var acceso:Int

        //IMPRIMIR CREACIONES
        //generarSalar(salas,SALAS)
        println(gandalf.toString())
        println(legolas.toString())
        println(frodo.toString())

    }
    // caminarMoria(salas,gandal,legolas,frodo)
    fun caminarMoria(salas:ArrayList<Sala>,gandalf:Mago,legolas:Elfo,frodo:Hobbit){
        for(i in 0..(salas.size-1)){
            println("Compañía llegando a la sala ${i+1}")
        }
    }
    fun generarSalas(salas: ArrayList<Sala>, SALAS:Int){
        var pel: Peligro = Peligro.magico
    }

}