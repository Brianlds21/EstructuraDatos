
/**
 * Write a description of class Disco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disco {
    private String titulo;
    private String artista;
    private double precio;

    public Disco(String titulo, String artista, double precio) {
        this.titulo = titulo;
        this.artista = artista;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public double getPrecio() {
        return precio;
    }
}
