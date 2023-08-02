/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloqytetet;

/**
 *
 * @author franmerchan6
 */
import java.util.ArrayList;
import modeloqytetet.TituloPropiedad;
import modeloqytetet.Sorpresa;
import modeloqytetet.Casilla;



class Jugador {
    
    /* Variables  */
    private boolean encarcelado;
    private String nombre;
    private int saldo = 7500;
    Sorpresa cartaLibertad;
    ArrayList<TituloPropiedad> titulos = new ArrayList();
    Casilla casillaActual;
    public String resultado = "no inicilizado";

    
    /* Constructores  */
    public Jugador(String nombre) {
        this.encarcelado = false;
        this.nombre = nombre;
        this.cartaLibertad = null;
        this.casillaActual = null;
        this.resultado = "inicilizado ok";
    }
    
    
    
    /* Getter/consultores  */
    
    public Casilla getCasillaActual(){
        return this.casillaActual;
    }
    
    
    public boolean getEncarcelado(){
       return this.encarcelado;
    }
    
    /* Setter / Modificadores  */ 
    
    void setCartaLibertad(Sorpresa carta){
        
        this.cartaLibertad= carta;
        
    }
    
    void setCasillaActual(Casilla casilla){
        
        this.casillaActual = casilla;
        
    }
    
    void setEncarcelado(boolean encarcelado){
        
        this.encarcelado = encarcelado ;
        
    }
    
    /* Funciones expecificas de la clase  */ 
    
    public boolean tengoPropiedades(){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
   //modicifacion 08-11-2017
    boolean actualizarPosicion(Casilla casilla){
        
       if(casilla.getNumeroCasilla() < this.casillaActual.getNumeroCasilla()){
           //revisar metodo para modificar saldo
           this.modificarSaldo(Qytetet.getInstance().SALDO_SALIDA);
       }
       boolean tienePropietario =false;
       this.setCasillaActual(casilla);
       if(casilla.soyEdificable()){
           
           if(casilla.tengoPropietario()){
              tienePropietario =true; 
              
              if(!this.getEncarcelado()){
                  //revisar metodo para modificar saldo
                  this.modificarSaldo(- casilla.cobrarAlquiler());
                  
              }
           }
               
       }else if(casilla.getTipo() == TipoCasilla.IMPUESTO){
           //creado metodo para modificar saldo
            this.modificarSaldo(-casilla.getCoste());
           
       }
      return tienePropietario;  
    }
    //FIN modicifacion 08-11-2017
    
    //modicifacion 08-11-2017
    boolean comprarTitulo(){
        boolean puedoComprar=false;
        if(this.getCasillaActual().soyEdificable()  && !this.getCasillaActual().getTitulo().tengoPropietario() && 
          (this.getCasillaActual().getCoste() <= this.saldo)){//tiene que haber otro metidodo para no acceder a la variable directamente
            
            this.getCasillaActual().asiganarPropietario(this).setPropietario(this);
            this.titulos.add(this.getCasillaActual().getTitulo());
            this.modificarSaldo(- this.getCasillaActual().getCoste()); //duda si el coste tendria que ser incrmenetado si tiene edificaciones
            puedoComprar= true;   
        }
        
      return puedoComprar;  
    }
    //FIN modicifacion 08-11-2017
    
    Sorpresa devolverCartaLibertad(){
        Sorpresa aux;
       if (this.tengoCartaLibertad()){
           aux= this.cartaLibertad;
           this.setCartaLibertad(null);
       }else
           aux= new Sorpresa("Un fan anónimo ha pagado tu fianza. Sales de la cárcel", 0, TipoSorpresa.SALIRCARCEL);
       return aux; 
    }
    
     //modicifacion 08-11-2017
    void irACarcel(Casilla casilla){
        
        this.setCasillaActual(casilla);
        this.setEncarcelado(true);
        
    }
    //FIN modicifacion 08-11-2017
    
    void modificarSaldo(int cantidad){
        
        this.saldo = this.saldo + cantidad;
        
    }
    
    int obtenerCapital(){
        int total=this.saldo; //necesito otra funcion para poder acceder ala saldo
        for(int i =0; i< this.titulos.size();i++){ //otro metodo para no entrar directamente a la variable
           total= total + this.titulos.get(i).getCasilla().getCoste();
           total = total +((this.titulos.get(i).getCasilla().getNumCasas() + 
                   this.titulos.get(i).getCasilla().getNumHoteles())* this.titulos.get(i).getPrecioEdificar());
           if(this.titulos.get(i).getHipotecada())
               total = total- this.titulos.get(i).getHipotecaBase(); //no se si se utliza la hipoteca base aqui
        } 
        
     return total;   
    }
    
    ArrayList<TituloPropiedad> obtenerPopiedadesHipotecadas(boolean hipotecada){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    void pagarConbrarPorCasaYHotel(int cantidad){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
     //modicifacion 08-11-2017  *modificar tengo saldo
    boolean pagarLibertad(int cantidad){
        if(this.tengoSaldo(cantidad))
            this.modificarSaldo(cantidad);
       
        
    }
    
    //FIN modicifacion 08-11-2017
    
    boolean puedoEdificarCasa(Casilla casilla){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    boolean puedoEdificarHotel(Casilla casilla){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }    
    
    boolean puedoHipotecar(Casilla casilla){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }

    boolean puedoPagarHipoteca(Casilla casilla){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }   
    
    boolean puedoVenderPropiedad(Casilla casilla){
        boolean puedo=false;
        if(this.esDeMipropiedad(casilla) && casilla.estaHipotecada())
            puedo = true;
        
        return puedo;
    } 
    
    boolean tengoCartaLibertad(){
        boolean tengo =false;
        if (! (this.cartaLibertad == null))
            tengo= true;
        return tengo;
        
    }
    
    void venderPropiedad(Casilla casilla){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    private int cuantasCasasHotelesTengo(){
        int totalCasHo=0;
        
        for(int i =0; i< this.titulos.size();i++){ //otro metodo para no entrar directamente a la variable
            totalCasHo = totalCasHo + this.titulos.get(i).getCasilla().getNumCasas();
            totalCasHo = totalCasHo + this.titulos.get(i).getCasilla().getNumHoteles();
            
            
        }
        
        return totalCasHo;
    }
    
    private void eliminarDeMisPropiedades(Casilla casilla){
        
        for(int i =0; i< this.titulos.size();i++){
            if(casilla.getTitulo() == this.titulos.get(i))
                this.titulos.remove(i);
        }
        
    }
    
    private boolean esDeMipropiedad(Casilla casilla){
        boolean mia= false;
        
        for(int i =0; i< this.titulos.size();i++){
            if(casilla.getTitulo() == this.titulos.get(i))
                mia = true;
        }
        return mia;
    }
    
    private boolean tengoSaldo(int cantidad){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }

    @Override
    public String toString() {
        return "Jugador{" + "encarcelado=" + encarcelado + ", nombre=" + nombre + ", saldo=" + saldo + ", cartaLibertad=" + cartaLibertad + ", titulos=" + titulos.toString() + ", casillaActual=" + casillaActual + '}';
        
    }
     
    
    
}
