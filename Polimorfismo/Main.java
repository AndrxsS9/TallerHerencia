import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Publicacion> lista = new ArrayList<>();

        Libro libro1 = new Libro(200, 2020, "Java Básico", 50000);
        Disco disco1 = new Disco(60.5f, "Grandes Éxitos", 30000);
        Video video1 = new Video("Película", 20000, 2.5f, Video.Idioma.ESPANOL);

        lista.add(libro1);
        lista.add(disco1);
        lista.add(video1);

        for (Publicacion p : lista) {
            System.out.println(p);
        }
    }
}