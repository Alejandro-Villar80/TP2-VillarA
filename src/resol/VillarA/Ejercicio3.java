package resol.VillarA;
import java.time.LocalTime;
import java.time.Duration;
public class Ejercicio3 {
    public static void ejecutar(){
        LocalTime inicio = LocalTime.of(7,0);
        LocalTime fin= LocalTime.of(15,0);
        Duration duracion = Duration.between(inicio,fin);
        long minutos = duracion.toMinutes();
        System.out.println("La jornada laboral dura:"+minutos+"minutos");
    }
}
