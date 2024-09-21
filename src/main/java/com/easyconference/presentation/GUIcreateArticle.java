/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.easyconference.presentation;


import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Ashlee Campaz
 */
public class GUIcreateArticle extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUIcreateArticle
     */ 
    private ArrayList<pnlAutor>  listadoAutores;

    public ArrayList<pnlAutor> getListadoAutores() {
        return listadoAutores;
    }

    public JPanel getPnlAutores() {
        return pnlAutores;
    }
     
    public GUIcreateArticle() {
        listadoAutores= new ArrayList<>();
        initComponents();
        lbAgregarAutorMouseClicked(null);
        lbAgregarAutorMouseClicked(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lbCrearArticulo = new javax.swing.JLabel();
        pnlInfoGeneral = new javax.swing.JPanel();
        txtfTitulo = new javax.swing.JTextField();
        sclpAutores = new javax.swing.JScrollPane();
        txtaResumen = new javax.swing.JTextArea();
        txtfPalabrasClaves = new javax.swing.JTextField();
        pnlFondoAutores = new javax.swing.JPanel();
        scrlpAutores = new javax.swing.JScrollPane();
        pnlAutores = new javax.swing.JPanel();
        lbAgregarAutor = new javax.swing.JLabel();
        pnlBtnEnviar = new javax.swing.JPanel();
        lbEnviar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(229, 229, 229));
        setBorder(null);
        setFrameIcon(null);
        setMinimumSize(new java.awt.Dimension(873, 650));
        setPreferredSize(new java.awt.Dimension(873, 650));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lbCrearArticulo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        lbCrearArticulo.setForeground(new java.awt.Color(102, 102, 102));
        lbCrearArticulo.setText("Enviar articulo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 0);
        getContentPane().add(lbCrearArticulo, gridBagConstraints);

        pnlInfoGeneral.setBackground(new java.awt.Color(255, 255, 255));

        txtfTitulo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder("*Titulo"));

        txtaResumen.setColumns(20);
        txtaResumen.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtaResumen.setRows(5);
        txtaResumen.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "*Resumen"));
        sclpAutores.setViewportView(txtaResumen);

        txtfPalabrasClaves.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtfPalabrasClaves.setBorder(javax.swing.BorderFactory.createTitledBorder("*Palabras claves"));

        javax.swing.GroupLayout pnlInfoGeneralLayout = new javax.swing.GroupLayout(pnlInfoGeneral);
        pnlInfoGeneral.setLayout(pnlInfoGeneralLayout);
        pnlInfoGeneralLayout.setHorizontalGroup(
            pnlInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoGeneralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfPalabrasClaves, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtfTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sclpAutores, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlInfoGeneralLayout.setVerticalGroup(
            pnlInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoGeneralLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(sclpAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(txtfPalabrasClaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 115;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 20, 0, 0);
        getContentPane().add(pnlInfoGeneral, gridBagConstraints);

        pnlFondoAutores.setBackground(new java.awt.Color(229, 229, 229));
        pnlFondoAutores.setLayout(new java.awt.GridBagLayout());

        scrlpAutores.setBackground(new java.awt.Color(255, 255, 255));
        scrlpAutores.setBorder(null);

        pnlAutores.setBackground(new java.awt.Color(255, 255, 255));
        pnlAutores.setLayout(new javax.swing.BoxLayout(pnlAutores, javax.swing.BoxLayout.Y_AXIS));
        scrlpAutores.setViewportView(pnlAutores);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 338;
        gridBagConstraints.ipady = 424;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 25, 0, 0);
        pnlFondoAutores.add(scrlpAutores, gridBagConstraints);

        lbAgregarAutor.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        lbAgregarAutor.setText("haga clic aqui para agregar otro autor");
        lbAgregarAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbAgregarAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAgregarAutorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbAgregarAutorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbAgregarAutorMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 145;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 57, 0, 0);
        pnlFondoAutores.add(lbAgregarAutor, gridBagConstraints);

        pnlBtnEnviar.setBackground(new java.awt.Color(255, 255, 255));
        pnlBtnEnviar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pnlBtnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBtnEnviar.setLayout(new java.awt.BorderLayout());

        lbEnviar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lbEnviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEnviar.setText("enviar");
        lbEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbEnviarMouseExited(evt);
            }
        });
        pnlBtnEnviar.add(lbEnviar, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 300, 6, 0);
        pnlFondoAutores.add(pnlBtnEnviar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 12, 0, 35);
        getContentPane().add(pnlFondoAutores, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbAgregarAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAgregarAutorMouseClicked
        // TODO add your handling code here:
        pnlAutor nuevoAutor = new pnlAutor(listadoAutores.size() +1);
        listadoAutores.add(nuevoAutor);
        pnlAutores.add(nuevoAutor);
        
    }//GEN-LAST:event_lbAgregarAutorMouseClicked

    private void lbAgregarAutorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAgregarAutorMouseEntered
        lbAgregarAutor.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12));
    }//GEN-LAST:event_lbAgregarAutorMouseEntered

    private void lbAgregarAutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAgregarAutorMouseExited
        lbAgregarAutor.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12));
    }//GEN-LAST:event_lbAgregarAutorMouseExited

    private void lbEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEnviarMouseEntered
       lbEnviar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
    }//GEN-LAST:event_lbEnviarMouseEntered

    private void lbEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEnviarMouseExited
       lbEnviar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
    }//GEN-LAST:event_lbEnviarMouseExited

    public void actualizarListadoAutores(){
        int i=1;
        for(pnlAutor autor: listadoAutores){
            autor.getLbAutor().setText("Autor " + i );
            i++;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbAgregarAutor;
    private javax.swing.JLabel lbCrearArticulo;
    private javax.swing.JLabel lbEnviar;
    private javax.swing.JPanel pnlAutores;
    private javax.swing.JPanel pnlBtnEnviar;
    private javax.swing.JPanel pnlFondoAutores;
    private javax.swing.JPanel pnlInfoGeneral;
    private javax.swing.JScrollPane sclpAutores;
    private javax.swing.JScrollPane scrlpAutores;
    private javax.swing.JTextArea txtaResumen;
    private javax.swing.JTextField txtfPalabrasClaves;
    private javax.swing.JTextField txtfTitulo;
    // End of variables declaration//GEN-END:variables
}
