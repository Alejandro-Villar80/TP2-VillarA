package resol.VillarA;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
public class Ejercicio4 {
    public static void ejecutar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (aaaa-mm-dd):");
        LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());

        DayOfWeek dia = fechaNacimiento.getDayOfWeek();
        System.out.println("Naciste un " + dia);
    }
}
