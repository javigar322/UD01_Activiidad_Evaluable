/**
 * @author javier garcia
 * Clase que representa una reserva de un libro en la biblioteca.
 * @class
 */
class Reserva {
  /**
   * Constructor de la clase Reserva.
   * @constructor
   * @param {Usuario} usuario - El usuario que realiza la reserva.
   * @param {Libro} libro - El libro que se reserva.
   * @param {Date} fechaReserva - La fecha en que se realiza la reserva.
   * @param {Date} fechaDevolucion - La fecha estimada de devolución del libro.
   */
  constructor(usuario, libro, fechaReserva, fechaDevolucion) {
    this.usuario = usuario;
    this.libro = libro;
    this.fechaReserva = fechaReserva;
    this.fechaDevolucion = fechaDevolucion;
  }

  /**
   * Obtiene el usuario que realizó la reserva.
   * @returns {Usuario} El usuario de la reserva.
   */
  getUsuario() {
    return this.usuario;
  }

  /**
   * Obtiene el libro que se reservó.
   * @returns {Libro} El libro reservado.
   */
  getLibro() {
    return this.libro;
  }

  /**
   * Obtiene la fecha en que se realizó la reserva.
   * @returns {Date} La fecha de reserva.
   */
  getFechaReserva() {
    return this.fechaReserva;
  }

  /**
   * Obtiene la fecha estimada de devolución del libro.
   * @returns {Date} La fecha de devolución estimada.
   */
  getFechaDevolucion() {
    return this.fechaDevolucion;
  }

  /**
   * Convierte el objeto Reserva en una representación de cadena de texto.
   * @returns {string} Una cadena de texto que representa la reserva.
   */
  toString() {
    return (
      `Reserva { Usuario: ${this.usuario.getNombre()}, Libro: ${this.libro.getTitulo()}, ` +
      `Fecha de Reserva: ${this.fechaReserva}, Fecha de Devolución: ${this.fechaDevolucion} }`
    );
  }
}

// Exporta la clase para que pueda ser utilizada en otros módulos si es necesario.
export default Reserva;
