
package Vista;

import AccesosDatos.InscripcionData;
import AccesosDatos.MateriaData;
import AccesosDatos.alumnoData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 54266
 */
public class VistaCargaNotas extends javax.swing.JInternalFrame {
    
    private InscripcionData inscriData ;
    private MateriaData mateData;
    private alumnoData aluData;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Materia> listaMate;
    private DefaultTableModel model;
    
    
        
    public VistaCargaNotas() {
        initComponents();
        aluData = new alumnoData();
        alumnos = (ArrayList<Alumno>)aluData.listarAlumnos();
        model = new DefaultTableModel();
        inscriData = new InscripcionData();
        comboAlumno();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_notas = new javax.swing.JTable();
        JB_guar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jcombo_alu = new javax.swing.JComboBox<>();
        jB_mostrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CARGAR NOTAS");

        tabla_notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, ""},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Alumno", "Materia", "Nota"
            }
        ));
        jScrollPane1.setViewportView(tabla_notas);

        JB_guar.setText("GUARDAR");
        JB_guar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_guarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("ALUMNO: ");

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jB_mostrar.setText("MOSTRAR");
        jB_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addComponent(jcombo_alu, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jB_mostrar)
                .addGap(61, 61, 61)
                .addComponent(JB_guar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcombo_alu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_guar)
                    .addComponent(jButton1)
                    .addComponent(jB_mostrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_guarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_guarActionPerformed
      
            
            guardarNota();
   
         
    }//GEN-LAST:event_JB_guarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jB_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_mostrarActionPerformed
        
        cargarMateriasInscriptas ();
    }//GEN-LAST:event_jB_mostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_guar;
    private javax.swing.JButton jB_mostrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Alumno> jcombo_alu;
    private javax.swing.JTable tabla_notas;
    // End of variables declaration//GEN-END:variables

    private void comboAlumno() {
        List<Alumno> alumnos = aluData.listarAlumnos();
        for (Alumno item: alumnos) {
            jcombo_alu.addItem(item);
        }
    }
    
    
    private void guardarNota() {
    int filaSeleccionada = tabla_notas.getSelectedRow();
    if (filaSeleccionada >= 0) {
        Alumno alumnoSeleccionado = (Alumno) jcombo_alu.getSelectedItem();
        Materia materiaSeleccionada = (Materia) tabla_notas.getValueAt(filaSeleccionada, 1); 
        Object notaObj = tabla_notas.getValueAt(filaSeleccionada, 2); 

        try {
            double nota = Double.parseDouble(notaObj.toString());
            inscriData.actualizarNota(alumnoSeleccionado.getIdAlumno(), materiaSeleccionada.getIdMateria(), nota);
            tabla_notas.setValueAt(nota, filaSeleccionada, 2); 
            JOptionPane.showMessageDialog(this, "Nota guardada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese una nota válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor seleccione una fila.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

  
    private void borrarFilasdeTabla () {
        int indice = model.getRowCount() -1;
        for (int i = indice ; i>=0;i--){
            model.removeRow(i);
        }
    }    
    
    private void armarCabecera() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Id Alumno");
        filaCabecera.add("Id Materia");
        filaCabecera.add("Nota");
        for (Object it: filaCabecera) {
        model.addColumn(it);
    }
        tabla_notas.setModel(model);
    }
    
    private void cargarMateriasInscriptas (){
       Alumno selec = (Alumno) jcombo_alu.getSelectedItem();
       List <Inscripcion> lista = inscriData.obtenerInscripcionesPorAlumno(selec.getIdAlumno());
       for (Inscripcion mate : lista){
           model.addRow(new Object [] {mate.getAlumno(),mate.getMateria(),mate.getNota()});
    }    
    }
    
    
} 
