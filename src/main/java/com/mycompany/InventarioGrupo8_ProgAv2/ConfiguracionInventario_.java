/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.InventarioGrupo8_ProgAv2;

import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author estef
 */
public class ConfiguracionInventario_ extends javax.swing.JFrame {

    /**
     * Creates new form ConfiguracionInventario_
     */
    public ConfiguracionInventario_() {
        initComponents();
    }

 public void color(Color col){
    jtxtInventarioC.setBackground(col);
    jtxtMaximoC.setBackground(col);
    jtxtMinimoC.setBackground(col);
    
    jtxtInventarioD.setBackground(col);
    jtxtMaximoD.setBackground(col);
    jtxtMinimoD.setBackground(col);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtMaximoC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtMinimoC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtInventarioC = new javax.swing.JTextField();
        INGRESARCLORO = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtMaximoD = new javax.swing.JTextField();
        jtxtMinimoD = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtInventarioD = new javax.swing.JTextField();
        INGRESARDETERGENTE = new javax.swing.JButton();
        CERRAR = new javax.swing.JButton();

        jButton3.setText("CERRAR");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONFIGURACION DEL INVENTARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLORO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 102)))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cloro.png"))); // NOI18N

        jLabel2.setText("INGRESE EL MAXIMO:");

        jtxtMaximoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtMaximoCMouseClicked(evt);
            }
        });
        jtxtMaximoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtMaximoCKeyTyped(evt);
            }
        });

        jLabel5.setText("INGRESE EL MINIMO:");

        jtxtMinimoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtMinimoCMouseClicked(evt);
            }
        });
        jtxtMinimoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtMinimoCKeyTyped(evt);
            }
        });

        jLabel8.setText("INGRESE EL INVENTARIO INICIAL:");

        jtxtInventarioC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtInventarioCMouseClicked(evt);
            }
        });
        jtxtInventarioC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtInventarioCKeyTyped(evt);
            }
        });

        INGRESARCLORO.setText("INGRESAR");
        INGRESARCLORO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARCLOROActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtMinimoC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtMaximoC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtInventarioC, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(INGRESARCLORO)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtxtInventarioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtMaximoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtMinimoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(INGRESARCLORO)
                .addGap(27, 27, 27))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETERGENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 102)))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/detergente.png"))); // NOI18N

        jLabel6.setText("INGRESE EL MAXIMO:");

        jLabel7.setText("INGRESE EL MINIMO:");

        jtxtMaximoD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtMaximoDMouseClicked(evt);
            }
        });
        jtxtMaximoD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtMaximoDKeyTyped(evt);
            }
        });

        jtxtMinimoD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtMinimoDMouseClicked(evt);
            }
        });
        jtxtMinimoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMinimoDActionPerformed(evt);
            }
        });
        jtxtMinimoD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtMinimoDKeyTyped(evt);
            }
        });

        jLabel9.setText("INGRESE EL INVENTARIO INICIAL:");

        jtxtInventarioD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtInventarioDMouseClicked(evt);
            }
        });
        jtxtInventarioD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtInventarioDKeyTyped(evt);
            }
        });

        INGRESARDETERGENTE.setText("INGRESAR");
        INGRESARDETERGENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARDETERGENTEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtInventarioD, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtMaximoD, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtMinimoD, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(INGRESARDETERGENTE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtxtInventarioD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtMaximoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtMinimoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(INGRESARDETERGENTE)
                .addGap(29, 29, 29))
        );

        CERRAR.setText("CERRAR");
        CERRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CERRARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CERRAR)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CERRAR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CERRARActionPerformed
        this.dispose();
    }//GEN-LAST:event_CERRARActionPerformed

    private void INGRESARCLOROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARCLOROActionPerformed
         if (jtxtInventarioC.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "No puede dejar campos vacíos.");
            jtxtInventarioC.setBackground(Color.red);
        }
        else{
         if (jtxtMaximoC.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "No puede dejar campos vacíos.");
            jtxtMaximoC.setBackground(Color.red);
        }
        else {
        if (jtxtMinimoC.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "No puede dejar campos vacíos.");
            jtxtMinimoC.setBackground(Color.red);
        }
    }
  }

    }//GEN-LAST:event_INGRESARCLOROActionPerformed

    private void jtxtMinimoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMinimoDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMinimoDActionPerformed

    private void jtxtInventarioCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtInventarioCMouseClicked
        color(Color.WHITE);
    }//GEN-LAST:event_jtxtInventarioCMouseClicked

    private void jtxtMaximoCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtMaximoCMouseClicked
        color(Color.WHITE);
    }//GEN-LAST:event_jtxtMaximoCMouseClicked

    private void jtxtMinimoCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtMinimoCMouseClicked
        color(Color.WHITE);
    }//GEN-LAST:event_jtxtMinimoCMouseClicked

    private void jtxtInventarioDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtInventarioDMouseClicked
        color(Color.WHITE);
    }//GEN-LAST:event_jtxtInventarioDMouseClicked

    private void jtxtMaximoDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtMaximoDMouseClicked
        color(Color.WHITE);
    }//GEN-LAST:event_jtxtMaximoDMouseClicked

    private void jtxtMinimoDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtMinimoDMouseClicked
        color(Color.WHITE);
    }//GEN-LAST:event_jtxtMinimoDMouseClicked

    private void jtxtInventarioCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtInventarioCKeyTyped
        char x = evt.getKeyChar();
        if (!Character.isLetter(x) && (x < '0' || x > '9') || !(x < 'a' || x > 'z')) {
            evt.consume();
        }
        int limite = 8;
        {
            if (jtxtInventarioC.getText().length() == limite) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jtxtInventarioCKeyTyped
    
    private void jtxtMaximoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtMaximoCKeyTyped
         char x = evt.getKeyChar();
        if (!Character.isLetter(x) && (x < '0' || x > '9') || !(x < 'a' || x > 'z')) {
            evt.consume();
        }
        int limite = 8;
        {
            if (jtxtMaximoC.getText().length() == limite) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jtxtMaximoCKeyTyped

    private void jtxtMinimoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtMinimoCKeyTyped
         char x = evt.getKeyChar();
        if (!Character.isLetter(x) && (x < '0' || x > '9') || !(x < 'a' || x > 'z')) {
            evt.consume();
        }
        int limite = 8;
        {
            if (jtxtMinimoC.getText().length() == limite) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jtxtMinimoCKeyTyped

    private void jtxtInventarioDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtInventarioDKeyTyped
         char x = evt.getKeyChar();
        if (!Character.isLetter(x) && (x < '0' || x > '9') || !(x < 'a' || x > 'z')) {
            evt.consume();
        }
        int limite = 8;
        {
            if (jtxtInventarioD.getText().length() == limite) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jtxtInventarioDKeyTyped

    private void jtxtMaximoDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtMaximoDKeyTyped
         char x = evt.getKeyChar();
        if (!Character.isLetter(x) && (x < '0' || x > '9') || !(x < 'a' || x > 'z')) {
            evt.consume();
        }
        int limite = 8;
        {
            if (jtxtMaximoD.getText().length() == limite) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jtxtMaximoDKeyTyped

    private void jtxtMinimoDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtMinimoDKeyTyped
         char x = evt.getKeyChar();
        if (!Character.isLetter(x) && (x < '0' )) {
            evt.consume();
        }
        int limite = 8;
        {
            if (jtxtMinimoD.getText().length() == limite) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jtxtMinimoDKeyTyped

    private void INGRESARDETERGENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARDETERGENTEActionPerformed
         if (jtxtInventarioD.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "No puede dejar campos vacíos.");
            jtxtInventarioD.setBackground(Color.red);
        }
        else{
         if (jtxtMaximoD.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "No puede dejar campos vacíos.");
            jtxtMaximoD.setBackground(Color.red);
        }
        else {
        if (jtxtMinimoD.getText().isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "No puede dejar campos vacíos.");
            jtxtMinimoD.setBackground(Color.red);
        }
    }
  }
    }//GEN-LAST:event_INGRESARDETERGENTEActionPerformed

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
            java.util.logging.Logger.getLogger(ConfiguracionInventario_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionInventario_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionInventario_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionInventario_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiguracionInventario_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CERRAR;
    private javax.swing.JButton INGRESARCLORO;
    private javax.swing.JButton INGRESARDETERGENTE;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jtxtInventarioC;
    private javax.swing.JTextField jtxtInventarioD;
    private javax.swing.JTextField jtxtMaximoC;
    private javax.swing.JTextField jtxtMaximoD;
    private javax.swing.JTextField jtxtMinimoC;
    private javax.swing.JTextField jtxtMinimoD;
    // End of variables declaration//GEN-END:variables

   

   
}
