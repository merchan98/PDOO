/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloqytetet;

import java.util.Random;

/**
 *
 * @author franmerchan6
 */
//EXAMEN
public class Tramposo extends Jugador {
    
    int vecesTrampas ;
    int importeNoPagado;
    
    Tramposo(Jugador jugador){
        super(jugador);
        this.vecesTrampas = 0;
        this.importeNoPagado =0;
        
    }
   
    int pagoAleatorio(){
        
        Random generadorAleatorios= new Random();
        int numAleatorio = 1+generadorAleatorios.nextInt(2);
        return numAleatorio;
    }
    @Override
    void modificarSaldo(int cantidad){
       if(this.pagoAleatorio()== 1){
           super.modificarSaldo(cantidad/2);
           this.vecesTrampas++;
           this.importeNoPagado = this.importeNoPagado + cantidad/2 ;
                   
       }
       else {
           super.modificarSaldo(cantidad);
       } 
           
    }
    
    void perdonar(){
        this.vecesTrampas =0;
        this.importeNoPagado=0;
    }
    
    @Override
    public String toString() {
        return super.toString() +  "\n\t ·Veces Tramposo = " + this.vecesTrampas + "\n\t ·Importe no pagaddo = " + this.importeNoPagado;
        
    }
    //EXAMEN
}
