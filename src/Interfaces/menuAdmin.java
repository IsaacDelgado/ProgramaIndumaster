/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

/**
 *
 * @author Isaac
 */
public class menuAdmin extends javax.swing.JInternalFrame {

    /**
     * Creates new form menuAdmin
     */
    public menuAdmin() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnProductoIrA = new javax.swing.JButton();
        btnRegresarIr = new javax.swing.JButton();
        btnEmpleadoIrA = new javax.swing.JButton();

        setBackground(java.awt.Color.black);

        jPanel1.setBackground(new java.awt.Color(54, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/indumasterMenu.jpg"))); // NOI18N

        btnProductoIrA.setText("Producto");
        btnProductoIrA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoIrAActionPerformed(evt);
            }
        });

        btnRegresarIr.setText("Regresar");
        btnRegresarIr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarIrActionPerformed(evt);
            }
        });

        btnEmpleadoIrA.setText("Empleado");
        btnEmpleadoIrA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoIrAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegresarIr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductoIrA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmpleadoIrA, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(113, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnEmpleadoIrA)
                .addGap(39, 39, 39)
                .addComponent(btnProductoIrA)
                .addGap(48, 48, 48)
                .addComponent(btnRegresarIr)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpleadoIrAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoIrAActionPerformed
        // TODO add your handling code here:
        registroEmpleado llamar=new registroEmpleado();
        menu.jDPEscritorio.add(llamar);
        llamar.toFront();
        llamar.setVisible(true);
    }//GEN-LAST:event_btnEmpleadoIrAActionPerformed

    private void btnProductoIrAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoIrAActionPerformed
        // TODO add your handling code here:
        Producto llamar=new Producto();
        menu.jDPEscritorio.add(llamar);
        llamar.toFront();
        llamar.setVisible(true);
    }//GEN-LAST:event_btnProductoIrAActionPerformed

    private void btnRegresarIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarIrActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnRegresarIrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpleadoIrA;
    private javax.swing.JButton btnProductoIrA;
    private javax.swing.JButton btnRegresarIr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
