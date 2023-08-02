/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloqytetet;

/**
 *
 * @author franm
 * 
 */

import modeloqytetet.TipoCasilla;

/**
public class Calle extends Casilla {
    
    
    //private int numHoteles = 0;
   // private int numCasas = 0;
    private TituloPropiedad titulo;
    
    
     /* Contructores  
    
    Calle(int numeroCasilla, int coste, TipoCasilla tipo, TituloPropiedad titulo){
        super(numeroCasilla, coste,tipo );
        this.titulo = titulo;

        
    }
    
    
    /* Getter/consultores  

    @Override
    int getNumHoteles() {
        return this.numHoteles;
    }

    @Override
    int getNumCasas() {
        return this.numCasas;
    }

    @Override
    public TituloPropiedad getTitulo() {
        return this.titulo;
    }

    @Override
    int getPrecioEdificar() {
        
        return this.getTitulo().getPrecioEdificar();
        
    }
    
    /* Setter / Modificadores     

    @Override
    void setNumHoteles(int numHoteles) {
        this.numHoteles = numHoteles;
    }

    @Override
    protected void setTitulo(TituloPropiedad titulo) {
        this.titulo = titulo;
    }

    @Override
    void setNumCasas(int numCasas) {
        this.numCasas = numCasas;
    }
    
   
    
    /* Funciones expecificas de la clase     
    
    //modificacion 08-11-2017
    @Override
    TituloPropiedad asiganarPropietario(Jugador jugador){
        this.getTitulo().setPropietario(jugador);
       
     return this.getTitulo();
    }
    //FIN modificacion 08-11-2017
    
    //modificacion 08-11-2017
    @Override
    int calcularValorHipoteca(){
        int cantidadRecibida= (this.getTitulo().getHipotecaBase())+ (int)((this.getNumCasas()* 0.5 *this.getTitulo().getHipotecaBase() 
                + (this.getNumHoteles() * this.getTitulo().getHipotecaBase())));
       return cantidadRecibida;
    }
    //FIN modificacion 08-11-2017
    
    //modificacion 27-11-2017
    @Override
    int cancelarHipoteca(){
        int valorHipoteca= this.calcularValorHipoteca() + ((this.calcularValorHipoteca()*10)/100);
        this.getTitulo().setHipotecada(false);
        
       return valorHipoteca;
    }
    //FIN modificacion 27-11-2017
    
    //modicifacion 08-11-2017
    @Override
    int cobrarAlquiler(){
        
       int costeAlquiler = this.getTitulo().getAlquilerBase();
       costeAlquiler= costeAlquiler + (int)(this.getNumCasas()*0.5 +this.getNumHoteles()*2);
       this.getTitulo().cobrarAlquiler(costeAlquiler);
       
      return costeAlquiler;  
    }
    //FIN modicifacion 08-11-2017
    
    //modificacion 08-11-2017
    @Override
    int edificarCasa(){
       this.setNumCasas(this.getNumCasas()+1);
       
       return this.getTitulo().getPrecioEdificar(); //se supone qu ehay otra funcion para el precio
    }
    //FIN modificacion 08-11-2017
    
    //modificacion 27-11-2017
    @Override
    int edificarHotel(){
        this.setNumHoteles(this.getNumHoteles() +1);
        this.setNumCasas(this.getNumCasas()-4);
        
        return this.getTitulo().getPrecioEdificar();//se supone qu ehay otra funcion para el precio
    }
    //modificacion 27-11-2017
    
    //modificacion 13-11-2017
    @Override
    boolean estaHipotecada(){
       return this.getTitulo().getHipotecada(); 
    }
    //FIN modificacion 13-11-2017
    
    //modificacion 08-11-2017
    @Override
    int hipotecar(){
        this.getTitulo().setHipotecada(true);
        
       return this.calcularValorHipoteca() ;
    }
    //FIN modificacion 08-11-2017
    
    //no se para que sirve¡¡¡¡¡¡
    @Override
    int precioTotalCompra(){ /// no se para que sirve
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    //modificacion 27-11-2017
    @Override
    boolean propietarioEncarcelado(){
        return this.getTitulo().propietarioEncarcelado(); 
    }
    //FIN modificacion 27-11-2017
    
    //modificacion 21-01-2017
    @Override
    public boolean sePuedeEdificarCasa(int factorEspeculacion){
        return (this.getNumCasas() < 4*factorEspeculacion );
    }
    //FIN modificacion 21-01-2017
    
    //modificacion 21-01-2017
    @Override
    public boolean sePuedeEdificarHotel(int factorEspeculacion){
        return (this.getNumCasas() == 4*factorEspeculacion && this.getNumHoteles() < 4*factorEspeculacion);
    }
    //FIN modificacion 21-01-2017
    
    //modicifacion 08-11-201
    @Override
    boolean tengoPropietario(){
        return this.getTitulo().tengoPropietario();  
    }
    //FIN modicifacion 08-11-2017
    
    //modificacion 21-11-2017
    @Override
    int venderTitulo(){
        int precioCompra = this.getCoste() + (this.getNumCasas() + this.getNumHoteles()) 
                *this.getTitulo().getPrecioEdificar();
        int precioVenta= precioCompra + (int)(this.getTitulo().getFactorRevaloracion()*precioCompra);
        //Ponemos la casilla como si estuviera recien creada
        this.getTitulo().setPropietario(null);
        this.setNumCasas(0);
        this.setNumHoteles(0);
        
        return precioVenta;
    }
    //FIN modificacion 21-11-2017
    
    // **** no se para que sirve no le veo mucho sentido sin qu es ele pase nada
    @Override
    protected void asignarTituloPropiedad(){       
        throw new UnsupportedOperationException("Sin implementar");
    }
 
    
}
*/