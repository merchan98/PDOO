#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

module ModeloQytetet
  
  
  # Requieres/ incluides
  require_relative "casilla"
  
  class Tablero
    
    # Getter and Setter
    attr_accessor :casillas, :carcel
    
    def initialize
      @casillas= Array.new
      @carcel 
      inicializar()
    end
    
    
    def inicializar()
      @casillas<< Casilla.new(0,0, TipoCasilla::SALIDA)
      @casillas<< Casilla.new(1,500, TipoCasilla::CALLE, TituloPropiedad.new("primera", false,2,0.1,3,4))
      @casillas<< Casilla.new(2,500, TipoCasilla::CALLE, TituloPropiedad.new("segunda", false,3,0.2,5,6))
      @casillas<< Casilla.new(3,0, TipoCasilla::SORPRESA)
      @casillas<< Casilla.new(4,0, TipoCasilla::CARCEL)

      
      @carcel = @casillas[4]
    end
    
    # Metodos propios de la clase
    def es_casilla_carcel(numeroCasilla)
      
      
      raise "....."
      
    end
    
    def obtener_casilla_numero(numeroCasilla)
      
      
      raise "......"
      
    end
    
    def obtener_nueva_casilla(casilla, desplazamiento)
      
      raise "......"
      
    end
    
  #Metodo to string
    def to_s
      
      resultado =nill
      @casilla.each {|casi|
        resultado += casi.to_s + "\n"
        
      }
      resultado
    end 
    
    private :inicializar
  end
end
