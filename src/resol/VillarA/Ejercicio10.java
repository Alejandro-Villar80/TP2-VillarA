package resol.VillarA;
import java.util.Scanner;
public class Ejercicio10 {
    public static void ejecutar(){
        Scanner sc = new Scanner(System.in);

        int tam = 10;
        String[] nombres = new String[tam];
        double[] notas = new double[tam];
        String[] resultados = new String[tam];

        for (int i = 0; i < tam; i++) {
            System.out.print("Nombre del alumno " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            double nota;
            do {
                System.out.print("Nota (0-10): ");
                nota = sc.nextDouble();
                sc.nextLine(); // limpiar buffer
            } while (nota < 0 || nota > 10);

            notas[i] = nota;
            resultados[i] = calificar(nota);
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < tam; i++) {
            System.out.println(nombres[i] + " - " + notas[i] + " - " + resultados[i]);
        }
    }

    public static String calificar(double nota) {
        if (nota < 5) return "suspenso";
        else if (nota < 7) return "bien";
        else if (nota < 9) return "notable";
        else return "sobresaliente";
    }
}
