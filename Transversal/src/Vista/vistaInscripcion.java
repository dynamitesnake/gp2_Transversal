
package Vista;

import AccesosDatos.InscripcionData;
import AccesosDatos.MateriaData;
import AccesosDatos.alumnoData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class vistaInscripcion extends javax.swing.JInternalFrame {
     private InscripcionData inscriData ;
     private MateriaData mData;
     private alumnoData aData;
     private ArrayList<Alumno> listaA;
     private ArrayList<Materia> listaM;
     private DefaultTableModel modelo;
     
  
    public vistaInscripcion() {
        initComponents();
        aData = new alumnoData();
        listaA = (ArrayList<Alumno>)aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscriData = new InscripcionData();
       comboAlumno();
       armarCabeceraTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbTitulo = new javax.swing.JLabel();
        jlbSeleccione = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlbListado = new javax.swing.JLabel();
        jrbInscripta = new javax.swing.JRadioButton();
        jrbNoinscripto = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbMostar = new javax.swing.JTable();
        jbnInscribir = new javax.swing.JButton();
        jbnAnularinscripcion = new javax.swing.JButton();
        jbnSalir = new javax.swing.JButton();
        comboAlumno = new javax.swing.JComboBox<>();

        jlbTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlbTitulo.setText("Formulario de Inscripcion");

        jlbSeleccione.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbSeleccione.setText("Seleccione un Alumno:");

        jlbListado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlbListado.setText("Listado de Materias");

        jrbInscripta.setText(" Materias Inscriptas");
        jrbInscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptaActionPerformed(evt);
            }
        });

        jrbNoinscripto.setText("Materias No Inscriptas");
        jrbNoinscripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoinscriptoActionPerformed(evt);
            }
        });

        jtbMostar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtbMostar);

        jbnInscribir.setText("Inscribir");
        jbnInscribir.setEnabled(false);
        jbnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnInscribirActionPerformed(evt);
            }
        });

        jbnAnularinscripcion.setText("Anular Inscripción");
        jbnAnularinscripcion.setEnabled(false);
        jbnAnularinscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnAnularinscripcionActionPerformed(evt);
            }
        });

        jbnSalir.setText("Salir");
        jbnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSalirActionPerformed(evt);
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
                        .addGap(120, 120, 120)
                        .addComponent(jlbListado, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jbnInscribir)
                        .addGap(48, 48, 48)
                        .addComponent(jbnAnularinscripcion)
                        .addGap(36, 36, 36)
                        .addComponent(jbnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbSeleccione, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jrbInscripta)
                        .addGap(55, 55, 55)
                        .addComponent(jrbNoinscripto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(comboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlbTitulo)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbSeleccione)
                    .addComponent(comboAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbInscripta)
                    .addComponent(jrbNoinscripto))
                .addGap(9, 9, 9)
                .addComponent(jlbListado)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbnInscribir)
                    .addComponent(jbnAnularinscripcion)
                    .addComponent(jbnSalir))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbInscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptaActionPerformed
        borrarFilasdeTabla();
        jrbNoinscripto.setSelected(false);
        cargarMateriasInscriptas();
        jbnAnularinscripcion.setEnabled(true);
        jbnInscribir.setEnabled(false);
    }//GEN-LAST:event_jrbInscriptaActionPerformed

    private void jbnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSalirActionPerformed
        this.dispose();    
    }//GEN-LAST:event_jbnSalirActionPerformed

    private void jbnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnInscribirActionPerformed
    int filaSeleccionada = jtbMostar.getSelectedRow();
    if (filaSeleccionada != -1) {
     Alumno a = (Alumno) comboAlumno.getSelectedItem();
     int IdMateria =(Integer) modelo.getValueAt(filaSeleccionada, 0);
     String nombreMateria = (String)modelo.getValueAt(filaSeleccionada, 1);
     int año = (Integer) modelo.getValueAt(filaSeleccionada, 2);  
     Materia m = new Materia (IdMateria,nombreMateria, año, true);
     
     Inscripcion i = new Inscripcion (a,m,0);
     inscriData.guardarInscripcion(i);
     borrarFilasdeTabla();
     
    }
    }//GEN-LAST:event_jbnInscribirActionPerformed

    private void jrbNoinscriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoinscriptoActionPerformed
        borrarFilasdeTabla ();
        jrbInscripta.setSelected(false);
        cargarMateriasnoInscriptas();
        jbnAnularinscripcion.setEnabled(false);
        jbnInscribir.setEnabled(true);
    }//GEN-LAST:event_jrbNoinscriptoActionPerformed

    private void jbnAnularinscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnAnularinscripcionActionPerformed
        int filaSeleccionada = jtbMostar.getSelectedRow();
        if (filaSeleccionada != -1){
        Alumno a = (Alumno) comboAlumno.getSelectedItem(); 
        int IdMateria =(Integer) modelo.getValueAt(filaSeleccionada, 0);
        inscriData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), IdMateria);
        borrarFilasdeTabla ();
        }
    }//GEN-LAST:event_jbnAnularinscripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> comboAlumno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbnAnularinscripcion;
    private javax.swing.JButton jbnInscribir;
    private javax.swing.JButton jbnSalir;
    private javax.swing.JLabel jlbListado;
    private javax.swing.JLabel jlbSeleccione;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JRadioButton jrbInscripta;
    private javax.swing.JRadioButton jrbNoinscripto;
    private javax.swing.JTable jtbMostar;
    // End of variables declaration//GEN-END:variables

   

    private void comboAlumno() {
        for (Alumno item: listaA) {
            comboAlumno.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");
        for (Object it: filaCabecera) {
        modelo.addColumn(it);
    }
        jtbMostar.setModel(modelo);
    }
    private void borrarFilasdeTabla () {
        int indice = modelo.getRowCount() -1;
        for (int i = indice ; i>=0;i--){
            modelo.removeRow(i);
        }
    }    
    
    private void cargarMateriasnoInscriptas (){
       Alumno selec = (Alumno) comboAlumno.getSelectedItem();
       listaM = (ArrayList) inscriData.obtenerMateriasNoCursadas(selec.getIdAlumno());
       for (Materia m : listaM){
           modelo.addRow(new Object [] {m.getIdMateria(),m.getNombreMateria(),m.getAño()});
       }
    
    }    private void cargarMateriasInscriptas (){
        Alumno selec = (Alumno) comboAlumno.getSelectedItem();
       List <Materia> lista = inscriData.obtenerMateriasCursadas(selec.getIdAlumno());
       for (Materia m : lista){
           modelo.addRow(new Object [] {m.getIdMateria(),m.getNombreMateria(),m.getAño()});
    }
}
}