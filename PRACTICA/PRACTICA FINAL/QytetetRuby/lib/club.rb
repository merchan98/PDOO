#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

module ModeloQytetet
  
  # Requieres/ incluides
  require_relative "jugador"
  
  class Club
    
  # Getter/consultores
    attr_reader :simbolo, :direccion, :web 
    
  # Getter and Setter
    attr_accessor :nombre, :jugador
    
    
  # Inicialize  
    def initialize(nom,dir=nil, w=nil )
      @@simbolo= "$&€"
      @nombre= nom
      @direccion =dir
      @web =w
      @socios= Array.new
      puts"entro inicialize"
    end
    
    
  # Metodos propios de la clase
  
  def nuevo_socio(jugador)
    @socios<<jugador
    
  end  
    
  def simbolo
    @@simbolo
  end
  
    def to_s
      
      return "Nombre: #{@nombre} \n web: #{@web}\n direccion: #{@direccion}\n Socios: #{@socios}\n Simobolo: #{@@simbolo}\n "
      
    end
    
  end
end
