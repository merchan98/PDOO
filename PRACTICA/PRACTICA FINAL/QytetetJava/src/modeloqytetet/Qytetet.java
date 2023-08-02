/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloqytetet;

/**
 *
 * @author franm
 */
import java.util.ArrayList;
import java.util.Random;
import modeloqytetet.Tablero;
import modeloqytetet.Dado;
import modeloqytetet.MetodoSalirCarcel;
import modeloqytetet.Sorpresa;
import modeloqytetet.Jugador;

public class Qytetet {
    
    /* Implementacion singleton  */
    private Qytetet() {
        nombres.add("primero");
        nombres.add("segundo");
        nombres.add("tercero");
        nombres.add("cuarto");
        inicializarJugadores(nombres);
        inicializarTablero();
        iniciliacizarCartasSorpresa();
        /*this.jugadorActual = this.jugadores.get(0);
        this.cartaActual = mazo.get(11);*/
    }
    
    public static Qytetet getInstance() {
        return QytetetHolder.INSTANCE;
    }
    
    private static class QytetetHolder {

        private static final Qytetet INSTANCE = new Qytetet();
    }
    
    
    /* Variables  */
    
    public int MAX_JUGADORES =4 ;
    int MAX_CARTAS = 10;
    int MAX_CASILLAS = 20;
    int PRECIO_LIBERTAD = 200;
    int SALDO_SALIDA = 1000;
    Sorpresa cartaActual;
    Tablero tablero;
    Dado dado= this.dado.getInstance();
    ArrayList<Sorpresa> mazo = new ArrayList();
    ArrayList<Jugador> jugadores = new ArrayList();
    Jugador jugadorActual;
    ArrayList<String> nombres = new ArrayList();
    
    
    /* Getter/consultores  */
    
    public Sorpresa getCartaActual(){
        return this.cartaActual;
    }
    
    public Jugador getJugadorActual(){
        return this.jugadorActual;
    }
    
    public ArrayList<Jugador> getJugadores(){
        
        return this.jugadores;
    } 
    
    /* Contructores  

    public Qytetet() {
        nombres.add("primero");
        nombres.add("segundo");
        nombres.add("tercero");
        nombres.add("cuarto");
        iniciliacizarCartasSorpresa();
        inicializarJugadores(nombres);
        inicializarTablero();
        this.jugadorActual = this.jugadores.get(0);
        this.cartaActual = mazo.get(11);
    }
    
    */
    
    private void iniciliacizarCartasSorpresa(){
        
        mazo.add(new Sorpresa ("Te hemos pillado con chanclas y calcetines, lo sentimos, ¡debes ir a la carcel!", 9, TipoSorpresa.IRACASILLA));
        mazo.add(new Sorpresa ("Un fan anónimo ha pagado tu fianza. Sales de la cárcel", 0, TipoSorpresa.SALIRCARCEL));
        mazo.add(new Sorpresa ("Te han delatado. Entras a la cárcel", tablero.getCarcel().getNumeroCasilla(), TipoSorpresa.ENTRARCARCEL));
        mazo.add(new Sorpresa ("Ibas pasenado y te has encontrado dinero. ¡Qué suerte !", 200, TipoSorpresa.PAGARCOBRAR));
        mazo.add(new Sorpresa ("Has pagado en tu cafeteria preferida y te han dado dinero menos en el cambio. ¡Qué mala suerte !", 200, TipoSorpresa.PAGARCOBRAR));
        mazo.add(new Sorpresa ("Te has encontrado un billete de autobus y te has subido. Viajas a otra casilla", 10, TipoSorpresa.IRACASILLA));
        mazo.add(new Sorpresa ("Te han invitado a subirse unos amigos a su coche. Viajas a otra casilla", 15, TipoSorpresa.IRACASILLA));
        mazo.add(new Sorpresa ("Las contrucciones de tus propiedades estan muy bien. Te dan un premio en metalico por cada una de ellas", 200, TipoSorpresa.PORCASAHOTEL));
        mazo.add(new Sorpresa ("Las contrucciones de tus propiedades estan muy mal. Te ponen una multa por cada una de ellas", 200, TipoSorpresa.PORCASAHOTEL));
        mazo.add(new Sorpresa ("Ha sido tu cumpleaños y cada jugador te da un regalo. Felicidades", 200, TipoSorpresa.PORJUGADOR));
        mazo.add(new Sorpresa ("Te han pillado haciendo trampas al parchis. Tienes que pagar a cada jugador una compensación", 200, TipoSorpresa.PORJUGADOR));
        mazo.add(new Sorpresa ("Inicio del juego", 0, TipoSorpresa.IRACASILLA));
        

        //Hay que barajarla para ello usamos el metodo collletion.shuffle(mazo)
        //EN ruby @mazo.shuffle
        
        //Cuadno usamos una carta hay que usar la funcion remove(0), para quitar la carta primera y luego usamos el add para aniadilar al final
    }
    
    
    private void inicializarJugadores(ArrayList<String> nombres){
        
        for (String nombre : nombres) {
            jugadores.add(new Jugador (nombre));
        }
        
    }
    
    private void inicializarTablero(){
        
        this.tablero = new Tablero();
        
        
    }
    
    /* Funciones expecificas de la clase  */ 
    
    public boolean aplicarSorpresa(){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    public boolean cancelarHipoteca(Casilla casilla){
        
            throw new UnsupportedOperationException("Sin implementar");
            
            
    }
    
   //modicifacion 08-11-2017 * revisar
    public boolean comprarTituloPropiedad(){
        
            
       return this.getJugadorActual().comprarTitulo(); 
    }
     //FIN modicifacion 08-11-2017
    
    public boolean edificarCasa(Casilla casilla){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    public boolean edificarHotel(Casilla casilla){
        
        throw new UnsupportedOperationException("Sin implementar");    
        
    }
    
    //modicifacion 08-11-2017 * revisar
    public boolean hipotecarPropiedad(Casilla cailla){
        
            f
        return this.hipotecarPropiedad(cailla);
    }
    //FIN modicifacion 08-11-2017
    
    public void inicializarJuego(String nombres[]){
        
            throw new UnsupportedOperationException("Sin implementar");
            
    }
    
     //modicifacion 09-11-2017 * revisar
    public boolean intentaSalirCArcel(MetodoSalirCarcel metodo){
        boolean libre= false;
            if(metodo == MetodoSalirCarcel.TIRANDODADO){
                libre=this.dado.tirar() > 5; 
            }
            else if(metodo == MetodoSalirCarcel.PAGANDOLIBERTAD){
                libre = this.jugadorActual.pagarLibertad(- this.PRECIO_LIBERTAD);
            }
            
            if(libre){
                this.jugadorActual.setEncarcelado(false);
                
            }
            return libre;
    }
    
     //FIN modicifacion 09-11-2017
    
     //modicifacion 08-11-2017
    public boolean jugar(){
        
        int valorDado = this.dado.tirar();
        Casilla casillaPosicion= this.getJugadorActual().getCasillaActual();
        Casilla nuevaCasilla = this.tablero.obtenerNuevaCasilla(casillaPosicion, valorDado);
        boolean tienePropietario = this.getJugadorActual().actualizarPosicion(nuevaCasilla);
        if(!nuevaCasilla.soyEdificable()){
            if(nuevaCasilla.getTipo() ==  TipoCasilla.JUEZ){
                this.encarcelarJugador();
            }
            else if(nuevaCasilla.getTipo() ==  TipoCasilla.SORPRESA){
                //implementar el sacar una carta
            }
        }
        
      return tienePropietario;  
        
            
    }
    
    //FIN modicifacion 08-11-2017
    
    public ArrayList obtenerRanking(){
        
            throw new UnsupportedOperationException("Sin implementar");
            
    }
    
    public ArrayList<Casilla> propiedadesHipotecadasJugador(boolean hipotecadas){ 
//neseto que algunas funciones extra para que funcione bien
        ArrayList<Casilla> casi = new ArrayList();
        for (int i=0; i < this.getJugadorActual().obtenerPopiedadesHipotecadas(hipotecadas).size();i++){
            if(this.getJugadorActual().obtenerPopiedadesHipotecadas(hipotecadas).get(i).getHipotecada()== hipotecadas)
                casi.add(this.getJugadorActual().obtenerPopiedadesHipotecadas(hipotecadas).get(i).getCasilla());
        }
        
        return casi;
    }
    
    public void siguienteJugador(){
        int pos=0;
        for(int i=0; i<jugadores.size();i++){
            if (this.getJugadorActual() == jugadores.get(i))
                pos=i;   
        }
        if(pos == 3)
            jugadorActual = jugadores.get(0);
        else{
            jugadorActual= jugadores.get(pos);
        }
    }
    
    public boolean venderPropiedad(Casilla casilla){
        
        throw new UnsupportedOperationException("Sin implementar");
        
    }
    
    //modicifacion 08-11-2017
    private void encarcelarJugador(){
        
        if (!this.getJugadorActual().tengoCartaLibertad()){
            
            this.getJugadorActual().irACarcel(this.tablero.getCarcel());
        }
        else{
           mazo.add(this.getJugadorActual().devolverCartaLibertad());
            
            
        }
        
    }
    //FIN modicifacion 08-11-2017
    
    private void salidaJugadores(){
        Random generadorAleatorios= new Random();
        int numAleatorio = generadorAleatorios.nextInt(2);
        
        for(int i=0; i<jugadores.size();i++){
            jugadores.get(i).actualizarPosicion(tablero.obtenerCasillaNumero(0));
            jugadores.get(i).modificarSaldo(7500);
        }

        jugadorActual= jugadores.get(numAleatorio);
    }

    @Override
    public String toString() {
        return "Qytetet{" + "MAX_JUGADORES=" + MAX_JUGADORES + ", MAX_CARTAS=" + MAX_CARTAS + ", MAX_CASILLAS=" + MAX_CASILLAS + ", PRECIO_LIBERTAD=" + PRECIO_LIBERTAD + ", SALDO_SALIDA=" + SALDO_SALIDA + ", cartaActual=" + cartaActual + ", tablero=" + tablero + ", dado=" + dado + ", mazo=" + mazo + ", jugadores=" + jugadores + ", jugadorActual=" + jugadorActual + '}';
        
        
    }
    
    
}
