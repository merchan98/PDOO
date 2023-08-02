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
import modeloqytetet.TituloPropiedad;
import modeloqytetet.Casilla;

public class TituloPropiedad {
    
    /* Variables  */
    private String nombre;
    private boolean hipotecada;
    private int alquilerBase;
    private double factorRevaloracion;
    private int hipotecaBase;
    private int precioEdificar;
    private Jugador propietario = null;
    private Casilla casilla;

    /* Getter/consultores  */
    
    String getNombre() {
        return nombre;
    }

    int getAlquilerBase() {
        return alquilerBase;
    }

    double getFactorRevaloracion() {
        return factorRevaloracion;
    }

    int getHipotecaBase() {
        return hipotecaBase;
    }

    int getPrecioEdificar() {
        return precioEdificar;
    }
    
    boolean getHipotecada(){
        return hipotecada;
    }

    public Jugador getPropietario() {
        return propietario;
    }

    public Casilla getCasilla() {
        return casilla;
    }
    
    

    /* Setter / Modificadores  */
    
    public void setHipotecada(boolean hipotecada) {
        this.hipotecada = hipotecada;
    }
    
    void setPropietario(Jugador propietario){
         this.propietario =  propietario;
    }
    
    void setCasilla(Casilla casilla){  
        this.casilla = casilla;
    }

    /* Contructores  */
    public TituloPropiedad(String nombre, boolean hipotecada, int alquilerBase, double factorRevaloracion, int hipotecaBase, int precioEdificar) {
        this.nombre = nombre;
        this.hipotecada = hipotecada;
        this.alquilerBase = alquilerBase;
        this.factorRevaloracion = factorRevaloracion;
        this.hipotecaBase = hipotecaBase;
        this.precioEdificar = precioEdificar;
        this.propietario =null;
        
    }
    
    /* Funciones expecificas de la clase  */
    
   //modicifacion 08-11-2017
    public void cobrarAlquiler(int coste){
        
        this.getPropietario().modificarSaldo(coste);
        
    }
    //FIN modicifacion 08-11-2017
    
    boolean propietarioEncarcelado(){

       throw new UnsupportedOperationException("Sin implementar"); 
        
    }
    
    
    boolean tengoPropietario (){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    /* Funcion to string  */
    @Override
    public String toString() {
        return "TituloPropiedad{" + "nombre=" + nombre + ", hipotecada= " + hipotecada + ", alquilerBase= " + alquilerBase + ", factorRevaloracion= " + factorRevaloracion + ", hipotecaBase= " + hipotecaBase + ", precioEdificar= " + precioEdificar + ", Casilla= "+ casilla + '}';
        

}
    
    
    
}
