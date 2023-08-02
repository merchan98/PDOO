# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.




module ModeloQytetet
  
  # Requieres/ incluides
  require_relative "tablero"
require_relative "dado"
require_relative "metodo_salir_carcel"
require_relative "Sorpresa"
require_relative "jugador"
require 'singleton'
  
  
  class Qytetet
    include Singleton
    
    # Getter/consultores
    attr_reader :cartaActual , :tablero , :dado , :mazo , :jugadores , :jugadorActual
    
    # Inicialize
    def initialize()
      @dado= Dado.instance
      @mazo = Array.new
      @jugadores = Array.new
      @nom =Array.new 
       @nom<< "primero"
       @nom<< "segundo"
       @nom<<"tercero"
       @nom<<"cuarto"
      inicializar_jugadores(@nom)
      inicializar_tablero()
      inicializar_carta_sorpresas()
      
    end
      
    
    def inicializar_carta_sorpresas()
        
     # @mazo<< Sorpresa.new("Un fan anónimo ha pagado tu fianza. Sales de la cárcel", 0, TipoSorpresa::SALIRCARCEL)
      #@mazo<< Sorpresa.new("Te hemos pillado con chanclas y calcetines, lo sentimos, ¡debes ir a la carcel!", 9, TipoSorpresa::IRACASILLA)
     #---> mazo<< Sorpresa.new("Te han delatado. Entras a la cárcel", 9, TipoSorpresa::ENTRARCARCEL)
     # @mazo<< Sorpresa.new("Ibas pasenado y te has encontrado dinero. ¡Qué suerte !", 200, TipoSorpresa::PAGARCOBRAR)
     # @mazo<< Sorpresa.new("Has pagado en tu cafeteria preferida y te han dado dinero menos en el cambio. ¡Qué mala suerte !", 200, TipoSorpresa::PAGARCOBRAR)
      @mazo<< Sorpresa.new("Te has encontrado un billete de autobus y te has subido. Viajas a otra casilla", 10, TipoSorpresa::IRACASILLA)
      @mazo<< Sorpresa.new("Te han invitado a subirse unos amigos a su coche. Viajas a otra casilla", 15, TipoSorpresa::IRACASILLA)
      @mazo<< Sorpresa.new("Las contrucciones de tus propiedades estan muy bien. Te dan un premio en metalico por cada una de ellas", 200, TipoSorpresa::PORCASAHOTEL)
      @mazo<< Sorpresa.new("Las contrucciones de tus propiedades estan muy mal. Te ponen una multa por cada una de ella", 200, TipoSorpresa::PORCASAHOTEL)
     # @mazo<< Sorpresa.new("Ha sido tu cumpleaños y cada jugador te da un regalo. Felicidades", 200, TipoSorpresa::PORJUGADOR)
      #@mazo<< Sorpresa.new("Te han pillado haciendo trampas al parchis. Tienes que pagar a cada jugador una compensación", 200, TipoSorpresa::PORJUGADOR)

    end
    
    
    def inicializar_jugadores(nombres)
        
      nombres.each {|nombre|
        @jugadores<< Jugador.new(nombre)
      }
        
    end
    
    def inicializar_tablero()
        
        tablero= Tablero.new
        
        
    end
    
    # Metodos propios de la clase
    
    def aplicar_sorpresa()
        
      raise "....."
        
    end
    
    def cancelar_hipoteca(casilla)
        
      raise "....."
            
            
    end
    
    def comprar_titulo_propiedad()
        
      raise "....."        
    end
    
    def edificar_casa(casilla)
        
      raise "....."        
    end
    
    def edificar_hotel(casilla)
        
      raise "....."        
    end
    
    def hipotecar_propiedad(ailla)
        
      raise "....."            
    end
    
    def inicializar_juego(nombres)
        
      raise "....."            
    end
    
    def intenta_salir_carcel(metodo)
        
      raise "....."            
    end
    
    def jugar()
        
      raise "....."            
    end
    
    def obtener_ranking()
        
      raise "....."            
    end
    
    def propiedades_hipotecadas_jugador(hipotecadas)
        
      raise "....."        
    end
    
    def siguiente_jugador()
        
      raise "....."        
    end
    
    def vender_propiedad(casilla)
        
      raise "....."        
   end
    
    def encarcelar_jugador()
        
      raise "....."        
    end
    
    def salida_jugadores()
        
      raise "....."        
    end
    
    private :inicializar_carta_sorpresas, :inicializar_jugadores, :inicializar_tablero
    
  end
  
   #to string
    def to_s()
    puts ":Jugadores maximos: #{@MAX_JUGADORES} \n Cartas Maximas: #{@MAX_CARTAS}\n Precio Libertad: #{@PRECIO_LIBERTAD}\n Saldo de Salida: #{@SALDO_SALIDA}\n Tablero: #{@Tablero.to_s}\n Dado: #{@dado.to_s}\n Mazo: #{@mazo.to_s}\n Jugadores: #{@jugadores.to_s}\n Jugador actual: #{@jugadorActual.to_s}\n" 
    end  
end
