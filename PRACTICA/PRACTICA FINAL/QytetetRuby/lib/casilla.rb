#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

module ModeloQytetet
  
  # Requieres/ incluides
  require_relative "titulo_propiedad"
  require_relative "tipo_casilla"
  
  class Casilla
    
  # Getter/consultores
    attr_reader :num_casilla, :coste, :tipo
    
  # Getter and Setter
    attr_accessor :num_casas, :num_hoteles, :titulo
    
  # Inicialize
    def initialize(ncasi, co, tip, tit=nil)
      @num_casilla =ncasi
      @coste =co
      @tipo =tip
      @num_hoteles = 0 
      @num_casas = 0
      @titulo =tit

    end
    
  # Metodos propios de la clase
    def asignar_propietario(jugador)
      
      raise"....."
      
    end
    
    def calcular_valor_hipoteca()
      
      raise "....."
      
    end
    
    def cancelar_hipoteca()
      
      raise "......"
      
    end
    
    def cobrar_alquiler()
      
      raise"......"
      
    end
    
    def edificar_casa()
      
      raise"....."
      
    end
    
    def edificar_hotel()
      
      raise"....."
      
    end
    
    def esta_hipotecada?
      
      raise "....."
      
    end
    
    def get_coste_hipotecada()
      
      raise "....."
      
    end
    
    def get_precio_edificar()
      
      raise"....."
      
    end
    
    def hipotecar()
      
      raise""
    
    end
    
    def precio_total_comprar()
      
      raise"......"
      
    end
    
    def propietario_encarcelado?
      
      rasise "....."
      
    end
    
    def se_puede_edificar_casa?
      
      raise "......."
      
    end
    
    def se_puede_edificar_hotel?
      
      raise "....."
      
    end
    
    def soy_edificable?
      
      raise "...."
      
    end
    
    def tengo_propietario?
      
      raise "...."
      
    end
    
    def vender_titulo()
      
      raise "...."
    
    end
    private
    def asignar_titulo_propiedad()
      
      raise "...."
      
    end   
    public
    
  #Metodo to string
    def to_s
        "Nummero Casilla: #{@num_casilla} \n Coste: #{@coste}\n Numero Casas: #{@num_casas}\n 
         Número Hoteles: #{@num_hotele}\n tipo: #{@tipo}\n" 
         titulo.to_s
    end 
  end
end
