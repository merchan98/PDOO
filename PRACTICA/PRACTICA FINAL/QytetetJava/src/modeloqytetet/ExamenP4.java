/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloqytetet;

import java.util.ArrayList;

/**
 *
 * @author franmerchan6
 */
public class ExamenP4 {
   public static void main(String[] args) {

       //EXAMEN
       Jugador jugador1 = new Jugador("Jugador1");
       Tramposo jugador2 = new Tramposo(jugador1);
       System.out.println(jugador1.toString());
       System.out.println(jugador2.toString());
       
       jugador1.modificarSaldo(-10);
       jugador2.modificarSaldo(-10);
       
       jugador1.modificarSaldo(-10);
       jugador2.modificarSaldo(-10);
       
       jugador1.modificarSaldo(-10);
       jugador2.modificarSaldo(-10);
       
       jugador1.modificarSaldo(-10);
       jugador2.modificarSaldo(-10);
       
       jugador1.modificarSaldo(-10);
       jugador2.modificarSaldo(-10);
       
       jugador1.modificarSaldo(-10);
       jugador2.modificarSaldo(-10);
       
       jugador1.modificarSaldo(-10);
       jugador2.modificarSaldo(-10);
       
       jugador1.modificarSaldo(-10);
       jugador2.modificarSaldo(-10);
       
       System.out.println(jugador1.toString());
       System.out.println(jugador2.toString());
       
       jugador2.perdonar();
       
       System.out.println(jugador2.toString());
       
    }
        //FIN EXAMEN 
}
