
package Interfaz;
import Dominio.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class VentanaConsultaPorTematica extends javax.swing.JFrame  implements Observer{
    private Sistema modelo;

    public VentanaConsultaPorTematica(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
        modelo.addObserver(this);
        update(null, null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTematicas = new javax.swing.JList();
        labelMayor = new javax.swing.JLabel();
        labelPuestoInteres = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Consulta por Temática");

        jScrollPane1.setViewportView(listaTematicas);

        labelMayor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelMayor.setText("Mayor a 5:");

        labelPuestoInteres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPuestoInteres.setText("Puesto con requerimiento:");

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPuestoInteres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(labelMayor)
                .addGap(18, 18, 18)
                .addComponent(labelPuestoInteres)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tematica temita = (Tematica) listaTematicas.getSelectedValue();
        if(temita == null){
            JOptionPane.showMessageDialog(null, "Error: seleccione un Tema", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int cant = modelo.postulantePorTema(temita);
        labelMayor.setText("Mayor a 5: " + cant);
        
        int cant2 = modelo.puestoPorTema(temita);
        labelPuestoInteres.setText("Puesto con requerimiento: " + cant2);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMayor;
    private javax.swing.JLabel labelPuestoInteres;
    private javax.swing.JList listaTematicas;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void update(Observable o, Object arg){
        listaTematicas.setListData(modelo.getListaTematicas().toArray());
    }
    
}
