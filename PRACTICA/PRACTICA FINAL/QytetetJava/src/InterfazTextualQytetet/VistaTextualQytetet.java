/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfazTextualQytetet;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class VistaTextualQytetet {
    
    private static final Scanner in = new Scanner (System.in);
    
    public int menuGestionInmobiliaria(){ //ejemplo de menú
        
        this.mostrar("Elige la gestion inmobiliaria que deseas hacer");
        Map<Integer, String> menuGI = new TreeMap();
        menuGI.put(0, "Siguiente Jugador"); 
        menuGI.put(1, "Edificar casa");
        menuGI.put(2, "Edificar Hotel"); 
        menuGI.put(3, "Vender propiedad ");  	
        menuGI.put(4, "Hipotecar Propiedad"); 
        menuGI.put(5, "Cancelar Hipoteca");
        int salida=this.seleccionMenu(menuGI); // Método para controlar la elección correcta en el menú 
        
        return salida;
    }

    public int menuSalirCarcel(){
        //eleccion de metodo para salir de la carcel. Por completar
        this.mostrar("Elige el metodo para salir de la carcel");
        Map<Integer, String> menuSC = new TreeMap();
        menuSC.put(0, "Tirando"); 
        menuSC.put(1, "Pagando Libertad");
        //menuSC.put(2, "Carta de libertad"); 
        int salida=this.seleccionMenu(menuSC); // Método para controlar la elección correcta en el menú 
      return salida;
    }
  
    public boolean elegirQuieroComprar(){
    // se pide si o no se quiere comprar una propiedad. Por completar
    System.out.println("**************************************************");
        this.mostrar("Quieres Comprar?");
        String lectura;
        boolean salida=false;
        boolean valido= true;
        
        do{
            lectura = in.nextLine().toUpperCase();
            //this.mostrar(lectura);
            //this.mostrar(lectura.toUpperCase());
            if("NO".equals(lectura)){
                salida=false;
                valido=false;
            }
            if("SI".equals(lectura.toUpperCase())){
                salida=true;
                valido=false;
            }
            if(valido)
                this.mostrar("ERROR, Introduce un la palabra si o no.");
        } while(valido);
      return salida;
    
    }
 
        
    public int menuElegirPropiedad(ArrayList<String> listaPropiedades){  //numero y nombre de propiedades            
        Map<Integer, String> menuEP = new TreeMap();
        int numeroOpcion=0;
        for(String prop: listaPropiedades) {
            menuEP.put(numeroOpcion, prop); //opcion de menu, numero y nombre de propiedad
            numeroOpcion=numeroOpcion+1;
        }
        int salida=this.seleccionMenu(menuEP); // Método para controlar la elección correcta en el menú 
      return salida;
 
    }   

    private int seleccionMenu(Map<Integer,String> menu){ 
    //Método para controlar la elección correcta de una opción en el menú que recibe como argumento   
        boolean valido = true; 
        int numero;
        String lectura;
        do { // Hasta que se hace una selección válida
            for(Map.Entry<Integer, String> fila : menu.entrySet()) {
                numero = fila.getKey();
                String texto = fila.getValue();
                this.mostrar(numero + " : " + texto);  // número de opción y texto
            }
            this.mostrar("\n Elige una opción: ");
            lectura = in.nextLine();  //lectura de teclado
            valido=this.comprobarOpcion(lectura, 0, menu.size()-1); //método para comprobar la elección correcta
        } while (!valido);
      return Integer.parseInt(lectura);
    }

    public ArrayList<String> obtenerNombreJugadores() { //método para pedir el nombre de los jugadores
        System.out.println("ejecuto obterner nombres Jugadores");
        boolean valido = true; 
        String lectura;
        ArrayList<String> nombres = new ArrayList();
        do{ //repetir mientras que el usuario no escriba un número correcto 
            this.mostrar("Escribe el número de jugadores: (de 2 a 4):");
            lectura = in.nextLine();  //lectura de teclado
            valido=this.comprobarOpcion(lectura, 2, 4); //método para comprobar la elección correcta
        }while (!valido);
    
        for (int i = 1; i <= Integer.parseInt(lectura); i++) { //solicitud del nombre de cada jugador
            this.mostrar("Nombre del jugador " + i + ": ");
            nombres.add (in.nextLine());
        }
      return nombres;
    }

    private boolean comprobarOpcion(String lectura, int min, int max){ 
     //método para comprobar que se introduce un entero correcto, usado por seleccion_menu
        boolean valido=true;   
        int opcion;
        try {  
            opcion =Integer.parseInt(lectura);
            if (opcion<min || opcion>max) { // No es un entero entre los válidos
                this.mostrar("el numero debe estar entre min y max");
                valido = false;
            }
        } catch (NumberFormatException e) { // No se ha introducido un entero
            this.mostrar("debes introducir un numero");
            valido = false;  
          }
        if (!valido) {
            this.mostrar("\n\n Seleccion erronea. Intentalo de nuevo.\n\n");
        }
      return valido;
    }

    public void mostrar(String texto){ //método que muestra en pantalla el string que recibe como argumento
         System.out.println("*****************************************************************");
    System.out.println(texto);
}
 

}
