/*******************************************************************************
Vista.java
Autor: Héctor de León
Fecha de Creación: Septiembre de 2021
Última Modificación: Septiembre de 2021

Ejercicio No. 4
******************************************************************************/
//*****************************************************************************
//Imports
//*****************************************************************************
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
//*****************************************************************************
//Clase
//*****************************************************************************
public class Vista {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    private Scanner scan;

    //*************************************************************************
    //Constructores
    //*************************************************************************
    
    public Vista(){
        scan = new Scanner(System.in);
    }
    //*************************************************************************
    //Metodos
    //*************************************************************************
    
    public void bienvenida(){
        System.out.println("El juego esta mor comenzar");
    }

    //seleccionar la cantidad de personas que jugaran, con un maximo de 3
    public int cantidadJugadores(){
        int numJugadores = 0;
        System.out.println("Escribe el numero de jugadores(maximo 3):");
        numJugadores = scan.nextInt();
        System.out.print("");
        return numJugadores;
    }

    //para poder escojer al personaje
    public int tipoPersonaje(int numJugador){
        int tipo = 0;
        System.out.println("Jugador" + numJugador + ".");
        System.out.println("Seleccione el personaje deseado:");
        System.out.println("1. Guerrero");
        System.out.println("2. Explorador");
        tipo = scan.nextInt();
        System.out.println("");
        return tipo;
    }
 
    //para asignar nombre a cada personaje
    public String nombreCombatiente(){
        String nombre = "";
        System.out.println("Escribe el nombre del combatiente: ");
        nombre = scan.nextLine();
        return nombre;
    }

    //muestra la cantidad de enemigos elegida al azar
    public void cantidadEnemigos(int cantidad){
        System.out.println("Lucharan contra" + cantidad + "enemigos.");
    }

    //muestra el turno de la pelea y el personaje al que le toca
    public void turno(int turno, String personaje){
        System.out.println("turno " + turno + ", " + personaje);
    }


    //menu para el combatiente
    public int menuCombatiente(){
        int accion = 0;
        System.out.println("Que deseas hacer?");
        System.out.println("1. Atacar");
        System.out.println("2. Usar item");
        System.out.println("3. Pasar turno");
        System.out.println("4. ver vida restante");
        accion = scan.nextInt();
        System.out.println("");
        return accion;
    }

    //menu para el enemigo normal
    public int menuContrincante(){
        int accion = 0;
        System.out.println("Que deseas hacer?");
        System.out.println("1. Morder");
        System.out.println("2. Recuperar vida");
        System.out.println("3. Pasar turno");
        System.out.println("4. ver vida restante");
        accion = scan.nextInt();
        System.out.println("");
        return accion;
    }

    //menu para el jefe
    public int menuContrincanteJefe(){
        int accion = 0;
        System.out.println("Que deseas hacer?");
        System.out.println("1. Morder");
        System.out.println("2. Habilidad 2");
        System.out.println("3. Recuperar vida");
        System.out.println("4. Pasar turno");
        System.out.println("5. ver vida restante");
        accion = scan.nextInt();
        System.out.println("");
        return accion;
    }

    //menu para el jefe suremo
    public int menuContrincanteJefeSupremo(){
        int accion = 0;
        System.out.println("Que deseas hacer?");
        System.out.println("1. Morder");
        System.out.println("2. Habilidad 2");
        System.out.println("3. clonar");
        System.out.println("4. variar");
        System.out.println("5. liberar");
        System.out.println("6. Recuperar vida");
        System.out.println("7. Pasar turno");
        System.out.println("8. ver vida restante");
        accion = scan.nextInt();
        System.out.println("");
        return accion;
    }

    //metodo para desplegar los mensajes de los personajes
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }

    //muestra a quien se ha atacado
    public void puntaje(String atacante, String atacado){
        System.out.println(atacante + " ha atacado a " + atacado);
    }

    //muestra al personaje muerto cuando su puntaje se reduce a 0
    public void muerto(String muerto){
        System.out.println(muerto + " ha muerto");
    }

    public void fin(){
        System.out.println("fin del juego.");
    }

}
