#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
require_relative 'vista_textual_qytetet'
require_relative 'qytetet'

module InterfazTextualQytetet
  class ControladorQytetet
    def initialize
      @vista= VistaTextualQytetet.new
      @jugador
      @juego
      @casilla
      
    end
    def inicializacion_juego
      @juego = ModeloQytetet::Qytetet.instance
      nombres = @vista.obtener_nombre_jugadores 
      
      @juego.inicializar_juego(nombres)
      puts @juego
      @jugador = @juego.jugadorActual
      @casilla = @jugador.casilla_actual
      puts @juego.to_s
      puts "======= jugador Actual ========="
      puts @jugador.to_s
      
    end
    
    def elegir_propiedad(propiedades) # lista de propiedades a elegir
       vista.mostrar("\tCasilla\tTitulo");
       
       lista_propiedades= Array.new
       for prop in propiedades  # crea una lista de strings con numeros y nombres de propiedades
                propString= prop.numeroCasilla.to_s+' '+prop.titulo.nombre; 
               listaPropiedades<<propString
        end
        seleccion=vista.menu_elegir_propiedad(listaPropiedades)  # elige de esa lista del menu
        propiedades.at(seleccion)
 end
    def self.main
      controlador = ControladorQytetet.new
      controlador.inicializacion_juego()
    end
    
    
  end
  
  ControladorQytetet.main
end
