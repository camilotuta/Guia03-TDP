package screens.custom;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class CambiarIU {
    public static void setImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),
                        Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
    }

    public static void setImageLabelSize(JLabel labelName, String root, int width, int height) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(width, height,
                        Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
    }

    public static void ponerTextoEtiqueta(JLabel label, String texto) {
        label.setText(texto);
    }

    public static void ponerTextoCampo(JTextField field, String texto) {
        field.setText(texto);
    }

    public static void ponerTextoArea(JTextArea txtArea, String texto) {
        txtArea.setText(texto);
    }

    public static void ponerTextoPanel(JTextPane txtPanel, String texto) {
        txtPanel.setText(texto);
    }

    public static void ponerTextoCampoContraseña(JPasswordField contraseñaField, String texto) {
        contraseñaField.setText(texto);
    }

}
