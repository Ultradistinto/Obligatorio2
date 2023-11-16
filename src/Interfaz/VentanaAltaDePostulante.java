package Interfaz;
import Logica.Sistema;
import Logica.Postulante;
import javax.swing.*;

public class VentanaAltaDePostulante extends javax.swing.JFrame {
    private Sistema modelo;
    
    public VentanaAltaDePostulante(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        labelNombre = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelMail = new javax.swing.JLabel();
        labelLinkedin = new javax.swing.JLabel();
        labelFormato = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        textoCedula = new javax.swing.JTextField();
        textoDireccion = new javax.swing.JTextField();
        textoLinkedin = new javax.swing.JTextField();
        textoTelefono = new javax.swing.JTextField();
        textoMail = new javax.swing.JTextField();
        botonRemoto = new javax.swing.JRadioButton();
        botonPresencial = new javax.swing.JRadioButton();
        botonMixto = new javax.swing.JRadioButton();
        botonCancelar = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        labelAltaPostulante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNombre.setText("Nombre:");

        labelCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCedula.setText("Cédula:");

        labelDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDireccion.setText("Dirección:");

        labelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTelefono.setText("Teléfono:");

        labelMail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelMail.setText("Mail:");

        labelLinkedin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelLinkedin.setText("Linkedin:");

        labelFormato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelFormato.setText("Formato:");

        textoMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoMailActionPerformed(evt);
            }
        });

        buttonGroup1.add(botonRemoto);
        botonRemoto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonRemoto.setText("Remoto");

        buttonGroup1.add(botonPresencial);
        botonPresencial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonPresencial.setText("Presencial");

        buttonGroup1.add(botonMixto);
        botonMixto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonMixto.setText("Mixto");

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        labelAltaPostulante.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelAltaPostulante.setText("Alta postulante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCedula)
                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelLinkedin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelFormato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoLinkedin)
                            .addComponent(textoMail)
                            .addComponent(textoTelefono)
                            .addComponent(textoDireccion)
                            .addComponent(textoCedula)
                            .addComponent(textoNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonRemoto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botonPresencial, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botonMixto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 19, Short.MAX_VALUE)))))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelAltaPostulante)
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAltaPostulante)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCedula)
                    .addComponent(textoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion)
                    .addComponent(textoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefono)
                    .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMail)
                    .addComponent(textoMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLinkedin)
                    .addComponent(textoLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFormato)
                    .addComponent(botonRemoto)
                    .addComponent(botonPresencial)
                    .addComponent(botonMixto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoMailActionPerformed
        
    }//GEN-LAST:event_textoMailActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        String unNombre = textoNombre.getText();
        int unTelefono;
        String unaDireccion = textoDireccion.getText();
        int unaCedula;
        String unMail = textoMail.getText();
        String unLinkedin = textoLinkedin.getText();
        
        if (textoCedula.getText().trim().isEmpty() || textoNombre.getText().trim().isEmpty() || textoTelefono.getText().trim().isEmpty() || textoDireccion.getText().trim().isEmpty() || textoMail.getText().trim().isEmpty() || textoLinkedin.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: Intente no dejar expacios vacios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        try {
            unaCedula = Integer.parseInt(textoCedula.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Cedula tiene que ser un Numero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        try {
            unTelefono = Integer.parseInt(textoTelefono.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Telefono tiene que ser un Numero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        try{
            this.modelo.addPostulante(unNombre, unaCedula, unaDireccion, unTelefono, unMail, unLinkedin, unMail);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        textoNombre.setText("");
        textoCedula.setText("");
        textoDireccion.setText("");
        textoTelefono.setText("");
        textoMail.setText("");
        textoLinkedin.setText("");
        
        
        VentanaNivelTemas vent =  new VentanaNivelTemas(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JRadioButton botonMixto;
    private javax.swing.JRadioButton botonPresencial;
    private javax.swing.JRadioButton botonRemoto;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel labelAltaPostulante;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFormato;
    private javax.swing.JLabel labelLinkedin;
    private javax.swing.JLabel labelMail;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JTextField textoCedula;
    private javax.swing.JTextField textoDireccion;
    private javax.swing.JTextField textoLinkedin;
    private javax.swing.JTextField textoMail;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoTelefono;
    // End of variables declaration//GEN-END:variables
}
