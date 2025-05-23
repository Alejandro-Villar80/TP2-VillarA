package resol.VillarA;
import java.util.Scanner;
public class Ejercicio8 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Litros en el depósito: ");
        double litros = sc.nextDouble();

        double normal = recorrerNormal(litros);
        double desigual = recorrerDesigual(litros);

        System.out.println("Puede recorrer " + normal + " km en carretera normal.");
        System.out.println("Puede recorrer " + desigual + " km en carretera desigual.");
    }

    public static double recorrerNormal(double litros) {
        return litros * 100 / 8;
    }

    public static double recorrerDesigual(double litros) {
        return litros * 100 / (8 * 1.15);
    }
}
