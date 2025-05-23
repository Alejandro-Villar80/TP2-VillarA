package resol.VillarA;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Ejercicio5 {
    public static void ejecutar(){
        LocalDateTime ahora = LocalDateTime.now();
        LocalDateTime examen = LocalDateTime.of(2025, 6, 26, 19, 20);
        if (ahora.isAfter(examen)){
            System.out.println("El examen ya ocurrió.");
            return;
        }
        long dias = ChronoUnit.DAYS.between(ahora.toLocalDate(), examen.toLocalDate());
        System.out.println("Faltan " + dias + " días para el examen.");
        long clases = dias / 7 * 2;
        System.out.println("Tendremos aproximadamente " + clases + " clases hasta el examen.");
    }
}
