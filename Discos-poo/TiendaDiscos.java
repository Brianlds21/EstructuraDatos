import java.util.Scanner;

public class TiendaDiscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDiscos;
        double total = 0;

        System.out.println("Bienvenido a la Tienda de Discos");

        System.out.println("Digite el número de discos: ");
        numeroDiscos = sc.nextInt();

        Disco[] discos = new Disco[numeroDiscos];

        for (int i = 0; i < numeroDiscos; i++) {
            System.out.println("Digite el título del disco " + (i + 1) + ": ");
            String titulo = sc.next();

            System.out.println("Digite el nombre del artista o banda: ");
            String artista = sc.next();

            System.out.println("Digite el precio del disco: ");
            double precio = sc.nextDouble();

            discos[i] = new Disco(titulo, artista, precio);
        }

        System.out.println("----- Factura -----");
        
        for (int i = 0; i < numeroDiscos; i++) {
            Disco disco = discos[i];
            System.out.println("Disco " + (i + 1) + ":");
            System.out.println("Título: " + disco.getTitulo());
            System.out.println("Artista: " + disco.getArtista());
            System.out.println("Precio: $" + disco.getPrecio());
            System.out.println("-------------------");

            total += disco.getPrecio();
        }

        System.out.println("Total a pagar: $" + total);
    }
}

