import moduloReg.Ubicacion;
import moduloReg.Libro;

public class Main
{
    public static void main(String[] args)
    {
        int v1 = 1;
        String v2 = "2B";
        String v3 = "J23";
        int v4 = 10;
        int v5 = 22;
        //Crear objeto de clase Ubicacion
        Ubicacion ubitest = new Ubicacion(v1, v2, v3, v4, v5);
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
        
    }
}