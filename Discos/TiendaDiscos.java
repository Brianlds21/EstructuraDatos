import java.util.Scanner;

public class TiendaDiscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] titulos = new String[50];
        String[] artistas = new String[50];
        double[] precios = new double[50];
        int numeroDiscos;
        double total = 0;

        System.out.println("Bienvenido a la Tienda de Discos");

        System.out.println("Digite el número de discos: ");
        numeroDiscos = sc.nextInt();

        for (int i = 0; i < numeroDiscos; i++) {
            System.out.println("Digite el título del disco " + (i + 1) + ": ");
            titulos[i] = sc.next();

            System.out.println("Digite el nombre del artista o banda: ");
            artistas[i] = sc.next();

            System.out.println("Digite el precio del disco: ");
            precios[i] = sc.nextDouble();
        }

        System.out.println("----- Factura -----");
        
        for (int i = 0; i < numeroDiscos; i++) {
            System.out.println("Disco " + (i + 1) + ":");
            System.out.println("Título: " + titulos[i]);
            System.out.println("Artista: " + artistas[i]);
            System.out.println("Precio: $" + precios[i]);
            System.out.println("-------------------");

            total += precios[i];
        }

        System.out.println("Total a pagar: $" + total);
    }
}
