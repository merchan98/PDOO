/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*   */
package modeloqytetet;

/**
 *
 * @author franmerchan6
 */

import modeloqytetet.TipoCasilla;
import modeloqytetet.TituloPropiedad;


public class Casilla {
    
    /* Variables  */
    private int numeroCasilla;
    private int coste;
    private int numHoteles = 0;
    private int numCasas = 0;
    
    
    private TipoCasilla tipo;
    private TituloPropiedad titulo;
    
    /* Getter/consultores  */
    int getNumeroCasilla() {
        return this.numeroCasilla;
    }

    int getCoste() {
        return this.coste;
    }

    int getNumHoteles() {
        return this.numHoteles;
    }

    int getNumCasas() {
        return this.numCasas;
    }

    public TipoCasilla getTipo() {
        return this.tipo;
    }

    public TituloPropiedad getTitulo() {
        return this.titulo;
    }

    int getCosteHipotecada(){
        
       throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    int getPrecioEdificar() {
        
    throw new UnsupportedOperationException("Sin implementar");    
        
    }
    
    /* Setter / Modificadores  */    

    void setNumHoteles(int numHoteles) {
        this.numHoteles = numHoteles;
    }

    private void setTitulo(TituloPropiedad titulo) {
        this.titulo = titulo;
    }

    void setNumCasas(int numCasas) {
        this.numCasas = numCasas;
    }
    
    /* Contructores  */
    public Casilla(int numeroCasilla, int coste, TipoCasilla tipo) {
        this.numeroCasilla = numeroCasilla;
        this.coste = coste;
        this.tipo = tipo;
        setTitulo(null);
        
    }

    public Casilla(int numeroCasilla, int coste, TipoCasilla tipo, TituloPropiedad titulo) {
        this.numeroCasilla = numeroCasilla;
        this.coste = coste;
        this.numHoteles = 0;
        this.numCasas = 0;
        this.tipo = tipo;
        this.titulo=titulo;
    }
    
    
    /* Funciones expecificas de la clase  */   

    TituloPropiedad asiganarPropietario(Jugador jugador){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    int calcularValorHipoteca(){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    int cancelarHipoteca(){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    //modicifacion 08-11-2017
    
    int cobrarAlquiler(){
        
       int costeAlquiler = this.getTitulo().getAlquilerBase();
       costeAlquiler= costeAlquiler + (int)(this.getNumCasas()*0.5 +this.getNumHoteles()*2);
       this.getTitulo().cobrarAlquiler(costeAlquiler);
       
      return costeAlquiler;  
    }
    //FIN modicifacion 08-11-2017
    
    int edificarCasa(){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    int edificarHotel(){
        
        throw new UnsupportedOperationException("Sin implementar");        
        
    }
    
    boolean estaHipotecada(){
        
       return this.getTitulo().getHipotecada();
        
    }
    
    int hipotecar(){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    int precioTotalCompra(){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    boolean propietarioEncarcelado(){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    boolean sePuedeEdificarCasa(){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    boolean sePuedeEdificarHotel(){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    boolean soyEdificable(){
        boolean soy =false;
        if(this.getTipo() == TipoCasilla.CALLE)
            soy=true;
        return soy;
    }
    
   //modicifacion 08-11-201
    boolean tengoPropietario(){
        
        return this.getTitulo().tengoPropietario();
        
    }
    //FIN modicifacion 08-11-2017
    
    int venderTitulo(){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    private void asignarTituloPropiedad(){       
        
    }
 
        /* Funcion to string  */
    @Override
    public String toString() {
        
        String resultado = "Casilla:" + "numeroCasilla=" + numeroCasilla + ", coste=" + coste + ", tipo=" + tipo ;
        boolean no_titulo = (titulo == null);
        if (!(no_titulo)){
            resultado =resultado + "numHoteles="+ numHoteles + ", numCasas=" + numCasas + ", titulo= "+ titulo.toString();
            
        }
            return resultado;
          
    }
    
    
    
    
}
