/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Prueba1;

import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Agregar extends javax.swing.JFrame {

    /**
     * Creates new form Agregar
     */
    public Agregar() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codigoField = new javax.swing.JTextField();
        tipoField = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Goudy Stout", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 780, -1));

        jLabel2.setText("Codigo: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jLabel3.setText("Tipo: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));
        getContentPane().add(codigoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 220, -1));
        getContentPane().add(tipoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 220, -1));

        aceptar.setText("aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));

        cancelar.setText("cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabel4.setText("Nombre: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));
        getContentPane().add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 220, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        String codigoTexto = codigoField.getText();
        int codigo = Integer.parseInt(codigoTexto);
        String tipo=tipoField.getText();
        String nombre=nombreField.getText();
        
        
        BlockBuster blockBuster = new BlockBuster();
        
        blockBuster.agregarItem(codigo, nombre, tipo);
    JOptionPane.showMessageDialog(null, "Listo Completado");
    Main main=new Main();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_aceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        Main main=new Main();
        main.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField codigoField;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTextField tipoField;
    // End of variables declaration//GEN-END:variables
}