
package Interfaz;
import Dominio.*;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Observer;
import java.util.Observable;
import javax.swing.table.DefaultTableModel;


public class VentanaHistorialDePostulante extends javax.swing.JFrame implements Observer{
    private Sistema modelo;
    private Postulante postulante;
       
    public VentanaHistorialDePostulante(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
        modelo.addObserver(this);
        update(null, null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPostulantes = new javax.swing.JList();
        labelNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelMail = new javax.swing.JLabel();
        labelLinkedin = new javax.swing.JLabel();
        labelFormato = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaExperiencia = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        textoPalabra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEntrevistas = new javax.swing.JTable();
        labelLink = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Historial Postulante");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Postulantes:");

        listaPostulantes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaPostulantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPostulantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaPostulantes);

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

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Experiencia:");

        jScrollPane2.setViewportView(listaExperiencia);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Buscar: ");

        textoPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPalabraActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Resetear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tablaEntrevistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nro", "Evaluador", "Puntaje", "Comentarios"
            }
        ));
        jScrollPane3.setViewportView(tablaEntrevistas);
        if (tablaEntrevistas.getColumnModel().getColumnCount() > 0) {
            tablaEntrevistas.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaEntrevistas.getColumnModel().getColumn(1).setPreferredWidth(300);
            tablaEntrevistas.getColumnModel().getColumn(3).setPreferredWidth(1000);
        }

        labelLink.setForeground(java.awt.Color.blue);
        labelLink.setText("link*");
        labelLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLinkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(textoPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 460, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(195, 195, 195))
                            .addComponent(labelDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMail, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelFormato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelLinkedin)
                                .addGap(18, 18, 18)
                                .addComponent(labelLink, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(136, 136, 136))))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNombre)
                        .addGap(18, 18, 18)
                        .addComponent(labelCedula)
                        .addGap(20, 20, 20)
                        .addComponent(labelDireccion)
                        .addGap(20, 20, 20)
                        .addComponent(labelTelefono)
                        .addGap(20, 20, 20)
                        .addComponent(labelMail)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLinkedin)
                            .addComponent(labelLink))
                        .addGap(20, 20, 20)
                        .addComponent(labelFormato)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(274, 274, 274))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textoPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaPostulantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPostulantesMouseClicked
        postulante = (Postulante)listaPostulantes.getSelectedValue();
        
        labelNombre.setText("Nombre: "  + postulante.getNombre());
        labelCedula.setText("Cédula: " + postulante.getCedula());
        labelDireccion.setText("Dirección: " + postulante.getDireccion());
        labelTelefono.setText("Telefono: " + postulante.getTelefono());
        labelMail.setText("Mail: " + postulante.getMail());
        labelLink.setText(postulante.getLinkedin());
        labelFormato.setText("Dirección: " + postulante.getTipoTrabajo());
        listaExperiencia.setListData(postulante.getHabilidades().toArray());
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaEntrevistas.getModel();
        
        modeloTabla.setRowCount(0);
        
        for (Entrevista recorrido : postulante.getEntrevistas()) {
            modeloTabla.addRow(new Object[]{recorrido.getNumero(), recorrido.getEvaluador(), recorrido.getPuntaje(), recorrido.getComentarios()});
        }
    }//GEN-LAST:event_listaPostulantesMouseClicked

    private void textoPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPalabraActionPerformed
       
    }//GEN-LAST:event_textoPalabraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String palabra = textoPalabra.getText();
        if(postulante == null){
            
        }
        postulante = (Postulante)listaPostulantes.getSelectedValue();
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaEntrevistas.getModel();
        
        modeloTabla.setRowCount(0);
        
        for (Entrevista recorrido : postulante.funcBuscador(palabra)) {
            
            modeloTabla.addRow(new Object[]{recorrido.getNumero(), recorrido.getEvaluador(), recorrido.getPuntaje(), recorrido.getComentarioColoreado(palabra)});
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        postulante = (Postulante)listaPostulantes.getSelectedValue();
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaEntrevistas.getModel();
        
        modeloTabla.setRowCount(0);
        
        for (Entrevista recorrido : postulante.getEntrevistas()) {
            modeloTabla.addRow(new Object[]{recorrido.getNumero(), recorrido.getEvaluador(), recorrido.getPuntaje(), recorrido.getComentarios()});
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void labelLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLinkMouseClicked
        try {
            Desktop.getDesktop().browse(new URI(labelLink.getText()));
        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_labelLinkMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFormato;
    private javax.swing.JLabel labelLink;
    private javax.swing.JLabel labelLinkedin;
    private javax.swing.JLabel labelMail;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JList listaExperiencia;
    private javax.swing.JList listaPostulantes;
    private javax.swing.JTable tablaEntrevistas;
    private javax.swing.JTextField textoPalabra;
    // End of variables declaration//GEN-END:variables
    public void update(Observable o, Object arg) {
        listaPostulantes.setListData(modelo.getListaPostulantes().toArray());
        if(postulante != null){
            listaExperiencia.setListData(postulante.getHabilidades().toArray());
        }
    }
}
