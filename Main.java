import moduloReg.Ubicacion;

import java.util.ArrayList;

import moduloReg.Libro;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Libro> Books = new ArrayList<Libro>();
    
        //Crear objeto de clase Ubicacion
        Ubicacion ubitest = new Ubicacion(1, "2B", "J23", 10, 22);
        System.out.println(ubitest.getUbicacion());
        System.out.println("EXITO");
        
        //Crear objeto libro
        Libro librotest = new Libro("50 sombras de Pruebas de Software", "Anonimo", "1 de Dic", 69, "USM SJ", "Terror", "6969-6969-6969", ubitest, "disponible", "Una novela llena de suspenso y terror, obervando las mayores tragedias de este semestre!");
        System.out.println(librotest.getTitulo());
        System.out.println(librotest.getAutores());
        System.out.println(librotest.getFecha());
        System.out.println(librotest.getPaginas());
        System.out.println(librotest.getEditorial());
        System.out.println(librotest.getGenero());
        System.out.println(librotest.getIsbn());
        System.out.println(librotest.getUbicacion().getUbicacion());
        System.out.println(librotest.getEstado());
        System.out.println(librotest.getDescripcion());

        Books.add(librotest);

        System.out.println(Books.get(0).getUbicacion().getUbicacion());
    }
}