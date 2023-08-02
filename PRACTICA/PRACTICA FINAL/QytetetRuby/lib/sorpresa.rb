#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.


module ModeloQytetet
  
  # Requieres/ incluides
  require_relative "tipo_sorpresa"
  
  class Sorpresa
    #Consultores
    attr_reader :texto, :valor, :tipo
    
    #inicializador
    def initialize(t,v,tp)
     @texto = t
     @valor = v
     @tipo = tp
    end
    
    #to string
    def to_s
    "Texto: #{@texto} \n Valor: #{@valor} \n Tipo: #{@tipo}"
    end 
    
  end
end