
package Vista;

import AccesosDatos.InscripcionData;
import Entidades.Inscripcion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 54266
 */
public class VistaCargaNotas extends javax.swing.JInternalFrame {

    private InscripcionData inscriData = new InscripcionData();
    private Inscripcion inscripcion = null;
    private List<Inscripcion> inscri = new ArrayList<>();
    
    public VistaCargaNotas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_notas = new javax.swing.JTable();
        JB_guar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CARGAR NOTAS");

        jT_notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Alumno", "Materia", "Nota"
            }
        ));
        jScrollPane1.setViewportView(jT_notas);

        JB_guar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        JB_guar.setIcon(new javax.swing.ImageIcon("C:\\Users\\54266\\Downloads\\iconos_netbeans\\iconos netbeans\\icons8-guardar-64.png")); // NOI18N
        JB_guar.setText("GUARDAR");
        JB_guar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_guarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(JB_guar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(JB_guar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_guarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_guarActionPerformed
        
       JB_guar.addActionListener(e -> cargarNotas());
    }//GEN-LAST:event_JB_guarActionPerformed

    private void cargarNotas() {
        int rowCount = jT_notas.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        try {
            String apellido = jT_notas.getValueAt(i, 0).toString();
            String nombreMateria = jT_notas.getValueAt(i, 1).toString();
            double nota = Double.parseDouble(jT_notas.getValueAt(i, 2).toString());
            
            System.out.println("Nota " + nota + " para el alumno " + apellido + " en la materia " + nombreMateria);
        
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(this, "Error en el formato de los datos en la fila " + (i + 1));
        }
    }
            JOptionPane.showMessageDialog(this, "Notas guardadas exitosamente.");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_guar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_notas;
    // End of variables declaration//GEN-END:variables
}
