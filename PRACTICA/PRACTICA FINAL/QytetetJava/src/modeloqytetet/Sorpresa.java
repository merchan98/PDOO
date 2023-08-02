/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloqytetet;

/**
 *
 * @author franmerchan6
 */
import modeloqytetet.TipoSorpresa;

public class Sorpresa {
    
    /* Variables  */
    private String texto;
    private TipoSorpresa tipo;
    private int valor;
    
    
    /* Contructores  */
    public Sorpresa(String texto, int valor, TipoSorpresa tipo) {
        this.texto = texto;
        this.tipo = tipo;
        this.valor = valor;
    }

    /* Getter/consultores  */
    String getTexto() {
        return texto;
    }

    TipoSorpresa getTipo() {
        return tipo;
    }

    int getValor() {
        return valor;
    }
    
    /* Funcion to string  */
    @Override
    public String toString() {
        return "Sorpresa{" + "texto=" + texto + ", tipo=" + tipo + ", valor=" + valor + '}';
    }
    
    
}
