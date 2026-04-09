public class Libro extends Publicacion {

    private int numeroPaginas;
    private int anioPublicacion;

    public Libro() {
        super();
    }

    public Libro(int numeroPaginas, int anioPublicacion, String titulo, double precio) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
        this.anioPublicacion = anioPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + getTitulo() + '\'' +
                ", precio=" + getPrecio() +
                ", numeroPaginas=" + numeroPaginas +
                ", anioPublicacion=" + anioPublicacion +
                '}';
    }
}