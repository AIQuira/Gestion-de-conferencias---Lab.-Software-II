package co.edu.unicauca.mvc.vistas.articulos;

import co.edu.unicauca.microkernel.common.interfaces.ISendEmail;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoArticulos;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoConferencias;
import co.edu.unicauca.mvc.infraestructura.Observer;
import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Conferencia;
import co.edu.unicauca.mvc.modelos.EstadoRevision;
import co.edu.unicauca.mvc.plugins.EmailSenderPluginManager;
import co.edu.unicauca.mvc.utilidades.Utilidades;

/**
 * Ventana para registrar artículos en el sistema.
 * Esta clase es responsable de la interfaz gráfica y la lógica
 * para almacenar un artículo y enviar un correo de notificación.
 * 
 * @author anais
 */
public class VtnRegistrarArticulo1 extends javax.swing.JFrame {

    private ServicioAlmacenamientoArticulos objServicio1;
    private ServicioAlmacenamientoConferencias objServicio2;
    
    /**
     * Constructor de la ventana de registro de artículos.
     * 
     * @param objServicio1 Servicio para almacenar artículos.
     * @param objServicio2 Servicio para almacenar conferencias.
     */
    public VtnRegistrarArticulo1(ServicioAlmacenamientoArticulos objServicio1,
            ServicioAlmacenamientoConferencias objServicio2) {
        initComponents();
        this.objServicio1 = objServicio1;
        this.objServicio2 = objServicio2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelEncabezado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAutores = new javax.swing.JLabel();
        jLabelResumen = new javax.swing.JLabel();
        jTextFieldTitulo1 = new javax.swing.JTextField();
        jTextAreaAutores = new javax.swing.JTextField();
        jTextFieldTitulo2 = new javax.swing.JTextField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jComboBoxFormato = new javax.swing.JComboBox<>();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabelResumenInstitucion = new javax.swing.JLabel();
        jLabelResumenFormato = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelEncabezado.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        jLabelEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEncabezado.setText("Registrar articulo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabelEncabezado)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelEncabezado)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTitulo.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        jLabelTitulo.setText("Titulo:");

        jLabelAutores.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        jLabelAutores.setText("Autores:");

        jLabelResumen.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        jLabelResumen.setText("Resumen: ");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Artículo de Investigación", "Artículo de Revisión", "Estudio de Caso", "Artículo de Opinión", "Artículo Metodológico", "Artículo de Reporte", "Artículo de Conferencia" }));

        jComboBoxFormato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PDF", "DOCX", "LaTeX", "RTF", "ODT", "HTML", "TXT" }));

        jLabelResumenInstitucion.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        jLabelResumenInstitucion.setText("Institución: ");

        jLabelResumenFormato.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        jLabelResumenFormato.setText("Formato: ");

        jLabelTipo.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        jLabelTipo.setText("Tipo: ");

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelAutores)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jLabelResumenFormato)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonRegistrar)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabelTipo)
                                        .addGap(33, 33, 33))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabelResumenInstitucion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelResumen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextAreaAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelTipo)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelAutores)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelResumenFormato))
                                .addGap(43, 43, 43)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelResumen)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelResumenInstitucion)
                                    .addComponent(jTextFieldTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonRegistrar))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextAreaAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción que se ejecuta al hacer clic en el botón "Registrar".
     * Obtiene los datos del artículo, lo almacena y envía un correo de notificación.
     * 
     * @param evt Evento de acción.
     */
    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        String titulo, autores;
        Conferencia objConferencia;
        boolean bandera;
        
        // Obtiene los datos ingresados por el usuario
        titulo = this.jTextFieldTitulo.getText();
        autores = this.jTextAreaAutores.getText();
        
        // Crea un nuevo objeto Articulo
        Articulo objArticulo = new Articulo(titulo, autores);
        objArticulo.setIdArticulo(1);// Establece un ID fijo para el artículo

        // Almacena el artículo en el servicio
        bandera = this.objServicio1.almacenarArticulo(objArticulo);
        
        // Establece el estado de revisión del artículo
        objArticulo.setEstadoRevision(EstadoRevision.REVISADO);
        
        // Verifica si el artículo fue almacenado con éxito
        if (bandera == true) {
            Utilidades.mensajeExito("Registro exitoso", "Registro exitoso");
            
            try {
            // Inicializar el EmailSenderPluginManager
            String basePath = "src/main/resources/plugins/";// Especifica la ruta donde está tu archivo plugin.properties
            EmailSenderPluginManager.init(basePath);

            // Obtener el plugin para Hotmail (o el servicio de correo que estés usando)
            ISendEmail emailPlugin = EmailSenderPluginManager.getInstance().getEmailPlugin("h");
            
            // Envía el correo si el plugin se encuentra disponible
            if (emailPlugin != null) {
                emailPlugin.sendEmail("thaliaepe@hotmail.com", "carolt12345","juanpabernal20011@hotmail.com");
            } else {
                System.out.println("No se encontró el plugin para el servicio de correo especificado.");
            }
        } catch (Exception e) {
            e.printStackTrace();// Manejo de excepciones durante el envío de correo
        }

        } else
        {
            // Mensaje de error si el artículo no fue almacenado
            Utilidades.mensajeError("Articulo no almacenado","Error al almacenar el articulo");
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jComboBoxFormato;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabelAutores;
    private javax.swing.JLabel jLabelEncabezado;
    private javax.swing.JLabel jLabelResumen;
    private javax.swing.JLabel jLabelResumenFormato;
    private javax.swing.JLabel jLabelResumenInstitucion;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextAreaAutores;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JTextField jTextFieldTitulo1;
    private javax.swing.JTextField jTextFieldTitulo2;
    // End of variables declaration//GEN-END:variables
}
