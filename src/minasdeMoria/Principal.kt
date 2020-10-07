package minasdeMoria
//IMPORTS NECESARIOS
import armas.*
import minasdeMoria.Peligro.*
import personajes.*
import java.io.*
import kotlin.random.Random

//clase principal



    fun main(args: Array<String>){
        //ACCESO A FICHERO Y ESCRITURA DE FICHERO DECLARADOS
        val fichero=File("CaminoAMoria.txt")
        val file= FileWriter(fichero,true)

        //CONSTANTES
        val SALAS=36
        val PODER=30
        val MAXFLECHAS=20
        val arraySalas= arrayListOf<Sala>()


        //ARMAS CREADAS
        var vara= Vara(Random.nextInt(PODER)+1)
        var carcaj =Carcaj(Random.nextInt(MAXFLECHAS)+1)
        var anillo= Anillo()

        //PERSONAJES CREADOS
        var gandalf=Mago("Gandalf",vara)
        var legolas=Elfo("Legolas",carcaj)
        var frodo=Hobbit("Frodo",anillo)

        //ACCESORIOS NECESARIOS PARA LAS SALAS.
        var peligro:Peligro= Magico
        var acceso:Int

        //IMPRIMIR CREACIONES
       // generarSalas(salas,SALAS)
        file.write(gandalf.toString())
        file.write(legolas.toString())
        file.write(frodo.toString())
        file.close()
    }



    fun caminarMoria(salas:ArrayList<Sala>,gandalf:Mago,legolas:Elfo,frodo:Hobbit, file:FileWriter){
        for(i in 0..(salas.size-1)){
            file.write("Compañía llegando a la sala ${i+1}\n")
        }
    }
