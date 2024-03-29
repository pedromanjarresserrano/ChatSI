/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import static java.lang.Thread.yield;
import java.util.ArrayList;
import logica.Controller;
import logica.Mensaje;

/**
 *
 * @author PedroD
 */
public class JFBasedatos extends javax.swing.JFrame {

    private final Controller control = new Controller();

    static ArrayList<Mensaje> msnlist = new ArrayList<>();

    /**
     *
     * @throws Exception
     */
    public JFBasedatos() throws Exception {
        initComponents();
    }

    public void colocarDatos(ArrayList<Mensaje> datos) {

        JTAchattexto.setText("");
        for (Mensaje mensaje : datos) {
            JTAchattexto.setText(JTAchattexto.getText() + mensaje.getUsuario() + ": " + mensaje.getMensaje() + "\n");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTAchattexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos en base de datos");

        JTAchattexto.setColumns(20);
        JTAchattexto.setRows(5);
        jScrollPane1.setViewportView(JTAchattexto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JTAchattexto;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
