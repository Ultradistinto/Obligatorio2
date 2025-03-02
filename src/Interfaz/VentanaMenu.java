
package Interfaz;
import Dominio.Sistema;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class VentanaMenu extends javax.swing.JFrame {
    private Sistema modelo;
    
    public VentanaMenu(Sistema unSistema) {
        modelo = unSistema;
        initComponents();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                jMenuItemGuardarSisActionPerformed();
            }
        }); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        OpcionesMenu = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        opcionAltaPostulante = new javax.swing.JMenuItem();
        bajaPostulante = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        registroDeTematica = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        registroEvaluador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OpcionesMenu.setText("Consulta");

        jMenuItem3.setText("Consulta por tematica");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        OpcionesMenu.add(jMenuItem3);

        jMenuItem4.setText("Consulta para puesto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        OpcionesMenu.add(jMenuItem4);

        jMenuItem5.setText("Consulta Historial");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        OpcionesMenu.add(jMenuItem5);

        jMenuBar1.add(OpcionesMenu);

        jMenu1.setText("Registro");

        opcionAltaPostulante.setText("Alta Postulante");
        opcionAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionAltaPostulanteActionPerformed(evt);
            }
        });
        jMenu1.add(opcionAltaPostulante);

        bajaPostulante.setText("Baja Postulante");
        bajaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaPostulanteActionPerformed(evt);
            }
        });
        jMenu1.add(bajaPostulante);

        jMenuItem1.setText("Ingreso de entrevista");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        registroDeTematica.setText("Registro de tematica");
        registroDeTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroDeTematicaActionPerformed(evt);
            }
        });
        jMenu1.add(registroDeTematica);

        jMenuItem2.setText("Registro de puesto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        registroEvaluador.setText("Registro Evaluador");
        registroEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroEvaluadorActionPerformed(evt);
            }
        });
        jMenu1.add(registroEvaluador);

        jMenuBar1.add(jMenu1);

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

    private void registroDeTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroDeTematicaActionPerformed
        VentanaRegistroDeTematica vent = new VentanaRegistroDeTematica(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_registroDeTematicaActionPerformed

    private void opcionAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionAltaPostulanteActionPerformed
        VentanaAltaDePostulante vent =  new VentanaAltaDePostulante(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_opcionAltaPostulanteActionPerformed

    private void registroEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroEvaluadorActionPerformed
        VentanaRegistroDeEvaluador vent = new VentanaRegistroDeEvaluador(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_registroEvaluadorActionPerformed

    private void bajaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaPostulanteActionPerformed
        VentanaBajaDePostulante vent = new VentanaBajaDePostulante(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_bajaPostulanteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VentanaIngresoDeEntrevista vent =  new VentanaIngresoDeEntrevista(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VentanaRegistroDePuesto vent = new VentanaRegistroDePuesto(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        VentanaConsultaPorTematica vent = new VentanaConsultaPorTematica(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        VentanaConsultaParaPuesto vent = new VentanaConsultaParaPuesto(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        VentanaHistorialDePostulante vent = new VentanaHistorialDePostulante(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    
    private void jMenuItemGuardarSisActionPerformed() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get("datos.ser")));
            out.writeObject(this.modelo);
            out.close();
            JOptionPane.showMessageDialog(this, "Se guardo el sistema ","Guardar", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el sistema ","Guardar", JOptionPane.ERROR_MESSAGE);
            //System.exit(1);
        }
    } 


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu OpcionesMenu;
    private javax.swing.JMenuItem bajaPostulante;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem opcionAltaPostulante;
    private javax.swing.JMenuItem registroDeTematica;
    private javax.swing.JMenuItem registroEvaluador;
    // End of variables declaration//GEN-END:variables
}
