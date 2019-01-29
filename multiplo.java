package multiplo;

import java.util.Scanner;

/**
 *
 * @author Rafathan
 */
public class EjerJava5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a = 0, b = 0, respuesta = 1;
        Scanner reader = new Scanner(System.in);
        boolean error = true;

        while (respuesta == 1) {
            do {
                try {
                    System.out.print("\nDame una cifra: ");
                    a = Integer.parseInt(reader.next());
                    error = false;
                } catch (Exception z) {
                    System.out.println("Opcion incorrecta.");
                    error = true;
                }
            } while (error);
            do {
                try {
                    System.out.print("Dame otra cifra y te dire si " + a + " es multiplo de ella: ");
                    b = Integer.parseInt(reader.next());
                    error = false;
                } catch (Exception x) {
                    System.out.println("Opcion incorrecta.");
                    error = true;
                }
            } while (error);

            if (a % b == 0) {
                System.out.println(a + " es multiplo de " + b);
            } else {
                System.out.println(a + " no es multiplo de " + b);
            }

            System.out.print("\n1-Realizar nueva comprobacion.\n0-Salir.\n");
            do {
                try {
                    System.out.print("Seleccion: ");
                    respuesta = Integer.parseInt(reader.next());
                    error = false;
                } catch (Exception y) {
                    System.out.println("Opcion incorrecta.");
                    error = true;
                }
                if ((respuesta  1)) {
                    System.out.println("Opcion incorrecta.");
                    error = true;
                }
            } while (error);
        }
    }
}
