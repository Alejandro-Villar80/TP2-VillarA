package resol.VillarA;
import java.util.Scanner;
public class Ejercicio9 {
    public static void ejecutar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el monto: ");
        int monto = sc.nextInt();

        int[] billetes = {20000, 10000, 1000, 500, 200, 100, 50, 20, 10};
        for (int b : billetes) {
            int cantidad = monto / b;
            monto %= b;
            if (cantidad > 0) {
                System.out.println("Billetes de $" + b + ": " + cantidad);
            }
        }
    }
}
