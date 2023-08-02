# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class NewClass
  def initialize
    
  end
end
 @@mazo=Array.new
    def self.inicializar_sorpresa
     # @@mazo<< Sorpresa.new("Un fan anónimo ha pagado tu fianza. Sales de la cárcel", 0, TipoSorpresa::SALIRCARCEL)
      #@@mazo<< Sorpresa.new("Te hemos pillado con chanclas y calcetines, lo sentimos, ¡debes ir a la carcel!", 9, TipoSorpresa::IRACASILLA)
     #---> mazo<< Sorpresa.new("Te han delatado. Entras a la cárcel", 9, TipoSorpresa::ENTRARCARCEL)
      #@@mazo<< Sorpresa.new("Ibas pasenado y te has encontrado dinero. ¡Qué suerte !", 200, TipoSorpresa::PAGARCOBRAR)
     # @@mazo<< Sorpresa.new("Has pagado en tu cafeteria preferida y te han dado dinero menos en el cambio. ¡Qué mala suerte !", 200, TipoSorpresa::PAGARCOBRAR)
      @@mazo<< Sorpresa.new("Te has encontrado un billete de autobus y te has subido. Viajas a otra casilla", 10, TipoSorpresa::IRACASILLA)
      @@mazo<< Sorpresa.new("Te han invitado a subirse unos amigos a su coche. Viajas a otra casilla", 15, TipoSorpresa::IRACASILLA)
      @@mazo<< Sorpresa.new("Las contrucciones de tus propiedades estan muy bien. Te dan un premio en metalico por cada una de ellas", 200, TipoSorpresa::PORCASAHOTEL)
      @@mazo<< Sorpresa.new("Las contrucciones de tus propiedades estan muy mal. Te ponen una multa por cada una de ella", 200, TipoSorpresa::PORCASAHOTEL)
      @@mazo<< Sorpresa.new("Ha sido tu cumpleaños y cada jugador te da un regalo. Felicidades", 200, TipoSorpresa::PORJUGADOR)
      @@mazo<< Sorpresa.new("Te han pillado haciendo trampas al parchis. Tienes que pagar a cada jugador una compensación", 200, TipoSorpresa::PORJUGADOR)
    
    end
    

inicializar_sorpresa
    
       puts @@mazo.to_s()
       puts "ok mazo"









