/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author 54266
 */
public class Escritorio extends javax.swing.JFrame {

    /**
     * Creates new form Escritorio
     */
    public Escritorio() {
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

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMalu = new javax.swing.JMenu();
        JMIformalu = new javax.swing.JMenuItem();
        JMmaterias = new javax.swing.JMenu();
        JMIformMate = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMImanejoInscripciones = new javax.swing.JMenuItem();
        jMImanipulacionNotas = new javax.swing.JMenuItem();
        JMconsulta = new javax.swing.JMenu();
        jMIalumnosPorMateria = new javax.swing.JMenuItem();
        JMsalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        JMalu.setText("Alumno");

        JMIformalu.setText("Formulario de Alumno");
        JMIformalu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIformaluActionPerformed(evt);
            }
        });
        JMalu.add(JMIformalu);

        jMenuBar1.add(JMalu);

        JMmaterias.setText("Materia");

        JMIformMate.setText("Formulario de Materia");
        JMIformMate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIformMateActionPerformed(evt);
            }
        });
        JMmaterias.add(JMIformMate);

        jMenuBar1.add(JMmaterias);

        jMenu1.setText("Administración");

        jMImanejoInscripciones.setText("Manejo de Inscripciones");
        jMenu1.add(jMImanejoInscripciones);

        jMImanipulacionNotas.setText("Manipulacion de notas");
        jMenu1.add(jMImanipulacionNotas);

        jMenuBar1.add(jMenu1);

        JMconsulta.setText("Consultas");

        jMIalumnosPorMateria.setText("Alumnos por Materia");
        JMconsulta.add(jMIalumnosPorMateria);

        jMenuBar1.add(JMconsulta);

        JMsalir.setText("Salir");
        jMenuBar1.add(JMsalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMIformaluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIformaluActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaAlumno alumno = new vistaAlumno();
        alumno.setVisible(true);
        Escritorio.add(alumno);
    }//GEN-LAST:event_JMIformaluActionPerformed

    private void JMIformMateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIformMateActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        vistaMateria mater = new vistaMateria();
        mater.setVisible(true);
        Escritorio.add(mater);
    }//GEN-LAST:event_JMIformMateActionPerformed

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
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem JMIformMate;
    private javax.swing.JMenuItem JMIformalu;
    private javax.swing.JMenu JMalu;
    private javax.swing.JMenu JMconsulta;
    private javax.swing.JMenu JMmaterias;
    private javax.swing.JMenu JMsalir;
    private javax.swing.JMenuItem jMIalumnosPorMateria;
    private javax.swing.JMenuItem jMImanejoInscripciones;
    private javax.swing.JMenuItem jMImanipulacionNotas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
