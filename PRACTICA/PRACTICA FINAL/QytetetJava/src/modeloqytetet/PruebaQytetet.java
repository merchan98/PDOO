/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*   */

package modeloqytetet;
import java.util.ArrayList;
/**
 *
 * @author franmerchan6
 */
public class PruebaQytetet {
    private static ArrayList<Sorpresa> mazo = new ArrayList();
    private static Tablero tablero;
    
    private static void inicializarSorpresas(){
        mazo.add(new Sorpresa ("Te hemos pillado con chanclas y calcetines, lo sentimos, ¡debes ir a la carcel!", 9, TipoSorpresa.IRACASILLA));
        mazo.add(new Sorpresa ("Un fan anónimo ha pagado tu fianza. Sales de la cárcel", 0, TipoSorpresa.SALIRCARCEL));
        /*mazo.add(new Sorpresa ("Te han delatado. Entras a la cárcel", tablero.getCarcel().getNumeroCasilla(), TipoSorpresa.ENTRARCARCEL));*/
        mazo.add(new Sorpresa ("Ibas pasenado y te has encontrado dinero. ¡Qué suerte !", 200, TipoSorpresa.PAGARCOBRAR));
        mazo.add(new Sorpresa ("Has pagado en tu cafeteria preferida y te han dado dinero menos en el cambio. ¡Qué mala suerte !", 200, TipoSorpresa.PAGARCOBRAR));
        mazo.add(new Sorpresa ("Te has encontrado un billete de autobus y te has subido. Viajas a otra casilla", 10, TipoSorpresa.IRACASILLA));
        mazo.add(new Sorpresa ("Te han invitado a subirse unos amigos a su coche. Viajas a otra casilla", 15, TipoSorpresa.IRACASILLA));
        mazo.add(new Sorpresa ("Las contrucciones de tus propiedades estan muy bien. Te dan un premio en metalico por cada una de ellas", 200, TipoSorpresa.PORCASAHOTEL));
        mazo.add(new Sorpresa ("Las contrucciones de tus propiedades estan muy mal. Te ponen una multa por cada una de ellas", 200, TipoSorpresa.PORCASAHOTEL));
        mazo.add(new Sorpresa ("Ha sido tu cumpleaños y cada jugador te da un regalo. Felicidades", 200, TipoSorpresa.PORJUGADOR));
        mazo.add(new Sorpresa ("Te han pillado haciendo trampas al parchis. Tienes que pagar a cada jugador una compensación", 200, TipoSorpresa.PORJUGADOR));
       
    }   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*inicializarSorpresas();
       System.out.println(mazo.toString());
        for (Sorpresa sorpresa : mazo) {
            System.out.println("sopresa :  " + sorpresa.toString());
        }
       System.out.println(tablero.toString());  
        */
       
       
        
        Qytetet juego = Qytetet.getInstance();
        
        String lista = juego.toString();
        
        System.out.println(lista);
        
         TituloPropiedad titulo= new TituloPropiedad("segunda", false,3,0.2,5,6);
        System.out.println(titulo);
        
        }
    
     
    
}
