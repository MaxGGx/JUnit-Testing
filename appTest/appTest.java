package appTest;

import static org.junit.Assert.*;
import org.junit.*;
import moduloReg.Libro;
import moduloReg.Ubicacion;


public class appTest {
    @BeforeClass
    public static void RunBeforeClass(){
        System.out.println("Inicio de suite de pruebas para clase Ubicacion y Libro");
    }

    @Before
    public void runBeforeEachTest(){
        System.out.println("\n\n======== Ejecutando nueva prueba ========\n\n");
    }

    @Test
    public void crearUbicacion()
    {
        //Crear objeto ubicacion para libro
        Ubicacion ubitest = new Ubicacion(2,"2A","J23",1,2);
        assertTrue( ubitest.getPiso() == 2 );
        assertTrue( ubitest.getPasillo() == "2A" );
        assertTrue( ubitest.getEstante() == "J23" );
        int[] a = new int[2];
        a[0] = 1;
        a[1] = 2;
        assertArrayEquals( a, ubitest.getPosicion());
    }

    @Test
    //Verificar que se puedan editar los campos de entero dentro de la clase Ubicacion
    public void editarUbicacionInt()
    {
        //Crear objeto ubicacion para libro
        Ubicacion ubitest = new Ubicacion(2,"2A","J23",1,2);
        assertTrue( ubitest.getPiso() == 2 );
        //Cambiar piso
        ubitest.setPiso(3);
        assertTrue( ubitest.getPiso() == 3 );
    }

    @Test
    //Verificar que se puedan editar los campos de texto dentro de la clase Ubicacion
    public void editarUbicacionStr()
    {
        //Crear objeto ubicacion para libro
        Ubicacion ubitest = new Ubicacion(2,"2A","J23",1,2);
        assertTrue( ubitest.getPasillo() == "2A" );
        //Cambiar pasillo
        ubitest.setPasillo("3A");
        assertTrue( ubitest.getPasillo() == "3A");
    }

    @Test
    //Verificar que se pueda crear un libro
    public void crearLibro()
    {
        //Crear objeto ubicacion para libro
        Ubicacion ubitest = new Ubicacion(2,"2A","J23",1,2);
        //Crear objeto libro
        Libro librotest = new Libro("50 sombras de Pruebas de Software", "Anonimo", "01/12/22", 69, "USM SJ", "Terror", "6969-6969-6969", ubitest, "disponible", "Una novela llena de suspenso y terror, obervando las mayores tragedias de este semestre!");
        assertTrue( librotest.getTitulo() == "50 sombras de Pruebas de Software" );
        assertTrue( librotest.getAutores() == "Anonimo");
        assertTrue( librotest.getFecha() == "01/12/22");
        assertTrue( librotest.getPaginas() == 69);
        assertTrue( librotest.getEditorial() == "USM SJ");
        assertTrue( librotest.getGenero() == "Terror");
        assertTrue( librotest.getIsbn() == "6969-6969-6969");
        assertTrue( librotest.getEstado() == "disponible");
        assertTrue( librotest.getDescripcion() == "Una novela llena de suspenso y terror, obervando las mayores tragedias de este semestre!");
    }

    @Test
    //Verificar que se puedan editar los campos de texto dentro de la clase libro
    public void editarLibroStr()
    {
        //Crear objeto ubicacion para libro
        Ubicacion ubitest = new Ubicacion(2,"2A","J23",1,2);
        //Crear objeto libro
        Libro librotest = new Libro("50 sombras de Pruebas de Software", "Anonimo", "01/12/22", 69, "USM SJ", "Terror", "6969-6969-6969", ubitest, "disponible", "Una novela llena de suspenso y terror, obervando las mayores tragedias de este semestre!");
        //Verificar titulo anterior - cambiar valor - volver a verificar
        assertTrue( librotest.getTitulo() == "50 sombras de Pruebas de Software" );
        librotest.setTitulo("51 sombras de Pruebas de Software");
        assertTrue( librotest.getTitulo() == "51 sombras de Pruebas de Software" );
    }

    @Test
    //Verificar que se puedan editar los campos de entero dentro de la clase libro
    public void editarLibroInt()
    {
        //Crear objeto ubicacion para libro
        Ubicacion ubitest = new Ubicacion(2,"2A","J23",1,2);
        //Crear objeto libro
        Libro librotest = new Libro("50 sombras de Pruebas de Software", "Anonimo", "01/12/22", 69, "USM SJ", "Terror", "6969-6969-6969", ubitest, "disponible", "Una novela llena de suspenso y terror, obervando las mayores tragedias de este semestre!");
        //Verificar titulo anterior - cambiar valor - volver a verificar
        assertTrue( librotest.getPaginas() == 69 );
        librotest.setPaginas(70);
        assertTrue( librotest.getPaginas() == 70 );
    }

}
