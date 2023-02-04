/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.InventarioGrupo8_ProgAv2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kely Villalta // Oscar Marcía
 */
public class InventarioSalida extends javax.swing.JFrame
{
    EstablecerCampos establecerCampos = new EstablecerCampos();
    
    //Variables de creación de producto.
    int dato1_cloro = establecerCampos.getCloro();
    int dato2_detergente = establecerCampos.getDetergente();
    
    //Controlador aritmético para la resta de valores.
    int retiro;
    
    //Controlador de respuesta del JOptionPane
    int respuesta;
    
    //Variables de control de mínimo para Cloro.
    int minimoC = establecerCampos.getCloroMin();
    
    //Variables de control de mínimo para Detergente.
    int minimoD = establecerCampos.getDetergenteMin();
    
    public void cargarTabla()
    {
        Object[] fila = {dato1_cloro, dato2_detergente};
        DefaultTableModel tablaValores = (DefaultTableModel) jTable2.getModel();
        
        tablaValores.addRow(fila);
    }
    
    public InventarioSalida() 
    {
        initComponents();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtxtRetirar = new javax.swing.JTextField();
        jbtnRetirarCloro = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtRetirar1 = new javax.swing.JTextField();
        jbtnRetirarDetergente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Salida de Inventario");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/letra-x.png"))); // NOI18N
        jButton3.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jLabel4)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Salida de Inventario");
        setMinimumSize(new java.awt.Dimension(600, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Retirar Cloro");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 80, 146, 28);

        jtxtRetirar.setBackground(new java.awt.Color(51, 204, 0));
        jtxtRetirar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtxtRetirar.setForeground(new java.awt.Color(0, 0, 0));
        jtxtRetirar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jtxtRetirar);
        jtxtRetirar.setBounds(37, 129, 156, 20);

        jbtnRetirarCloro.setBackground(new java.awt.Color(0, 102, 153));
        jbtnRetirarCloro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnRetirarCloro.setText("Retirar");
        jbtnRetirarCloro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRetirarCloroActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRetirarCloro);
        jbtnRetirarCloro.setBounds(79, 178, 73, 41);

        jPanel4.setBackground(new java.awt.Color(0, 102, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salida de Inventario");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel5)
                .addContainerGap(536, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 943, 56);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Retirar Detergente");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(299, 83, 207, 28);

        jtxtRetirar1.setBackground(new java.awt.Color(51, 204, 0));
        jtxtRetirar1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtxtRetirar1.setForeground(new java.awt.Color(0, 0, 0));
        jtxtRetirar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jtxtRetirar1);
        jtxtRetirar1.setBounds(324, 129, 156, 20);

        jbtnRetirarDetergente.setBackground(new java.awt.Color(0, 102, 153));
        jbtnRetirarDetergente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnRetirarDetergente.setText("Retirar");
        jbtnRetirarDetergente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRetirarDetergenteActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRetirarDetergente);
        jbtnRetirarDetergente.setBounds(366, 178, 73, 41);

        jSeparator1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 254, 588, 10);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 590, 290);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cloro", "Detergente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setColumnSelectionAllowed(true);
        jTable2.setDragEnabled(true);
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 290, 590, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRetirarCloroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRetirarCloroActionPerformed
        
        if (dato1_cloro <= minimoC)
        {
            respuesta = JOptionPane.showConfirmDialog(null, "Se encuentran pocas existencias del producto. Desea continuar?", "Alerta", JOptionPane.YES_NO_OPTION);
            
            if (respuesta == JOptionPane.YES_OPTION)
            {
                retiro = Integer.parseInt(jtxtRetirar.getText());
                dato1_cloro = dato1_cloro - retiro;
                establecerCampos.setCloro(dato1_cloro);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Operacion cancelada exitosamente.", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else
        {
            retiro = Integer.parseInt(jtxtRetirar.getText());
            dato1_cloro = dato1_cloro - retiro;
            establecerCampos.setCloro(dato1_cloro);
        }
        

        
        cargarTabla();
    }//GEN-LAST:event_jbtnRetirarCloroActionPerformed

    private void jbtnRetirarDetergenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRetirarDetergenteActionPerformed
        // TODO add your handling code here:
        
        if (dato2_detergente <= minimoD)
        {
            respuesta = JOptionPane.showConfirmDialog(null, "Se encuentran pocas existencias del producto. Desea continuar?", "Alerta", JOptionPane.YES_NO_OPTION);
            
            if (respuesta == JOptionPane.YES_OPTION)
            {
                retiro = Integer.parseInt(jtxtRetirar1.getText());
                dato2_detergente = dato2_detergente - retiro;
                establecerCampos.setDetergente(dato2_detergente);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Operacion cancelada exitosamente.", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else
        {
            retiro = Integer.parseInt(jtxtRetirar1.getText());
            dato2_detergente = dato2_detergente - retiro;
            establecerCampos.setDetergente(dato2_detergente);
        }

        
        cargarTabla();
    }//GEN-LAST:event_jbtnRetirarDetergenteActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(InventarioSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioSalida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable jTable2;
    private javax.swing.JButton jbtnRetirarCloro;
    private javax.swing.JButton jbtnRetirarDetergente;
    private javax.swing.JTextField jtxtRetirar;
    private javax.swing.JTextField jtxtRetirar1;
    // End of variables declaration//GEN-END:variables
}
