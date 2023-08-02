#encoding: utf-8
# der, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

module ModeloQytetet
  
  # Requieres/ incluides
  require_relative "casilla"
  require_relative "titulo_propiedad"
  
  class TituloPropiedad
    
    # Getter/consultores 
    attr_reader :nombre, :alquiler_base, :factor_revalorizado, :hipoteca_base, :precio_edificar, :casilla, :propietario
    
    # Getter and Setter
    attr_accessor :hipotecada
    
    # Setter/Modificadores
    attr_writer :casilla, :propietario
    
    # Inicialize
      def initialize(n, h, ab, fr, hp, pe, ca=nil, pro=nil)
        @nombre = n
        @hipotecada = h
        @alquiler_base =ab
        @factor_revalorizado = fr
        @hipoteca_base= hp
        @precio_edificar =pe
        
        @casilla= ca
        @propietario= pro
        

        
      end
      
    # Metodos propios de la clase
      def cobrar_alquiler(coste)
        
        raise"......."
        
      end
      
      def propietario_encarcelado?
        
        raise"......"
               
      end
      
      def tengo_propietario?
        
        raise "....."
        
      end
    #Metodo to string
      def to_s
        "Texto: #{@nombre} \n Hipotecada: #{@hipotecada} \n Alquiler base: #{@alquiler_base} \n
        Factor Revalorizado: #{@factor_revalorizade} \n
        Hipoteca base: #{@hipoteca_base} \n
        Precio a edificar: #{@precio_edifica} \n "
      end 
  end
end
