// cSpell:ignore alverata configuracion
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import java.awt.Toolkit;
//TODO: CAMBIAR BASE DE DATOS, ELIMINAR CAMPOS INNECESARIOS

/**
 *
 * @author tutaa
 */
public class Principal extends javax.swing.JFrame {

	/**
	 * Creates new form Principal
	 */
	public Principal() {
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
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                lbBienvenido = new javax.swing.JLabel();
                Dashboard = new javax.swing.JPanel();
                imgCustomers = new javax.swing.JLabel();
                imgBooks = new javax.swing.JLabel();
                ImgLendings = new javax.swing.JLabel();
                imgWellcome = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setPreferredSize(new java.awt.Dimension(838, 556));

                jPanel1.setBackground(new java.awt.Color(249, 244, 239));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                lbBienvenido.setFont(new java.awt.Font("AlverataIrregular-Bold", 0, 80)); // NOI18N
                lbBienvenido.setForeground(new java.awt.Color(2, 8, 38));
                lbBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbBienvenido.setText("BIENVENIDO");
                jPanel1.add(lbBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 850, -1));

                Dashboard.setBackground(new java.awt.Color(234, 221, 207));
                Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                imgCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/customers.png"))); // NOI18N
                imgCustomers.setToolTipText("Clientes");
                Dashboard.add(imgCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 50, -1));

                imgBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/books.png"))); // NOI18N
                imgBooks.setToolTipText("Libros");
                Dashboard.add(imgBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, 50));

                ImgLendings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/lendings.png"))); // NOI18N
                ImgLendings.setToolTipText("Prestamos");
                Dashboard.add(ImgLendings, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, -1));

                jPanel1.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 1080, 60));

                imgWellcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                imgWellcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/img/wellcome.png"))); // NOI18N
                jPanel1.add(imgWellcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 110, 850, -1));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

	private void configuracionPantalla() {
		// TODO: PONER NOMBRE PANTALLA
		this.setTitle("--");
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		// TODO: PONER ICONO APP
		this.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(getClass().getResource("/img/icon.png")));

	}

	private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel.
		 * For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Principal().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel Dashboard;
        private javax.swing.JLabel ImgLendings;
        private javax.swing.JLabel imgBooks;
        private javax.swing.JLabel imgCustomers;
        private javax.swing.JLabel imgWellcome;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JLabel lbBienvenido;
        // End of variables declaration//GEN-END:variables
}
