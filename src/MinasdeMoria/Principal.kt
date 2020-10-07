package MinasdeMoria
//IMPORTS NECESARIOS
import Armas.*
import MinasdeMoria.Peligro.*
import Personajes.*
import java.io.*
import kotlin.random.Random

//clase principal
class Principal {
    fun main(args: Array<String>){
        //CONSTANTES
        val SALAS=36
        val PODER=30
        val MAXFLECHAS=20
        val arraySalas= arrayListOf<Sala>()
        val fichero: File =File("CaminoAMoria.txt")
        val file:FileWriter= FileWriter(fichero,true)

        //ARMAS CREADAS
        var vara= Vara(Random.nextInt(PODER)+1)
        var carcaj =Carcaj(Random.nextInt(MAXFLECHAS)+1)
        var anillo= Anillo()

        //PERSONAJES CREADOS
        var gandalf=Mago("Gandalf",vara)
        var legolas=Elfo("Legolas",carcaj)
        var frodo=Hobbit("Frodo",anillo)

        //ACCESORIOS NECESARIOS PARA LAS SALAS.
        var peligro:Peligro= magico
        var acceso:Int

        //IMPRIMIR CREACIONES
        //generarSalar(salas,SALAS)
        file.write(gandalf.toString())
        println(legolas.toString())
        println(frodo.toString())

    }
    // caminarMoria(salas,gandal,legolas,frodo)
    fun caminarMoria(salas:ArrayList<Sala>,gandalf:Mago,legolas:Elfo,frodo:Hobbit){
        for(i in 0..(salas.size-1)){
            println("Compañía llegando a la sala ${i+1}\n")
        }
    }
    fun generarSalas(salas: ArrayList<Sala>, SALAS:Int){
        var pel: Peligro = magico

    }

}