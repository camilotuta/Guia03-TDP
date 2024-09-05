// cSpell:ignore rawtypes seleccion
package screens.custom;

import static classes.Dates.formatter;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import raven.datetime.component.date.DatePicker;

import javax.swing.JComboBox;

public class ObtenerIU {

    public static String obtenerTextoEtiqueta(JLabel label) {
        return (String) label.getText();
    }

    public static String obtenerTextoPanel(JTextPane panel) {
        return (String) panel.getText();
    }

    public static String obtenerTextoArea(JTextArea area) {
        return (String) area.getText();
    }

    public static String obtenerTextoCampo(JTextField campo) {
        return (String) campo.getText();
    }

    public static int obtenerLongitudTextoCampo(JTextField campo) {
        return (int) campo.getText().length();
    }

    public static int obtenerLongitudTextoArea(JTextArea area) {
        return (int) area.getText().length();
    }

    @SuppressWarnings("rawtypes")
    public static String obtenerSeleccionCombo(JComboBox comboBox) {
        Object selectedItem = comboBox.getSelectedItem();
        return selectedItem != null ? selectedItem.toString() : null;
    }

    @SuppressWarnings("rawtypes")
    public static int obtenerIndiceSeleccionCombo(JComboBox comboBox) {
        return comboBox.getSelectedIndex();
    }

    public static String obtenerFechaSeleccionada(DatePicker datePicker) {
        return datePicker.getSelectedDate().format(formatter);
    }

}
