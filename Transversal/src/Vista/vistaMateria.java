/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import AccesosDatos.MateriaData;
import Entidades.Materia;
import javax.swing.JOptionPane;

/**
 *
 * @author deborahhhh
 */
public class vistaMateria extends javax.swing.JInternalFrame {
private MateriaData materData = new MateriaData();
private Materia materActual = null;

   
    public vistaMateria() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFcodigo = new javax.swing.JTextField();
        JTFnombre = new javax.swing.JTextField();
        JTFaño = new javax.swing.JTextField();
        JRBestado = new javax.swing.JRadioButton();
        JBbuscar = new javax.swing.JButton();
        JBeliminar = new javax.swing.JButton();
        JBnuevo = new javax.swing.JButton();
        JBguardar = new javax.swing.JButton();
        JBsalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Materia");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Año:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Estado:");

        JTFaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFañoActionPerformed(evt);
            }
        });

        JRBestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBestadoActionPerformed(evt);
            }
        });

        JBbuscar.setText("Buscar");
        JBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarActionPerformed(evt);
            }
        });

        JBeliminar.setText("Eliminar");

        JBnuevo.setText("Nuevo");
        JBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnuevoActionPerformed(evt);
            }
        });

        JBguardar.setText("Guardar");
        JBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBguardarActionPerformed(evt);
            }
        });

        JBsalir.setText("Salir");
        JBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JBnuevo)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBeliminar)
                                .addGap(26, 26, 26)
                                .addComponent(JBguardar)
                                .addGap(35, 35, 35)
                                .addComponent(JBsalir))
                            .addComponent(JRBestado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTFcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(JBbuscar))
                            .addComponent(JTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFaño, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBbuscar))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JRBestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBnuevo)
                    .addComponent(JBeliminar)
                    .addComponent(JBguardar)
                    .addComponent(JBsalir))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JRBestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBestadoActionPerformed

    private void JTFañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFañoActionPerformed

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed
       
        try{
        Integer idMateria = Integer.parseInt(JTFcodigo.getText());
        materActual = materData.buscarMateria(idMateria);
        if (materActual!= null){
            JTFnombre.setText(materActual.getNombre());
            JTFaño.setText(String.valueOf(materActual.getAño()));
            JRBestado.setSelected(materActual.isEstado());
        }
        
        }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this,"ingresar numero valido");
            
        
        
        } 
    }//GEN-LAST:event_JBbuscarActionPerformed

    private void JBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalirActionPerformed
        dispose();
        
        
        
    }//GEN-LAST:event_JBsalirActionPerformed

    private void JBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBnuevoActionPerformed
        limpiarCampos();
        materActual=null;
    }//GEN-LAST:event_JBnuevoActionPerformed

    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
     
        try{
        Integer idMateria = Integer.parseInt(JTFcodigo.getText());
        String nombre = JTFnombre.getText();
        Integer año = Integer.parseInt(JTFaño.getText());
        boolean estado = JRBestado.isSelected();
        if(materActual==null){
        materActual = new Materia(idMateria,nombre , año, estado);
        materData.guardarMateria(materActual);
       

        }else{
        materActual.setIdMateria(idMateria);
        materActual.setNombre(nombre);
        materActual.setAño(año);
        materData.modificarMateria(materActual);
       
        }
     
              
      
        }catch(NumberFormatException guar){
        JOptionPane.showMessageDialog(this,"Ingresar id valido");
        }
    }//GEN-LAST:event_JBguardarActionPerformed

     private void limpiarCampos(){
    JTFcodigo.setText("");
    JTFnombre.setText("");
    JTFaño.setText("");
    JRBestado.setSelected(true);
    }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton JBeliminar;
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBnuevo;
    private javax.swing.JButton JBsalir;
    private javax.swing.JRadioButton JRBestado;
    private javax.swing.JTextField JTFaño;
    private javax.swing.JTextField JTFcodigo;
    private javax.swing.JTextField JTFnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
