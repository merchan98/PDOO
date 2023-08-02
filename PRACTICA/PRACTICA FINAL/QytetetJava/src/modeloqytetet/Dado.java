package modeloqytetet;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franm
 */
public class Dado {
    
    /* Implementacion singleton  */
    private Dado() {
    }
    
    public static Dado getInstance() {
        return DadoHolder.INSTANCE;
    }
    
    private static class DadoHolder {

        private static final Dado INSTANCE = new Dado();
    }
    
    /* Funciones expecificas de la clase  */ 
    int tirar(){
        
        Random generadorAleatorios= new Random();
        int numAleatorio = 1+generadorAleatorios.nextInt(6);
        return numAleatorio;
    }
}
