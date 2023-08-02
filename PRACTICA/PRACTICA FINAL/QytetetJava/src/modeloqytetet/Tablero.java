/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*   */
package modeloqytetet;

/*  Importamos la clase ArrayList */
import java.util.ArrayList;

/**
 *
 * @author franmerchan6
 */
import modeloqytetet.Casilla;
import modeloqytetet.TituloPropiedad;

public class Tablero {
    
    /* Variables  */
    private ArrayList<Casilla> casillas;
    private Casilla carcel;
    
    /* Getter/consultores  */
    
    Casilla getCarcel() {
        return carcel;
    }
    
    /* Contructores  */

    public Tablero() {
       this.inicializar();
    }
    
    private void inicializar(){
        casillas = new ArrayList();
        
        casillas.add(new Casilla(0,0,TipoCasilla.SALIDA));
        casillas.add(new Casilla(1,500,TipoCasilla.CALLE, new TituloPropiedad("primera", false,2,0.1,3,4)));
        casillas.add(new Casilla(2,0,TipoCasilla.SORPRESA));
        casillas.add(new Casilla(3,500,TipoCasilla.CALLE, new TituloPropiedad("segunda", false,3,0.2,5,6)));
        casillas.add(new Casilla(4,0,TipoCasilla.CARCEL));
        carcel= casillas.get(4);
        
    }
    
    
    
    
    /* Funciones expecificas de la clase  */ 
    boolean esCasillaCarcel (int numCasilla ){
        boolean real= false;
        
        if (numCasilla == this.getCarcel().getNumeroCasilla())
            real=true;
        
      return real;  
    }
    
    Casilla obtenerCasillaNumero(int numeroCasilla){
        
        
      return this.casillas.get(numeroCasilla); 
    }
    
    Casilla obtenerNuevaCasilla(Casilla casilla, int desplazamiento){
        int des_real=casilla.getNumeroCasilla()+ desplazamiento;
        if (des_real == 20)
               des_real = des_real -20;
        
        return this.casillas.get(des_real);
    }
    
    
    /* Funcion to string  */
    
    @Override
    public String toString() {
        
        String resultado = null ;
        
        for (Casilla casilla :casillas){
        
            resultado= resultado + casilla.toString();
        }
        return resultado;
        
    } 
    
    
} 
   
    

