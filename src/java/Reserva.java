package java;

import java.util.Date;

/**
 * @author javier garcia
 * Clase que representa una reserva de un libro en la biblioteca.
 */
public class Reserva {
    private Usuario usuario;
    private Libro libro;
    private Date fechaReserva;
    private Date fechaDevolucion;

    /**
     * Constructor de la clase Reserva.
     * @param usuario El usuario que realiza la reserva.
     * @param libro El libro que se reserva.
     * @param fechaReserva La fecha en que se realiza la reserva.
     * @param fechaDevolucion La fecha estimada de devolución del libro.
     */
    public Reserva(Usuario usuario, Libro libro, Date fechaReserva, Date fechaDevolucion) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaReserva = fechaReserva;
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * Obtiene el usuario que realizó la reserva.
     * @return El usuario de la reserva.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Obtiene el libro que se reservó.
     * @return El libro reservado.
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Obtiene la fecha en que se realizó la reserva.
     * @return La fecha de reserva.
     */
    public Date getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Obtiene la fecha estimada de devolución del libro.
     * @return La fecha de devolución estimada.
     */
    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Convierte el objeto Reserva en una representación de cadena de texto.
     * @return Una cadena de texto que representa la reserva.
     */
    @Override
    public String toString() {
        return "Reserva{" +
                "usuario=" + usuario.getNombre() +
                ", libro=" + libro.getTitulo() +
                ", fechaReserva=" + fechaReserva +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}