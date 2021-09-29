/*******************************************************************************
Combatiente.java
Autor: Héctor de León
Fecha de Creación: Septiembre de 2021
Última Modificación: Septiembre de 2021

Ejercicio No. 4
******************************************************************************/

//Esta es la superclase de la que se van a derivar el resto de jugadores del 
//juego

//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************
public class Combatiente {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    /**
     * Se usa protected para que las subclases de esta clase puedan utilizar 
     * estas variables. De dejarlas como privadas, solo podran ser accedidas
     * por esta clase.
     */
    protected String nombre;
    protected int vida;
    protected int ataque;
    //*************************************************************************
    //Constructores
    //*************************************************************************
    public Combatiente(String nombre, int vida, int ataque){
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }
    //*************************************************************************
    //Metodos
    //*************************************************************************
    public String getNombre(){
        return nombre;
    }
    
    public int getvida(){
        return vida;
    }

    public int getataque(){
        return ataque;
    }
    
    public void setVida(int vida){//sirve para modificar la vida si el 
        //combatiente es atacado
        this.vida = vida;
        
    }

}
