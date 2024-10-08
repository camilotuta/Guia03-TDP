// cSpell:ignore alverata configuracion devolucion prestamo gestion  boton operacion
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import java.awt.EventQueue;
import java.time.LocalDate;

import javax.swing.JFormattedTextField;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.sql.SQLException;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import classes.OperacionCRUD;
import raven.datetime.component.date.DateEvent;
import raven.datetime.component.date.DatePicker;
import raven.datetime.component.date.DateSelectionListener;
import screens.custom.CambiarIU;
import screens.custom.ObtenerIU;

/**
 *
 * @author tutaa
 */
public class ModificarPrestamo extends javax.swing.JFrame {

        /**
         * Creates new form Principal
         */
        public ModificarPrestamo() {
                initComponents();
                configuracionPantalla();
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {
                ftFechaDevolucion = new JFormattedTextField();
                datePicker = new DatePicker();
                jPanel1 = new javax.swing.JPanel();
                lbBienvenido = new javax.swing.JLabel();
                btnModificarPrestamo = new javax.swing.JButton();
                btnRegresar = new javax.swing.JButton();
                lbCliente = new javax.swing.JLabel();
                cbCliente = new javax.swing.JComboBox<>();
                lbLibro = new javax.swing.JLabel();
                cbLibro = new javax.swing.JComboBox<>();
                lbFechaDevolucion = new javax.swing.JLabel();
                lbEstado = new javax.swing.JLabel();
                cbEstado = new javax.swing.JComboBox<>();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(249, 244, 239));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                lbBienvenido.setFont(new java.awt.Font("AlverataIrregular-Bold", 0, 50)); // NOI18N
                lbBienvenido.setForeground(new java.awt.Color(2, 8, 38));
                lbBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbBienvenido.setText("MODIFICAR PRESTAMO");
                jPanel1.add(lbBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 590, -1));

                btnModificarPrestamo.setBackground(new java.awt.Color(140, 120, 81));
                btnModificarPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
                btnModificarPrestamo.setForeground(new java.awt.Color(255, 255, 254));
                btnModificarPrestamo.setText("Modificar Prestamo");
                btnModificarPrestamo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnModificarPrestamoActionPerformed(evt);
                        }
                });
                jPanel1.add(btnModificarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

                btnRegresar.setBackground(new java.awt.Color(140, 120, 81));
                btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
                btnRegresar.setForeground(new java.awt.Color(255, 255, 254));
                btnRegresar.setText("Regresar");
                btnRegresar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnRegresarActionPerformed(evt);
                        }
                });
                jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

                lbCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                lbCliente.setForeground(new java.awt.Color(2, 8, 38));
                lbCliente.setText("CLIENTE:");
                jPanel1.add(lbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 110, -1));

                cbCliente.setBackground(new java.awt.Color(234, 221, 207));
                cbCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                cbCliente.setForeground(new java.awt.Color(2, 8, 38));
                cbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
                cbCliente.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbClienteActionPerformed(evt);
                        }
                });
                jPanel1.add(cbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 210, -1));

                lbLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                lbLibro.setForeground(new java.awt.Color(2, 8, 38));
                lbLibro.setText("LIBRO:");
                jPanel1.add(lbLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 110, -1));

                cbLibro.setBackground(new java.awt.Color(234, 221, 207));
                cbLibro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                cbLibro.setForeground(new java.awt.Color(2, 8, 38));
                cbLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
                cbLibro.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbLibroActionPerformed(evt);
                        }
                });
                jPanel1.add(cbLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 210, -1));

                lbFechaDevolucion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                lbFechaDevolucion.setForeground(new java.awt.Color(2, 8, 38));
                lbFechaDevolucion.setText("FECHA DEVOLUCIÓN:");
                jPanel1.add(lbFechaDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 190, -1));

                datePicker.setDateSelectionMode(DatePicker.DateSelectionMode.SINGLE_DATE_SELECTED);

                datePicker.setEditor(ftFechaDevolucion);
                ftFechaDevolucion.setBackground(new java.awt.Color(234, 221, 207));
                ftFechaDevolucion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                ftFechaDevolucion.setForeground(new java.awt.Color(2, 8, 38));
                jPanel1.add(ftFechaDevolucion,
                                new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 130, -1));
                datePicker.setDateSelectionAble(localDate -> localDate.isAfter(LocalDate.now()));

                datePicker.addDateSelectionListener(new DateSelectionListener() {
                        @Override
                        public void dateSelected(DateEvent dateEvent) {
                                desactivarBotonModificarPrestamo();
                        }
                });

                lbEstado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                lbEstado.setForeground(new java.awt.Color(2, 8, 38));
                lbEstado.setText("ESTADO:");
                jPanel1.add(lbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 110, -1));

                cbEstado.setBackground(new java.awt.Color(234, 221, 207));
                cbEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                cbEstado.setForeground(new java.awt.Color(2, 8, 38));
                cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Seleccionar", "Pendiente", "Devuelto" }));
                cbEstado.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbEstadoActionPerformed(evt);
                        }
                });
                jPanel1.add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 210, -1));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495,
                                                                Short.MAX_VALUE));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void cbClienteActionPerformed(java.awt.event.ActionEvent evt) {
                desactivarBotonModificarPrestamo();

        }

        private void cbLibroActionPerformed(java.awt.event.ActionEvent evt) {
                desactivarBotonModificarPrestamo();

        }

        private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {
                desactivarBotonModificarPrestamo();
        }

        private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {
                GestionPrestamos gp = new GestionPrestamos();
                gp.setVisible(true);
                this.setVisible(false);

        }

        private void btnModificarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {
                modificarIdPrestamoSeleccionado();
                GestionPrestamos gp = new GestionPrestamos();
                gp.setVisible(true);
                this.setVisible(false);

        }

        private void configuracionPantalla() {
                this.setTitle("Modificar Préstamo");
                this.setResizable(false);
                this.setLocationRelativeTo(null);
                ponerClientes();
                ponerLibros();
                llenarCampos();
                desactivarBotonModificarPrestamo();

        }

        private void desactivarBotonModificarPrestamo() {
                boolean camposValidos = ObtenerIU.obtenerSeleccionCombo(cbCliente) != "Seleccionar" &&
                                ObtenerIU.obtenerSeleccionCombo(cbLibro) != "Seleccionar"
                                && !ftFechaDevolucion.getText().equals("--/--/----");
                btnModificarPrestamo.setEnabled(camposValidos);

        }

        private void llenarCampos() {
                int idPrestamoModificar = GestionPrestamos.idPrestamoSeleccionado;
                ArrayList<ArrayList<Object>> datosPrestamo, datosCliente, datosLibro;
                try {
                        datosPrestamo = OperacionCRUD.seleccionar(
                                        "select * from prestamos where id= " + idPrestamoModificar,
                                        new String[] { "id_cliente", "id_libro", "fecha_devolucion", "estado"
                                        });

                        datosCliente = OperacionCRUD.seleccionar(
                                        "select * from clientes where id= " + datosPrestamo.get(0).get(0),
                                        new String[] { "id", "nombre" });
                        datosLibro = OperacionCRUD.seleccionar(
                                        "select * from libros where id= " + datosPrestamo.get(0).get(1),
                                        new String[] { "id", "titulo" });

                        CambiarIU.ponerSeleccionCombo(cbCliente,
                                        datosCliente.get(0).get(0) + " - " + datosCliente.get(0).get(1));
                        CambiarIU.ponerSeleccionCombo(cbLibro,
                                        datosLibro.get(0).get(0) + " - " + datosLibro.get(0).get(1));
                        CambiarIU.ponerFechaSeleccionada(datePicker, String.valueOf(datosPrestamo.get(0).get(2)));
                        CambiarIU.ponerSeleccionCombo(cbEstado, String.valueOf(datosPrestamo.get(0).get(3)));
                } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                }

        }

        private void modificarIdPrestamoSeleccionado() {
                try {
                        int idPrestamoModificar = GestionPrestamos.idPrestamoSeleccionado;

                        String[] datosCliente = ObtenerIU.obtenerSeleccionCombo(cbCliente).split(" - ");
                        String[] datosLibro = ObtenerIU.obtenerSeleccionCombo(cbLibro).split(" - ");
                        String idCliente = String.valueOf(datosCliente[0]);
                        String idLibro = String.valueOf(datosLibro[0]);
                        String fechaDevolucion = ObtenerIU.obtenerFechaSeleccionada(datePicker);
                        String estado = String.valueOf(ObtenerIU.obtenerSeleccionCombo(cbEstado));
                        OperacionCRUD.actualizar(
                                        String.format("UPDATE prestamos SET id_cliente = %s, id_libro = %s, fecha_devolucion = '%s', estado = '%s' WHERE id = %s",
                                                        idCliente, idLibro, fechaDevolucion, estado,
                                                        idPrestamoModificar));

                        JOptionPane.showMessageDialog(null, "PRESTAMO MODIFICADO CON ÉXITO");
                } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                }

        }

        private void ponerClientes() {
                try {
                        ArrayList<ArrayList<Object>> listaClientes = OperacionCRUD.seleccionar(
                                        "select id, nombre from clientes",
                                        new String[] { "id", "nombre" });

                        for (ArrayList<Object> fila : listaClientes) {
                                cbCliente.addItem(fila.get(0) + " - " + fila.get(1));
                        }

                } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        }

        private void ponerLibros() {
                try {
                        ArrayList<ArrayList<Object>> listaLibros = OperacionCRUD.seleccionar(
                                        "select id, titulo from libros",
                                        new String[] { "id", "titulo" });

                        for (ArrayList<Object> fila : listaLibros) {
                                cbLibro.addItem(fila.get(0) + " - " + fila.get(1));
                        }

                } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                FlatMacDarkLaf.setup();
                EventQueue.invokeLater(() -> new ModificarPrestamo().setVisible(true));
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnModificarPrestamo;
        private javax.swing.JButton btnRegresar;
        private javax.swing.JComboBox<String> cbCliente;
        private javax.swing.JComboBox<String> cbEstado;
        private javax.swing.JComboBox<String> cbLibro;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JLabel lbBienvenido;
        private javax.swing.JLabel lbCliente;
        private javax.swing.JLabel lbEstado;
        private javax.swing.JLabel lbFechaDevolucion;
        private javax.swing.JLabel lbLibro;
        public static DatePicker datePicker;
        private JFormattedTextField ftFechaDevolucion;

        // End of variables declaration//GEN-END:variables
}
