
package Interfaz;
import Logica.Sistema;

public class VentanaMenu extends javax.swing.JFrame {
    private Sistema modelo;
    
    public VentanaMenu(Sistema unSistema) {
        modelo = unSistema;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        OpcionesMenu = new javax.swing.JMenu();
        RegistroDeTematica = new javax.swing.JMenuItem();
        opcionAltaPostulante = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OpcionesMenu.setText("Opciones");

        RegistroDeTematica.setText("Registro de tematica");
        RegistroDeTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroDeTematicaActionPerformed(evt);
            }
        });
        OpcionesMenu.add(RegistroDeTematica);

        opcionAltaPostulante.setText("Alta Postulante");
        opcionAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionAltaPostulanteActionPerformed(evt);
            }
        });
        OpcionesMenu.add(opcionAltaPostulante);

        jMenuItem3.setText("jMenuItem3");
        OpcionesMenu.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        OpcionesMenu.add(jMenuItem4);

        jMenuBar1.add(OpcionesMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroDeTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroDeTematicaActionPerformed
        VentanaRegistroDeTematica vent = new VentanaRegistroDeTematica(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_RegistroDeTematicaActionPerformed

    private void opcionAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionAltaPostulanteActionPerformed
        VentanaAltaDePostulante vent =  new VentanaAltaDePostulante(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_opcionAltaPostulanteActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu OpcionesMenu;
    private javax.swing.JMenuItem RegistroDeTematica;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem opcionAltaPostulante;
    // End of variables declaration//GEN-END:variables
}
