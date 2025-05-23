package resol.VillarA;
import java.util.Scanner;
public class Ejercicio7 {
    public static void ejecutar(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese Numero: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
        System.out.println("*".repeat(i));
    }

    }
}
