// cSpell:words dias
package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Dates {

    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");

    public static String obtenerAño() {
        return String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
    }

    public static String obtenerMes() {
        return String.valueOf(Calendar.getInstance().get(Calendar.MONTH) + 1);
    }

    public static String obtenerDia() {
        return String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
    }

    public static String obtenerFechaHoy() {
        LocalDate today = LocalDate.now();
        return today.format(formatter);
    }

    public static int restarFechas(String fMenorSinFormato, String fMayorSinFormato) {
        LocalDate fechaMenor = LocalDate.parse(fMenorSinFormato, formatter);
        LocalDate fechaMayor = LocalDate.parse(fMayorSinFormato, formatter);

        long diasEntre = ChronoUnit.DAYS.between(fechaMenor, fechaMayor);
        return (int) diasEntre;
    }

    
}
