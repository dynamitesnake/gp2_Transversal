
package Vista;

import AccesosDatos.InscripcionData;
import AccesosDatos.MateriaData;
import AccesosDatos.alumnoData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class vistaListarInscripciones extends javax.swing.JInternalFrame {
    private InscripcionData inscriData ;
     private MateriaData mData;
     private alumnoData aData;
     private ArrayList<Alumno> listaAlu;
     private ArrayList<Materia> listaMate;
     private DefaultTableModel modelo;

    
    public vistaListarInscripciones() {
        initComponents();
        aData = new alumnoData();
        listaAlu = (ArrayList<Alumno>)aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscriData = new InscripcionData();
       comboAlumno();
       armarCabeceraTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbSeleccion = new javax.swing.JLabel();
        comboListaalumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbMostaralumnos = new javax.swing.JTable();
        jlbTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jlbSeleccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbSeleccion.setText("Seleccion de alumno:");

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

        jlbTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlbTitulo.setText("Listado de Inscripciones");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Inscripciones del alumno seleccionado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlbTitulo)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(87, 87, 87))))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jlbSeleccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboListaalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlbTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbSeleccion)
                    .addComponent(comboListaalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> comboListaalumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbSeleccion;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JTable jtbMostaralumnos;
    // End of variables declaration//GEN-END:variables

    private void comboAlumno() {
        for (Alumno item : listaAlu) {
            comboListaalumnos.addItem(item);
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
        jtbMostaralumnos.setModel(modelo);
    }
    private void borrarFilasdeTabla () {
        int indice = modelo.getRowCount() -1;
        for (int i = indice ; i>=0;i--){
            modelo.removeRow(i);
        }
    }
private void cargarMateriasInscriptas (){
        Alumno selec = (Alumno) comboListaalumnos.getSelectedItem();
       List <Materia> lista = inscriData.obtenerMateriasCursadas(selec.getIdAlumno());
       for (Materia m : lista){
           modelo.addRow(new Object [] {m.getIdMateria(),m.getNombreMateria(),m.getAño()});
    }    
    }
}
