/*******************************************************************************
MaloBoss.java
Autor: Héctor de León
Fecha de Creación: Septiembre de 2021
Última Modificación: Septiembre de 2021

Ejercicio No. 4
******************************************************************************/


//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************
public class MaloBoss extends Malo {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    private int habilidad2;
    //*************************************************************************
    //Constructores
    //*************************************************************************
    public MaloBoss(String nombre, int vida, int ataque, int habilidad, int habilidad2){
        super(nombre, vida, ataque, habilidad);
        this.habilidad2 = habilidad2;
    }
    //*************************************************************************
    //Metodos
    //*************************************************************************

    public void habilidad2(){
        /**
         *dependiendo del valor indicado en habilidad, se selecciona una de 3 
         *habilidades 
         */
        
        if (habilidad2 ==1){

        }

        if (habilidad2 ==2){

        }

        if (habilidad2 ==3){

        }
    }
}
