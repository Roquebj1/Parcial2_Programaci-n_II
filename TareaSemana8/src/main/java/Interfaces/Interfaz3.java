/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import datos.ClsVendedorJDBC;
import dominio.ClsVendedores;
import java.util.List;

/**
 *
 * @author HP
 */
public class Interfaz3 extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz3
     */
    public Interfaz3() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtNom = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEnero = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtFebrero = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMarzo = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextPane();
        butUpdate = new javax.swing.JButton();
        butReturn = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblEnero = new javax.swing.JLabel();
        lblFebrero = new javax.swing.JLabel();
        lblMarzo = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(txtNom);

        jScrollPane2.setViewportView(txtEnero);

        jScrollPane3.setViewportView(txtFebrero);

        jScrollPane4.setViewportView(txtMarzo);

        jScrollPane5.setViewportView(txtCodigo);

        butUpdate.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        butUpdate.setForeground(new java.awt.Color(0, 255, 204));
        butUpdate.setText("ACTUALIZAR");
        butUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUpdateActionPerformed(evt);
            }
        });

        butReturn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        butReturn.setForeground(new java.awt.Color(0, 255, 204));
        butReturn.setText("REGRESAR");
        butReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butReturnActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Stencil", 2, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 204, 0));
        lblNombre.setText("NOMBRE");

        lblEnero.setFont(new java.awt.Font("Stencil", 2, 12)); // NOI18N
        lblEnero.setForeground(new java.awt.Color(0, 204, 0));
        lblEnero.setText("ENERO");

        lblFebrero.setFont(new java.awt.Font("Stencil", 2, 12)); // NOI18N
        lblFebrero.setForeground(new java.awt.Color(0, 204, 0));
        lblFebrero.setText("FEBRERO");

        lblMarzo.setFont(new java.awt.Font("Stencil", 2, 12)); // NOI18N
        lblMarzo.setForeground(new java.awt.Color(0, 204, 0));
        lblMarzo.setText("MARZO");

        lblCode.setFont(new java.awt.Font("Stencil", 2, 12)); // NOI18N
        lblCode.setForeground(new java.awt.Color(0, 204, 0));
        lblCode.setText("CÓDIGO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("ACTUALIZAR REGISTRO DEL TRABAJADOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(butUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(lblEnero, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblFebrero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(lblMarzo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCode, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane5))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblEnero)
                    .addComponent(lblFebrero)
                    .addComponent(lblMarzo)
                    .addComponent(lblCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butReturn, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(butUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUpdateActionPerformed
     
        ClsVendedorJDBC vendedorJDBC = new ClsVendedorJDBC();
        ClsVendedores update = new ClsVendedores();
        update.setNombre(txtNom.getText());
        update.setEnero(Integer.parseInt(txtEnero.getText()));
        update.setFebrero(Integer.parseInt(txtFebrero.getText()));
        update.setMarzo(Integer.parseInt(txtMarzo.getText()));
        update.setCodigo(Integer.parseInt(txtCodigo.getText()));
        vendedorJDBC.update(update);
        List<ClsVendedores> todos = vendedorJDBC.seleccion();
        for (ClsVendedores vendedor : todos) {
            System.out.println("vendedor = " + vendedor);
    }                                            
    }//GEN-LAST:event_butUpdateActionPerformed

    private void butReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butReturnActionPerformed
     setVisible(false);
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true); 
    }//GEN-LAST:event_butReturnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butReturn;
    private javax.swing.JButton butUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblEnero;
    private javax.swing.JLabel lblFebrero;
    private javax.swing.JLabel lblMarzo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextPane txtCodigo;
    private javax.swing.JTextPane txtEnero;
    private javax.swing.JTextPane txtFebrero;
    private javax.swing.JTextPane txtMarzo;
    private javax.swing.JTextPane txtNom;
    // End of variables declaration//GEN-END:variables
}
