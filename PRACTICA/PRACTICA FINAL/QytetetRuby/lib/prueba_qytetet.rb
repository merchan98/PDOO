#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
require_relative "sorpresa"
require_relative "qytetet"
require_relative "club"

module ModeloQytetet
  class PruebaQytetet
    #Prueba nº1
   
  
    def self.main
      
      # @@nom =Array.new 
       #@@nom<< "primero"
      # @@nom<< "segundo"
      # @@nom<<"tercero"
      # @@nom<<"cuarto"
       #puts @@nom.to_s()
      # puts "ok nom"
       #qytetet = Qytetet.instance
       #puts "OK creo objeto Qytetet"
       #puts qytetet.to_s()
       #puts "OK Qytetet"
       
      #EXAMEN
      @club =Club.new("primo", nil, "http://pueba")

      @jugador = Jugador.new("elprimero")

      @club.nuevo_socio(@jugador)

      
      puts @club.to_s
      puts @club.simbolo
      #EXAMEN
    end
    
  end
  PruebaQytetet.main
 
end