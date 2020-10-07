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
        generaSalas(arraySalas,SALAS)
        file.write(gandalf.toString())
        file.write(legolas.toString())
        file.write(frodo.toString())
        caminarMoria(arraySalas,gandalf,legolas,frodo,file)
        file.close()
    }



    fun caminarMoria(salas:ArrayList<Sala>,gandalf:Mago,legolas:Elfo,frodo:Hobbit, file:FileWriter){
        var victoria:Boolean=true
        for(i in 0 until salas.size){
            if(gandalf.estado==Estado.vivo && frodo.estado==Estado.vivo && legolas.estado==Estado.vivo){
                file.write("Entrando en la sala número ${i+1}. Tipo de la sala ${salas[i].peligro}... \n")
                if(salas[i].peligro.equals(Peligro.Accion)){
                    salas[i].salaAccion(legolas,salas[i],file)
                }else if(salas[i].peligro.equals(Peligro.Magico)){
                    salas[i].salaMagica(gandalf,salas[i],file)
                }else{
                    salas[i].salaHabilidad(frodo,salas[i],file)
                }
            }else{
                file.write("El equipo ha sufrido una baja \n")
                victoria=false
                break;
            }
        }
        if(victoria){
            file.write("El equipo ha llegado a Moria, BUEN TRABAJO \n")
        }
        file.close()
    }
    fun generaSalas(salas:ArrayList<Sala>, SALAS:Int){
        for(i in 0 until SALAS){
            salas.add((Sala(i+1)))
        }
    }
