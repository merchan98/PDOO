/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIQytetet;

/**
 *
 * @author franm
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modeloqytetet.*;

public class ControladorQytetet extends javax.swing.JFrame {

    Qytetet modeloQytetet;
    
    public void actualizar(Qytetet qytetet){
        this.modeloQytetet = qytetet;
        
    }
    /**
     * Creates new form ControladorQytetet
     */
    public ControladorQytetet() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vistaQytetet1 = new GUIQytetet.VistaQytetet();
        jbSalirCarcelDado = new javax.swing.JButton();
        jbSalirCarcelPagando = new javax.swing.JButton();
        jComprar = new javax.swing.JButton();
        jAplicarSorpresa = new javax.swing.JButton();
        jbJugar = new javax.swing.JButton();
        jPasarTurno = new javax.swing.JButton();
        jEdificarCasa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbSalirCarcelDado.setText("Salir carcel tirando dado");
        jbSalirCarcelDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirCarcelDadoActionPerformed(evt);
            }
        });

        jbSalirCarcelPagando.setText("Salir carcel pagando");
        jbSalirCarcelPagando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirCarcelPagandoActionPerformed(evt);
            }
        });

        jComprar.setText("Comprar");
        jComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComprarActionPerformed(evt);
            }
        });

        jAplicarSorpresa.setText("Aplicar Sorpresa");
        jAplicarSorpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAplicarSorpresaActionPerformed(evt);
            }
        });

        jbJugar.setText("Jugar");
        jbJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbJugarActionPerformed(evt);
            }
        });

        jPasarTurno.setText("Pasar Turno");
        jPasarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasarTurnoActionPerformed(evt);
            }
        });

        jEdificarCasa.setText("Edificar casa aqui");
        jEdificarCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEdificarCasaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbSalirCarcelPagando, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbSalirCarcelDado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jAplicarSorpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 137, Short.MAX_VALUE))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasarTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jEdificarCasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(72, 72, 72)
                        .addComponent(jbJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(vistaQytetet1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(vistaQytetet1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbSalirCarcelDado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbSalirCarcelPagando, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jAplicarSorpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPasarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jEdificarCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirCarcelDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirCarcelDadoActionPerformed
        boolean resultado = modeloQytetet.intentaSalirCArcel(MetodoSalirCarcel.TIRANDODADO);
        this.jbSalirCarcelPagando.setEnabled(false);
        this.jbSalirCarcelDado.setEnabled(false);
        //EXMAEN
        this.jEdificarCasa.setEnabled(false);
        //EXMAEN
        if(resultado){
            JOptionPane.showMessageDialog(this, "Sales de la cárcel");
            this.jbJugar.setEnabled(true);
        } 
        else {
            JOptionPane.showMessageDialog(this, "NO sales de la carcel");
            this.jPasarTurno.setEnabled(true);
        }
        this.vistaQytetet1.actualizar(modeloQytetet);
    }//GEN-LAST:event_jbSalirCarcelDadoActionPerformed

    private void jbSalirCarcelPagandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirCarcelPagandoActionPerformed
        
        boolean resultado = modeloQytetet.intentaSalirCArcel(MetodoSalirCarcel.PAGANDOLIBERTAD);
        this.jbSalirCarcelPagando.setEnabled(false);
        this.jbSalirCarcelDado.setEnabled(false);
        //EXMAEN
        this.jEdificarCasa.setEnabled(false);
        //EXMAEN
        this.jAplicarSorpresa.setEnabled(false);
        this.jComprar.setEnabled(false);
        
        if(resultado){
            JOptionPane.showMessageDialog(this, "Sales de la cárcel");
            this.jbJugar.setEnabled(true);
        } 
        else {
            JOptionPane.showMessageDialog(this, "NO sales de la carcel");
            this.jPasarTurno.setEnabled(true);
        }
        this.vistaQytetet1.actualizar(modeloQytetet);
    }//GEN-LAST:event_jbSalirCarcelPagandoActionPerformed

    private void jComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComprarActionPerformed
            this.jbSalirCarcelPagando.setEnabled(false);
            this.jbSalirCarcelDado.setEnabled(false);
            //EXMAEN
            this.jEdificarCasa.setEnabled(false);
            //EXMAEN
        
        if(modeloQytetet.getJugadorActual().getCasillaActual().getTipo() == TipoCasilla.CALLE){
            boolean resultado = modeloQytetet.comprarTituloPropiedad();

            this.jAplicarSorpresa.setEnabled(false);
            if(resultado){
                JOptionPane.showMessageDialog(this, "Has comprado la casilla");
                this.jbJugar.setEnabled(true);
                //EXMAEN
                this.jEdificarCasa.setEnabled(true);
                //EXMAEN
            } 
            else {
                JOptionPane.showMessageDialog(this, "NO has comprado la casilla");
                this.jPasarTurno.setEnabled(true);
            }
        }
        else{
            this.jAplicarSorpresa.setEnabled(true);
            this.jComprar.setEnabled(false);
        }
            this.jbJugar.setEnabled(false);
        this.vistaQytetet1.actualizar(modeloQytetet);
        
        
    }//GEN-LAST:event_jComprarActionPerformed

    private void jbJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbJugarActionPerformed
       
        
        boolean tengoPropietario =  modeloQytetet.jugar();
        //EXMAEN
        this.jEdificarCasa.setEnabled(false);
        //EXMAEN
        this.jAplicarSorpresa.setEnabled(false);
       TipoCasilla tipo= modeloQytetet.getJugadorActual().getCasillaActual().getTipo();
       if(!tengoPropietario && (tipo == TipoCasilla.CALLE)){
           this.jComprar.setEnabled(true);
           this.jbSalirCarcelPagando.setEnabled(false);
           this.jbSalirCarcelDado.setEnabled(false);
           
           
       }
       else if(tipo == TipoCasilla.SORPRESA){
           this.jComprar.setEnabled(false);
           this.jbSalirCarcelPagando.setEnabled(false);
           this.jbSalirCarcelDado.setEnabled(false);
           this.jAplicarSorpresa.setEnabled(true);
           //EXMAEN
           this.jEdificarCasa.setEnabled(false);
           //EXMAEN
       }
       
       if(modeloQytetet.getJugadorActual().getEncarcelado()){
           this.jComprar.setEnabled(false);
           this.jbSalirCarcelPagando.setEnabled(true);
           this.jbSalirCarcelDado.setEnabled(true);
           this.jAplicarSorpresa.setEnabled(false);
           //EXMAEN
           this.jEdificarCasa.setEnabled(false);
           //EXMAEN
           this.jPasarTurno.setEnabled(false);
       }
       //EXMAEN
       if(modeloQytetet.getJugadorActual().esDeMipropiedad(modeloQytetet.getJugadorActual().getCasillaActual()))
           this.jEdificarCasa.setEnabled(true);
       //EXMAEN
       this.jbJugar.setEnabled(false);
      this.vistaQytetet1.actualizar(modeloQytetet);  
    }//GEN-LAST:event_jbJugarActionPerformed

    private void jPasarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasarTurnoActionPerformed
        modeloQytetet.siguienteJugador();
        this.jbJugar.setEnabled(true);
        //EXMAEN
        this.jEdificarCasa.setEnabled(false);
        //EXMAEN
        this.jComprar.setEnabled(false);
                
        this.vistaQytetet1.actualizar(modeloQytetet);        
    }//GEN-LAST:event_jPasarTurnoActionPerformed

    private void jAplicarSorpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAplicarSorpresaActionPerformed
        
        modeloQytetet.aplicarSorpresa();
        //EXMAEN
        this.jEdificarCasa.setEnabled(false);
         //EXMAEN       
                
        this.vistaQytetet1.actualizar(modeloQytetet); 
    }//GEN-LAST:event_jAplicarSorpresaActionPerformed
    //EXMAEN
    private void jEdificarCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEdificarCasaActionPerformed
        this.jAplicarSorpresa.setEnabled(false);
        
        if(modeloQytetet.edificarCasa(modeloQytetet.getJugadorActual().getCasillaActual()))
            JOptionPane.showMessageDialog(this, "Has construido la casa");
        else
            JOptionPane.showMessageDialog(this, "No has podido construir la casa");
        
        
        this.vistaQytetet1.actualizar(modeloQytetet); 
    }//GEN-LAST:event_jEdificarCasaActionPerformed
    //EXMAEN
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ControladorQytetet controladorQytetet= new ControladorQytetet();
        controladorQytetet.actualizar(Qytetet.getInstance());
        
        
        Dado.createInstance(controladorQytetet);
        CapturaNombreJugadores capturaNombres= new CapturaNombreJugadores(controladorQytetet, true);
        ArrayList<String> nombres= capturaNombres.obtenerNombres();
        Qytetet.getInstance().inicializarJuego(nombres);
        controladorQytetet.vistaQytetet1.actualizar(controladorQytetet.modeloQytetet);
        
        controladorQytetet.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAplicarSorpresa;
    private javax.swing.JButton jComprar;
    private javax.swing.JButton jEdificarCasa;
    private javax.swing.JButton jPasarTurno;
    private javax.swing.JButton jbJugar;
    private javax.swing.JButton jbSalirCarcelDado;
    private javax.swing.JButton jbSalirCarcelPagando;
    private GUIQytetet.VistaQytetet vistaQytetet1;
    // End of variables declaration//GEN-END:variables
}
