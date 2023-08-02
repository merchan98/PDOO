/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloqytetet;

/**
 *
 * @author franm
 */
public class Especulador extends Jugador {

    static int FactorEspeculador = 2;
    private int fianza;
    
    protected Especulador(Jugador jugador, int fianza){
        super(jugador); 
        this.fianza = fianza;
    }
    
    @Override
    protected void pagarImpuestos(int cantidad){
        this.modificarSaldo(-(cantidad/this.FactorEspeculador));
    }
    
    @Override
    protected void irACarcel(Casilla casilla){
        if(!this.pagarFianza(this.fianza)){
            this.setCasillaActual(casilla);
            this.setEncarcelado(true);  
        }  
    }
    
    @Override
    protected Especulador convertirme(int fianza){
        
        return this;
    }
    
    private boolean pagarFianza(int cantidad){
        boolean puedo = this.tengoSaldo(cantidad);
        if(puedo)
            this.modificarSaldo(cantidad);
        return puedo;
    }
    @Override
    public String toString() {
        return super.toString() +  "\n\t ·Fianza = " + this.fianza + "\n\t ·Factor de Especulacion = " + this.FactorEspeculador;
        
    }
}
