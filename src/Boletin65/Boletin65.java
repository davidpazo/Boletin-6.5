package Boletin65;

public class Boletin65 {

    public static void main(String[] args) {
        Autor autor = new Autor("Paul", "Auster");
        Libro libro = new Libro("La trilogía de Nueva York", autor);
        System.out.println(libro.getTitulo() + " de " + (libro.getAutor()).toString());
    }
}
