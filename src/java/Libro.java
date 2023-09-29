package java;

/**
 * @author javier garcia
 * Clase que representa un libro en la biblioteca.
 */
public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private EstadoLibro estado;

    /**
     * Constructor de la clase Libro.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param ISBN El número ISBN del libro.
     * @param estado El estado del libro (disponible o reservado).
     */
    public Libro(String titulo, String autor, String ISBN, EstadoLibro estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.estado = estado;
    }

    /**
     * Obtiene el título del libro.
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el autor del libro.
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Obtiene el número ISBN del libro.
     * @return El número ISBN del libro.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Obtiene el estado del libro (disponible o reservado).
     * @return El estado del libro.
     */
    public EstadoLibro getEstado() {
        return estado;
    }

    /**
     * Establece el estado del libro (disponible o reservado).
     * @param estado El nuevo estado del libro.
     */
    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }

    /**
     * Convierte el objeto Libro en una representación de cadena de texto.
     * @return Una cadena de texto que representa el libro.
     */
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", estado=" + estado +
                '}';
    }
}