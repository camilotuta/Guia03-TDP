// cSpell:ignore alverata configuracion devolucion gestion prestamo boton operacion
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import java.awt.EventQueue;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
public class GestionPrestamos extends javax.swing.JFrame {
        public static int idPrestamoSeleccionado = -1;

        /**
         * Creates new form Principal
         */
        public GestionPrestamos() {
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
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {
                ftFechaDevolucion = new JFormattedTextField();
                datePicker = new DatePicker();
                jPanel1 = new javax.swing.JPanel();
                imgBack = new javax.swing.JLabel();
                lbPrestamos = new javax.swing.JLabel();
                lbCliente = new javax.swing.JLabel();
                cbCliente = new javax.swing.JComboBox<>();
                lbLibro = new javax.swing.JLabel();
                cbLibro = new javax.swing.JComboBox<>();
                lbFechaDevolucion = new javax.swing.JLabel();
                btnCrearPrestamo = new javax.swing.JButton();
                spTabla = new javax.swing.JScrollPane();
                tTablaPrestamos = new javax.swing.JTable();
                btnModificarPrestamo = new javax.swing.JButton();
                btnEliminarPrestamo = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(249, 244, 239));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                imgBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/back.png"))); // NOI18N
                imgBack.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                imgBackMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                imgBackMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                imgBackMouseExited(evt);
                        }
                });
                jPanel1.add(imgBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

                lbPrestamos.setFont(new java.awt.Font("AlverataIrregular-Bold", 0, 80)); // NOI18N
                lbPrestamos.setForeground(new java.awt.Color(2, 8, 38));
                lbPrestamos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbPrestamos.setText("PRESTAMOS");
                jPanel1.add(lbPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 850, -1));

                lbCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                lbCliente.setForeground(new java.awt.Color(2, 8, 38));
                lbCliente.setText("CLIENTE:");
                jPanel1.add(lbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 110, -1));

                cbCliente.setBackground(new java.awt.Color(234, 221, 207));
                cbCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                cbCliente.setForeground(new java.awt.Color(2, 8, 38));
                cbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
                cbCliente.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbClienteActionPerformed(evt);
                        }
                });
                jPanel1.add(cbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 210, -1));

                lbLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                lbLibro.setForeground(new java.awt.Color(2, 8, 38));
                lbLibro.setText("LIBRO:");
                jPanel1.add(lbLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 110, -1));

                cbLibro.setBackground(new java.awt.Color(234, 221, 207));
                cbLibro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                cbLibro.setForeground(new java.awt.Color(2, 8, 38));
                cbLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
                cbLibro.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbLibroActionPerformed(evt);
                        }
                });
                jPanel1.add(cbLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 210, -1));

                lbFechaDevolucion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                lbFechaDevolucion.setForeground(new java.awt.Color(2, 8, 38));
                lbFechaDevolucion.setText("FECHA DEVOLUCIÓN:");
                jPanel1.add(lbFechaDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 190, -1));

                datePicker.setDateSelectionMode(DatePicker.DateSelectionMode.SINGLE_DATE_SELECTED);

                datePicker.setEditor(ftFechaDevolucion);
                ftFechaDevolucion.setBackground(new java.awt.Color(234, 221, 207));
                ftFechaDevolucion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                ftFechaDevolucion.setForeground(new java.awt.Color(2, 8, 38));
                jPanel1.add(ftFechaDevolucion,
                                new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 130, -1));
                datePicker.setDateSelectionAble(localDate -> localDate.isAfter(LocalDate.now()));

                datePicker.addDateSelectionListener(new DateSelectionListener() {
                        @Override
                        public void dateSelected(DateEvent dateEvent) {
                                desactivarBotonCrearNuevoPrestamo();
                        }
                });

                btnCrearPrestamo.setBackground(new java.awt.Color(140, 120, 81));
                btnCrearPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
                btnCrearPrestamo.setForeground(new java.awt.Color(255, 255, 254));
                btnCrearPrestamo.setText("Crear Nuevo Prestamo");
                btnCrearPrestamo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCrearPrestamoActionPerformed(evt);
                        }
                });
                jPanel1.add(btnCrearPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

                tTablaPrestamos.setBackground(new java.awt.Color(234, 221, 207));
                tTablaPrestamos.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
                tTablaPrestamos.setForeground(new java.awt.Color(2, 8, 38));
                tTablaPrestamos.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null }
                                },
                                new String[] {
                                                "Title 1", "Title 2", "Title 3", "Title 4"
                                }));
                tTablaPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tTablaPrestamosMouseClicked(evt);
                        }
                });
                spTabla.setViewportView(tTablaPrestamos);

                jPanel1.add(spTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 370, 340));

                btnModificarPrestamo.setBackground(new java.awt.Color(140, 120, 81));
                btnModificarPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
                btnModificarPrestamo.setForeground(new java.awt.Color(255, 255, 254));
                btnModificarPrestamo.setText("Modificar Prestamo");
                btnModificarPrestamo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnModificarPrestamoActionPerformed(evt);
                        }
                });
                jPanel1.add(btnModificarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));

                btnEliminarPrestamo.setBackground(new java.awt.Color(140, 120, 81));
                btnEliminarPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
                btnEliminarPrestamo.setForeground(new java.awt.Color(255, 255, 254));
                btnEliminarPrestamo.setText("Eliminar Prestamo");
                btnEliminarPrestamo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnEliminarPrestamoActionPerformed(evt);
                        }
                });
                jPanel1.add(btnEliminarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, -1, -1));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 563,
                                                                Short.MAX_VALUE));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void tTablaPrestamosMouseClicked(java.awt.event.MouseEvent evt) {
                desactivarBotonEliminarPrestamo();
                desactivarBotonModificarPrestamo();
                idPrestamoSeleccionado = obtenerIdSeleccionadoTabla();

        }

        private void imgBackMouseClicked(java.awt.event.MouseEvent evt) {
                Principal p = new Principal();
                p.setVisible(true);
                this.setVisible(false);

        }

        private void imgBackMouseEntered(java.awt.event.MouseEvent evt) {
                CambiarIU.setImageLabel(imgBack, "src/resources/img/backHover.png");

        }

        private void imgBackMouseExited(java.awt.event.MouseEvent evt) {
                CambiarIU.setImageLabel(imgBack, "src/resources/img/back.png");

        }

        private void btnModificarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {
                ModificarPrestamo mp = new ModificarPrestamo();
                mp.setVisible(true);
                this.setVisible(false);
        }

        private void btnCrearPrestamoActionPerformed(java.awt.event.ActionEvent evt) {
                registrarPrestamo();

        }

        private void btnEliminarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {
                eliminarIdSeleccionadoTabla();
                llenarTablaPrestamos();
                desactivarBotonEliminarPrestamo();
                desactivarBotonModificarPrestamo();

        }

        private void cbClienteActionPerformed(java.awt.event.ActionEvent evt) {
                desactivarBotonCrearNuevoPrestamo();

        }

        private void cbLibroActionPerformed(java.awt.event.ActionEvent evt) {
                desactivarBotonCrearNuevoPrestamo();

        }

        private void configuracionPantalla() {
                this.setTitle("Gestión Préstamos");
                this.setResizable(false);
                this.setLocationRelativeTo(null);
                desactivarBotonCrearNuevoPrestamo();
                desactivarBotonEliminarPrestamo();
                desactivarBotonModificarPrestamo();
                llenarTablaPrestamos();
                ponerClientes();
                ponerLibros();

        }

        private void desactivarBotonCrearNuevoPrestamo() {
                boolean camposValidos = ObtenerIU.obtenerSeleccionCombo(cbCliente) != "Seleccionar" &&
                                ObtenerIU.obtenerSeleccionCombo(cbLibro) != "Seleccionar"
                                && !ftFechaDevolucion.getText().equals("--/--/----");
                btnCrearPrestamo.setEnabled(camposValidos);

        }

        private void desactivarBotonModificarPrestamo() {
                boolean filaSeleccionada = obtenerIdSeleccionadoTabla() != -1;
                btnModificarPrestamo.setEnabled(filaSeleccionada);

        }

        private void desactivarBotonEliminarPrestamo() {
                boolean filaSeleccionada = obtenerIdSeleccionadoTabla() != -1;
                btnEliminarPrestamo.setEnabled(filaSeleccionada);

        }

        private void limpiarCampos() {
                CambiarIU.ponerIndiceSeleccionCombo(cbCliente, 0);
                CambiarIU.ponerIndiceSeleccionCombo(cbLibro, 0);
                datePicker.clearSelectedDate();
        }

        private int obtenerIdSeleccionadoTabla() {
                int row = tTablaPrestamos.getSelectedRow();
                if (row != -1) {
                        return (int) (tTablaPrestamos.getValueAt(row, 0));
                }
                return -1;
        }

        private void eliminarIdSeleccionadoTabla() {
                try {
                        OperacionCRUD.eliminar(
                                        String.format("delete from prestamos where id = %d", idPrestamoSeleccionado));
                } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                }

        }

        private void llenarTablaPrestamos() {

                String[] columnNames = { "ID", "ID Cliente", "ID Libro", "Fecha Prestamo", "Fecha Devolución",
                                "Estado" };
                DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

                ArrayList<ArrayList<Object>> listaPrestamos;
                try {
                        listaPrestamos = OperacionCRUD.seleccionar("select * from prestamos",
                                        new String[] { "id", "id_cliente", "id_libro", "fecha_prestamo",
                                                        "fecha_devolucion", "estado" });

                        for (ArrayList<Object> fila : listaPrestamos) {
                                Object[] filaArray = fila.toArray(new Object[0]);
                                tableModel.addRow(filaArray);
                        }
                        tTablaPrestamos.setModel(tableModel);

                        spTabla.setViewportView(tTablaPrestamos);
                } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                }
        }

        private void registrarPrestamo() {
                try {
                        String[] datosCliente = ObtenerIU.obtenerSeleccionCombo(cbCliente).split(" - ");
                        String[] datosLibro = ObtenerIU.obtenerSeleccionCombo(cbLibro).split(" - ");
                        String idCliente = String.valueOf(datosCliente[0]);
                        String idLibro = String.valueOf(datosLibro[0]);
                        String fechaDevolucion = ObtenerIU.obtenerFechaSeleccionada(datePicker);
                        OperacionCRUD.registrar(
                                        String.format("insert into prestamos(id_cliente,id_libro,fecha_devolucion) values (%s,%s,'%s')",
                                                        idCliente, idLibro, fechaDevolucion));
                        JOptionPane.showMessageDialog(null, "PRESTAMO REGISTRADO CON ÉXITO");
                        limpiarCampos();
                        llenarTablaPrestamos();
                        desactivarBotonCrearNuevoPrestamo();
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
                EventQueue.invokeLater(() -> new GestionPrestamos().setVisible(true));
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        public static DatePicker datePicker;
        private JFormattedTextField ftFechaDevolucion;
        private javax.swing.JButton btnCrearPrestamo;
        private javax.swing.JButton btnEliminarPrestamo;
        private javax.swing.JButton btnModificarPrestamo;
        private javax.swing.JComboBox<String> cbCliente;
        private javax.swing.JComboBox<String> cbLibro;
        private javax.swing.JLabel imgBack;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JLabel lbCliente;
        private javax.swing.JLabel lbFechaDevolucion;
        private javax.swing.JLabel lbLibro;
        private javax.swing.JLabel lbPrestamos;
        private javax.swing.JScrollPane spTabla;
        private javax.swing.JTable tTablaPrestamos;
        // End of variables declaration//GEN-END:variables
}
