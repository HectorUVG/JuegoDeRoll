//Subclase de Combatiente

//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************
public class Malo extends Combatiente{
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    /**
     * protected para que pueda ser usada por la subclase maloboss
     */
    protected int habilidad;
    //*************************************************************************
    //Constructores
    //*************************************************************************
    public Malo(String nombre, int vida, int ataque, int habilidad){
        super(nombre, vida, ataque);//indica que estas funciones seran recicladas de la clase combatiente
        this.habilidad = habilidad;

    }
    //*************************************************************************
    //Metodos
    //*************************************************************************
    public void habilidad(){
        /**
         *dependiendo del valor indicado en habilidad, se selecciona una de 3 
         *habilidades 
         */
        
        if (habilidad ==1){

        }

        if (habilidad ==2){

        }

        if (habilidad ==3){

        }
    }

}
