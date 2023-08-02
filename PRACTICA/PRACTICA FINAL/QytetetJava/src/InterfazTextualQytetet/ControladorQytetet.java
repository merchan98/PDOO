/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazTextualQytetet;


import java.util.ArrayList;
import modeloqytetet.*;


/**
 *
 * @author franm
 */
public class ControladorQytetet {
    
    Qytetet juego = Qytetet.getInstance();
    Jugador jugador;
    Casilla casilla;
    VistaTextualQytetet vista= new VistaTextualQytetet();
    
    public void desarrolloJuego(){
       boolean bancarrota= false;
       int opcion= -1;
      do{
          if(jugador.getEncarcelado()){ //si el jugador esta en la carcel
              opcion = this.vista.menuSalirCarcel();
              boolean libre= false;
              String texto="";
              switch(opcion) {
                  case 0: libre = this.juego.intentaSalirCArcel(MetodoSalirCarcel.TIRANDODADO); break;
                  case 1: libre = this.juego.intentaSalirCArcel(MetodoSalirCarcel.PAGANDOLIBERTAD);break;
              }
              if(libre)
                  texto= "Genial, te has librado de la carcel";
              else if(!libre)
                        texto= "Que mala suerte no has podido salir de la carcel";
              
              this.vista.mostrar(texto);
              
          }
            this.vista.mostrar(this.jugador.toString());// mostramos el estado del juego
          if(!this.juego.getJugadorActual().getEncarcelado()){ //si el jugador no esta en la carel o cabad e salri de ella
              System.out.println("****** ENTRO EN IF PARA JUGAR SIN ENACRCELAR*******");
              boolean tienePropietario= false;
              tienePropietario = this.juego.jugar(); //Jugamos y nos movemos
              this.casilla = this.juego.getJugadorActual().getCasillaActual(); //mostramos la casilla actula
              this.vista.mostrar(this.juego.getJugadorActual().toString());
              
              if(this.casilla.getTipo() == TipoCasilla.SORPRESA){ //Comprobamos que sea una casilla sorpresa
                  this.juego.aplicarSorpresa();
                  bancarrota = this.jugador.bancarrota();//comprobar si el usuario esta en  bancarrota
              }else if(this.casilla.getTipo() == TipoCasilla.CALLE){ //Comprobamos que se una casilla tipo calle
                      this.vista.mostrar(this.casilla.toString());
                     System.out.println("ENTRO EN EL IF DE CALLE");
                     System.out.println(tienePropietario);
                      if(!tienePropietario){
                          if(this.vista.elegirQuieroComprar()){
                              if(this.juego.comprarTituloPropiedad())
                                  this.vista.mostrar("Bien hecho, acabas de adquierir esta Calle");
                              else{
                                  bancarrota = this.jugador.bancarrota();//comprobar si el usuario esta en  bancarrota
                                 this.vista.mostrar("Que pena no se ha podido realizar la transaccion");
                              this.casilla = this.juego.getJugadorActual().getCasillaActual();
                              this.vista.mostrar(this.casilla.toString());
                              
                              }
                          }
                      }
                      else{
                        this.vista.mostrar("Esta casilla tiene propietario, tienes que pagar el alquiler.");
                        bancarrota = this.jugador.bancarrota();//comprobar si el usuario esta en  bancarrota
                      }
                    }
           }
           this.vista.mostrar(this.jugador.toString());// mostramos el estado del juego
          if(!this.jugador.getEncarcelado() && this.jugador.tengoPropiedades() && !bancarrota ){
              //necesito  saber si este menu se repite hasta que se le de a la opcion 0
              boolean siguiente =true;
              do{this.vista.mostrar("ESTOY DENTRO DE MUNU GESTION INMOBILIARIA");
              opcion = this.vista.menuGestionInmobiliaria();
              boolean cumplido= false;
              siguiente =true;
              ArrayList<Casilla> casillas;
              String texto="";
              
              switch(opcion) {
                  case 0: {
                     texto= "Demos paso al siguiente jugador";
                     siguiente =false;
                     
                  } break;
                  case 1: {   
                      int opcion2 = this.vista.menuElegirPropiedad(this.juego.getJugadorActual().obtenerPopiedadesHipotecadasString(false));
                      System.out.println("opcion2 "+opcion2);
                      casillas = this.juego.propiedadesHipotecadasJugador(false);
                      System.out.println(casillas);
                      cumplido = this.juego.edificarCasa(casillas.get(opcion2));
                      if(cumplido)
                          texto = "Genial has constuido una casa.";
                      else if(!cumplido)
                          texto = "Que pena no has podido construir una casa";
                      
                  }break;
                  case 2: {                      
                      casillas = this.juego.propiedadesHipotecadasJugador(false);
                      cumplido = this.juego.edificarHotel(this.elegirPropiedad(casillas));
                      if(cumplido)
                          texto = "Genial has constuido un hotel.";
                      else if(!cumplido)
                          texto = "Que pena no has podido construir un hotel";
                      
                  }break;
                  case 3: {                      
                      casillas = this.juego.propiedadesHipotecadasJugador(false);
                      cumplido = this.juego.venderPropiedad(this.elegirPropiedad(casillas));
                      if(cumplido)
                          texto = "Genial has vendido la propiedad.";
                      else if(!cumplido)
                          texto = "Que pena no has podido vender la propiedad.";
                        
                  }break;
                  case 4: {                      
                      casillas = this.juego.propiedadesHipotecadasJugador(false);
                      cumplido = this.juego.hipotecarPropiedad(this.elegirPropiedad(casillas));
                      if(cumplido)
                          texto = "Genial has hipotecado la propiedad.";
                      else if(!cumplido)
                          texto = "Que pena no has podido hipotecar la propiedad.";
                      
                  }break;
                  case 5: {                      
                      casillas = this.juego.propiedadesHipotecadasJugador(true);
                      cumplido = this.juego.venderPropiedad(this.elegirPropiedad(casillas));
                      if(cumplido)
                          texto = "Genial has vendido la propiedad.";
                      else if(!cumplido)
                          texto = "Que pena no has podido vender la propiedad.";
                      
                  }break;
                }
                this.vista.mostrar("ESTOY FUERA");
                this.vista.mostrar(texto);
                bancarrota = this.jugador.bancarrota();//comprobar si el usuario esta en  bancarrota
                } while(siguiente && !bancarrota);
          this.vista.mostrar(this.jugador.toString());// mostramos el estado del juego
          bancarrota = this.jugador.bancarrota();//comprobar si el usuario esta en  bancarrota
        }
          this.vista.mostrar("ESTOY CAMBIANDO DE JUGADOR");
          this.vista.mostrar(this.jugador.toString());
          this.juego.siguienteJugador(); //Pasamos al siguiente jugador
          this.jugador = this.juego.getJugadorActual();
          this.vista.mostrar(this.jugador.toString());
          this.vista.mostrar("HE CAMBIADO DE JUGADOR");
          bancarrota = this.jugador.bancarrota();//comprobar si el usuario esta en  bancarrota
      }while(!bancarrota);
      
      if(bancarrota)
         juego.obtenerRanking();
         
    }
    
    public void inicializacionJuego(){
        System.out.println("ejecuto inicializacion Juego");
        
        ArrayList<String> nombres = new ArrayList();
        nombres.add("primero");
        nombres.add("segundo");
        nombres.add("tercero");
        nombres.add("cuarto");
        
        this.juego.inicializarJuego(this.vista.obtenerNombreJugadores());
        
        jugador = juego.getJugadorActual();
        
        System.out.println(juego.getJugadorActual());
        System.out.println(this.juego.getJugadorActual());
        //System.out.println("********Fin represenyacion jugador actual en controlador ***********");
        System.out.println(juego.getJugadorActual().getCasillaActual());
        casilla = juego.getJugadorActual().getCasillaActual();
        
        this.vista.mostrar(juego.toString());
        //System.out.println("FIN mostrar juego");
        
    }
    
    public Casilla elegirPropiedad(ArrayList<Casilla> propiedades){ 
        //este metodo toma una lista de propiedades y genera una lista de strings, con el numero y nombre de las propiedades
        //luego llama a la vista para que el usuario pueda elegir.
        vista.mostrar("\tCasilla\tTitulo");
        int seleccion;
        ArrayList<String> listaPropiedades= new ArrayList();
        propiedades.forEach((casilla1) -> {
            listaPropiedades.add( "\t"+casilla1.getNumeroCasilla()+"\t"+casilla1.getTitulo().getNombre());
        });
        seleccion=vista.menuElegirPropiedad(listaPropiedades);  
        return propiedades.get(seleccion);
    }
 
public static void main(String[] args) {
        //System.out.println("ejecuto main");
        ControladorQytetet controlador = new ControladorQytetet();

        controlador.inicializacionJuego();
        //System.out.println(" ***FIN inicializacion juego controlador");
        //System.out.println("mando a jecutar desarrollo controlador");
        controlador.desarrolloJuego();
    
     
    
}

}
