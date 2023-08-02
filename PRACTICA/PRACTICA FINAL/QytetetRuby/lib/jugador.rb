#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

module ModeloQytetet
  
  # Requieres/ incluides
  require_relative "titulo_propiedad"
  require_relative  "sorpresa"
  require_relative  "casilla"
  
  class Jugador
    
    # Getter/consultores
    attr_reader :nombre, :saldo
    
    # Getter and Setter
    attr_accessor :casilla_actual, :encarcelado, :titulos, :clubs
    
    # Setter/Modificadores
    attr_writer :carta_libertad
    
    def initialize(nom)
      @nombre= nom
      @encarcelado=false
      @saldo=7500
      @carta_libertad = nil
      @titulos = Array.new
      @casilla_actual = 0
      
      
    end
    
    #to string
    def to_s
    resultados = "Nombre: #{@nombre} \n Encarcelado: #{@encarcelado}\n Saldo: #{@saldo}\n 
       Carta de Libertad: #{@carta_libertad.to_s}\n Casilla Actual: #{@casilla_actual.to_s}\n "
      
      resultado =nil
      @titulos.each {|titulo|
        resultado= resultado +  titulo.to_s + "\n"
       
      return resultado
      
        
      }
    end  
    
    def tengo_propiedades()
        
        raise"......."
        
    end
    
    def actualizar_posicion(casilla)
        
        raise ".............."
        
    end

    def comprar_titulo()
        
      raise"......."
        
    end
    
    def devolver_carta_libertad()
        
      raise"......."
        
    end
    
    def ir_a_carcel(casilla)
        
        raise"......."
        
    end
    
    def modificar_saldo(cantidad)
        
        raise"......."
        
    end
    
    def obtener_capital()
        
        raise"......."
        
    end
    
    
    def obtener_propiedades_hipotecadas(hipotecada)
        
        raise"......."
        
    end
    
    def pagar_conbrar_por_casa_y_hotel(cantidad)
        
        raise"......."
        
    end
    
    def pagar1_libertad(cantidad)
        
        raise"......."
        
    end
    
    def puedo_edificar_casa(casilla)
        
        raise"......."
        
    end
    
    def puedo_edificar_hotel(casilla)
        
        raise"......."
        
    end    
    
    def puedo_hipotecar(casilla)
        
        raise"......."
        
    end

    def puedo_pagar_hipoteca(casilla)
        
        raise"......."
        
    end  
    
    def puedo_vender_propiedad(casilla)
        
        raise"......."
        
    end 
    
    def tengo_carta_libertad?
        
        raise"......."
        
    end
    
    def vender_propiedad(casilla)
        
        raise"......."
        
    end
    
    def cuantas_casas_hoteles_tengo
        
        raise"......."
        
    end
    
    def eliminar_de_mis_propiedades(casilla)
        
        raise"......."
        
    end
    
    def es_de_mipropiedad(casilla)
        
        raise"......."
        
    end
    
    def tengo_saldo(cantidad)
        
        raise"......."
        
    end
    

    
   private :tengo_saldo, :es_de_mipropiedad, :eliminar_de_mis_propiedades ,:cuantas_casas_hoteles_tengo
  end
end