/**
 * @author javier garcia
 * Clase que representa un libro en la biblioteca.
 * @class
 */
class Libro {
  /**
   * Constructor de la clase Libro.
   * @constructor
   * @param {string} titulo - El título del libro.
   * @param {string} autor - El autor del libro.
   * @param {string} ISBN - El número ISBN del libro.
   * @param {string} estado - El estado del libro (disponible o reservado).
   */
  constructor(titulo, autor, ISBN, estado) {
    this.titulo = titulo;
    this.autor = autor;
    this.ISBN = ISBN;
    this.estado = estado;
  }

  /**
   * Obtiene el título del libro.
   * @returns {string} El título del libro.
   */
  getTitulo() {
    return this.titulo;
  }

  /**
   * Obtiene el autor del libro.
   * @returns {string} El autor del libro.
   */
  getAutor() {
    return this.autor;
  }

  /**
   * Obtiene el número ISBN del libro.
   * @returns {string} El número ISBN del libro.
   */
  getISBN() {
    return this.ISBN;
  }

  /**
   * Obtiene el estado del libro (disponible o reservado).
   * @returns {string} El estado del libro.
   */
  getEstado() {
    return this.estado;
  }

  /**
   * Establece el estado del libro (disponible o reservado).
   * @param {string} estado - El nuevo estado del libro.
   */
  setEstado(estado) {
    this.estado = estado;
  }

  /**
   * Convierte el objeto Libro en una representación de cadena de texto.
   * @returns {string} Una cadena de texto que representa el libro.
   */
  toString() {
    return `Libro { Título: ${this.titulo}, Autor: ${this.autor}, ISBN: ${this.ISBN}, Estado: ${this.estado} }`;
  }
}

// Exporta la clase para que pueda ser utilizada en otros módulos si es necesario.
export default Libro;
