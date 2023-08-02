# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.


module ModeloQytetet
   #EXAMEN
  class Trampso<Jugador
    
    attr_accessor :veces_trampas, :importe_no_pagado, 
    
    def initialize(juga)
      @veces_trampas =0
      @importe_no_pagado =0;
      
      
    end
    
    def pago_aleatorio()
      return 
    end
    
    def modificar_saldo(cantidad)
      if(pago_aleatorio == 1)
           super.modificarSaldo(cantidad/2)
           @veces_trampas++
           @importe_no_pagado = @importe_no_pagado + cantidad/2 

       else 
           super.modificarSaldo(cantidad)
      end
    end
    
  end
  
  def perdonado()
    @veces_trampas =0;
    @importe_no_pagadp =0;
  end
  
  #EXAMEN
  
end

