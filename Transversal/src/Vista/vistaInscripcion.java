
package Vista;

import AccesosDatos.InscripcionData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class vistaInscripcion extends javax.swing.JInternalFrame {
     private InscripcionData inscriData = new InscripcionData();
     private Inscripcion inscriActual = null;
     private List<Alumno> alumnos = new ArrayList<>();
     private List<Materia> materias = new ArrayList<>();
  
    public vistaInscripcion() {
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbTitulo = new javax.swing.JLabel();
        jlbSeleccione = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        comboMateria = new javax.swing.JComboBox<>();
        jlbListado = new javax.swing.JLabel();
        jrbInscripta = new javax.swing.JRadioButton();
        jrbNoinscripto = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbMostaralumnos = new javax.swing.JTable();
        jbnInsertar = new javax.swing.JButton();
        jbnAnularinscripcion = new javax.swing.JButton();
        jbnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboAlumno = new javax.swing.JComboBox<>();

        jlbTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlbTitulo.setText("Formulario de Inscripcion");

        jlbSeleccione.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbSeleccione.setText("Seleccione un Alumno:");

        comboMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMateriaActionPerformed(evt);
            }
        });

        jlbListado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlbListado.setText("Listado de Materias");

        jrbInscripta.setText(" Materias Inscriptas");
        jrbInscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptaActionPerformed(evt);
            }
        });

        jrbNoinscripto.setText("Materias No Inscriptas");

        jtbMostaralumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbMostaralumnos);

        jbnInsertar.setText("Inscribir");
        jbnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnInsertarActionPerformed(evt);
            }
        });

        jbnAnularinscripcion.setText("Anular Inscripción");

        jbnSalir.setText("Salir");
        jbnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Seleccione una Materia:");

        comboAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jlbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlbSeleccione, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(comboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(comboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jrbInscripta)
                        .addGap(55, 55, 55)
                        .addComponent(jrbNoinscripto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jlbListado, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jbnInsertar)
                        .addGap(48, 48, 48)
                        .addComponent(jbnAnularinscripcion)
                        .addGap(36, 36, 36)
                        .addComponent(jbnSalir)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlbTitulo)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jlbSeleccione))
                    .addComponent(comboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(comboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbInscripta)
                    .addComponent(jrbNoinscripto))
                .addGap(9, 9, 9)
                .addComponent(jlbListado)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbnInsertar)
                    .addComponent(jbnAnularinscripcion)
                    .addComponent(jbnSalir))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbInscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbInscriptaActionPerformed

    private void jbnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSalirActionPerformed
        this.dispose();    
    }//GEN-LAST:event_jbnSalirActionPerformed

    private void jbnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnInsertarActionPerformed
       
    }//GEN-LAST:event_jbnInsertarActionPerformed

    private void comboAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAlumnoActionPerformed
        
    }//GEN-LAST:event_comboAlumnoActionPerformed

    private void comboMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboAlumno;
    private javax.swing.JComboBox<String> comboMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbnAnularinscripcion;
    private javax.swing.JButton jbnInsertar;
    private javax.swing.JButton jbnSalir;
    private javax.swing.JLabel jlbListado;
    private javax.swing.JLabel jlbSeleccione;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JRadioButton jrbInscripta;
    private javax.swing.JRadioButton jrbNoinscripto;
    private javax.swing.JTable jtbMostaralumnos;
    // End of variables declaration//GEN-END:variables
}
