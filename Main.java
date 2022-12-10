import moduloReg.Ubicacion;

import java.util.ArrayList;
import java.util.Scanner;

import moduloReg.Libro;

public class Main
{
    // Variable que obtiene todo lo ingresado por consola
    private static final Scanner res = new Scanner(System.in);

    //Array que almacena todos los libros de la sesión
    private static final ArrayList<Libro> Books = new ArrayList<Libro>();

    //Menu para administrar la creación de una entidad ubicacion
    public static Ubicacion UbiCreation(String nombreLib)
    {
        final int piso;
        final int posi1;
        final int posi2;
        System.out.print("Ingrese los datos de la ubicacion para el libro '"+nombreLib+"'\nNúmero de piso:\n>");
        int temp2;
        try{
            temp2 = Integer.parseInt(res.nextLine());
        } catch (Exception e) {
            temp2 = 0;
        }
        piso = temp2;
        System.out.print("Piso ingresado es: "+piso+"\nIngrese pasillo:\n>");
        String npasi = res.nextLine();
        System.out.print("Pasillo ingresado es: "+npasi+"\nIngrese estante:\n>");
        String estante = res.nextLine();
        System.out.print("Estante ingresado es: "+estante+"\nIngrese Posicion X:\n>");
        int temp3;
        int temp4;
        try {
            temp3 = Integer.parseInt(res.nextLine());
        } catch (Exception e) {
            temp3 = 0;
        }
        posi1 = temp3;
        System.out.print("Posición X ingresada es: "+posi1+"\nIngrese Posicion Y:\n>");
        try {
            temp4 = Integer.parseInt(res.nextLine());
        } catch (Exception e) {
            temp4 = 0;
        }
        posi2 = temp4;
        System.out.print("Posición Y ingresada es: "+posi2+"\n");
        Ubicacion ubi = new Ubicacion(piso, npasi, estante, posi1, posi2);
        System.out.print(ubi.getUbicacion());
        return ubi;
    }

    //Menu para administrar la creación de un libro
    public static Libro bookCreation()
    {
        final int paginas;
        System.out.print("****[CREACION DE LIBRO]****\n\nIngrese el título para el nuevo libro\n>");
        String nombrelibro = res.nextLine();
        System.out.print("\nNombre ingresado: "+nombrelibro+"\nIngrese los autores para el nuevo libro, separados por guíon (Ejemplo: Autor 1 - Autor 2)\n>");
        String autores = res.nextLine();
        System.out.print("\nAutores ingresados: "+autores+"\nIngrese la fecha de publicación para '"+nombrelibro+"' (Ejemplo: <dia>/<mes>/<año>)\n>");
        String fecha = res.nextLine();
        System.out.print("\nFecha ingresada: "+fecha+"\nIngrese la cantidad de paginas para '"+nombrelibro+"'\n>");
        int temp;
        try{
            temp = Integer.parseInt(res.nextLine());
        } catch (Exception e) {
            temp = 0;
        }
        paginas = temp;
        System.out.print("\nPaginas ingresadas: "+paginas+"\nIngrese la editorial para '"+nombrelibro+"'\n>");
        String editorial = res.nextLine();
        System.out.print("\nEditorial ingresada: "+editorial+"\nIngrese el género para '"+nombrelibro+"'\n>");
        String genero = res.nextLine();
        System.out.print("\nGénero ingresado: "+genero+"\nIngrese el ISBN para '"+nombrelibro+"'\n>");
        String isbn = res.nextLine();
        Ubicacion ubicacionLibro = UbiCreation(nombrelibro);
        System.out.print("\nIngrese el estado para '"+nombrelibro+"'\n>");
        String estado = res.nextLine();
        System.out.print("\nEstado ingresado: "+estado+"\nIngrese descripción para '"+nombrelibro+"'\n>");
        String descripcion = res.nextLine();
        System.out.println("\nDescripción ingresada:"+descripcion);
        Libro librores = new Libro(nombrelibro,autores,fecha,paginas,editorial,genero,isbn,ubicacionLibro,estado,descripcion);
        System.out.println("\n\n****[LIBRO "+nombrelibro+" CREADO]****\n\n");
        return librores;
    }

    //Menu para administrar la seleccion de un libro para visualizar
    public static void buscarLibro()
    {
        final int libroSel;
        System.out.print("****[BUSQUEDA DE LIBRO]*****\nSeleccione como desea buscar el libro:\n1. Por Titulo\n2. Por Autor\n3. Por ISBN"+"\n\n>");
        int eleccion = 0;
        while(eleccion < 1 || eleccion > 3)
        {
            try{
                eleccion = Integer.parseInt(res.nextLine());
            }catch(Exception e){
                System.out.println("\nERROR: Ingrese un valor numérico\n");
                eleccion = -1;
            }
            if(eleccion < 1 || eleccion > 3)
            {
                System.out.print("****[BUSQUEDA DE LIBRO]*****\nSeleccione como desea buscar el libro:\n1. Por Titulo\n2. Por Autor\n3. Por ISBN"+"\n\n>");
            }
        }
        ArrayList<Integer> found = new ArrayList<Integer>();
        
        switch(eleccion){
            case 1:{
                System.out.print("\nEscriba el nombre del libro para buscar (Enter para verlos todos):\n>");
                String nombreL = res.nextLine();
                for(int i = 0; i<Books.size(); i++ ){
                    if (Books.get(i).getTitulo().contains(nombreL)){
                        found.add(i);
                    }
                }
                break;
            }

            case 2:{
                System.out.print("\nEscriba el Autor del libro para buscar (Enter para verlos todos):\n>");
                String autorL = res.nextLine();
                for(int i = 0; i<Books.size(); i++ ){
                    if (Books.get(i).getAutores().contains(autorL)){
                        found.add(i);
                    }
                }
                break;
            }

            case 3:{
                System.out.print("\nEscriba el ISBN del libro para buscar (Enter para verlos todos):\n>");
                String isbnL = res.nextLine();
                for(int i = 0; i<Books.size(); i++ ){
                    if (Books.get(i).getIsbn().contains(isbnL)){
                        found.add(i);
                    }
                }
                break;
            }
        }
        if(found.size() == 0){
            System.out.println("\nNo se encontró un libro - Por favor intente de nuevo\n");
            return;
        }
        System.out.println("\nLibros encontrados:\n");
        for(int i = 0 ; i<found.size(); i++){
            System.out.println("\n"+i+".-"+Books.get(found.get(i)).getTitulo()+"\n");
        }
        System.out.print("Seleccione el numero con el libro deseado para ver sus datos:\n>");
        int temp5 = -1;
        while(temp5 < 0 || temp5 > (found.size()-1)){
            try{
                temp5 = Integer.parseInt(res.nextLine());
            }catch(Exception e){
                System.out.println("\nERROR: Ingrese un valor numérico\n");
                temp5 = -1;
            }
            if(temp5 < 0 || temp5 > (found.size()-1)){
                System.out.print("Seleccione el numero con el libro deseado para ver sus datos:\n>");
            }
        }
        libroSel = temp5;
        System.out.println("****[DATOS DEL LIBRO]****");
        System.out.println("Titulo: "+Books.get(found.get(libroSel)).getTitulo());
        System.out.println("Autores: "+Books.get(found.get(libroSel)).getAutores());
        System.out.println("Fecha Edición: "+Books.get(found.get(libroSel)).getFecha());
        System.out.println("Cantidad de paginas: "+Books.get(found.get(libroSel)).getPaginas());
        System.out.println("Editorial: "+Books.get(found.get(libroSel)).getEditorial());
        System.out.println("Genero: "+Books.get(found.get(libroSel)).getGenero());
        System.out.println("ISBN: "+Books.get(found.get(libroSel)).getIsbn());
        System.out.println("Ubicación: "+Books.get(found.get(libroSel)).getUbicacion().getUbicacion());
        System.out.println("Estado: "+Books.get(found.get(libroSel)).getEstado());
        System.out.println("Descripción: "+Books.get(found.get(libroSel)).getDescripcion());
        return;
    }

    //Menu para administrar la seleccion de un libro para trabajar (Editar o eliminar)
    public static int buscarLibroSel()
    {
        final int libroSel;
        System.out.print("****[BUSQUEDA DE LIBRO]*****\nSeleccione como desea buscar el libro a seleccionar:\n1. Por Titulo\n2. Por Autor\n3. Por ISBN"+"\n\n>");
        int eleccion = 0;
        while(eleccion < 1 || eleccion > 3)
        {
            try{
                eleccion = Integer.parseInt(res.nextLine());
            }catch(Exception e){
                System.out.println("\nERROR: Ingrese un valor numérico\n");
                eleccion = -1;
            }
            if(eleccion < 1 || eleccion > 3)
            {
                System.out.print("****[BUSQUEDA DE LIBRO]*****\nSeleccione como desea buscar el libro:\n1. Por Titulo\n2. Por Autor\n3. Por ISBN"+"\n\n>");
            }
        }
        ArrayList<Integer> found = new ArrayList<Integer>();
        switch(eleccion){
            case 1:{
                System.out.print("\nEscriba el nombre del libro para buscar (Enter para verlos todos):\n>");
                String nombreL = res.nextLine();
                for(int i = 0; i<Books.size(); i++ ){
                    if (Books.get(i).getTitulo().contains(nombreL)){
                        found.add(i);
                    }
                }
                break;
            }

            case 2:{
                System.out.print("\nEscriba el Autor del libro para buscar (Enter para verlos todos):\n>");
                String autorL = res.nextLine();
                for(int i = 0; i<Books.size(); i++ ){
                    if (Books.get(i).getAutores().contains(autorL)){
                        found.add(i);
                    }
                }
                break;
            }

            case 3:{
                System.out.print("\nEscriba el ISBN del libro para buscar (Enter para verlos todos):\n>");
                String isbnL = res.nextLine();
                for(int i = 0; i<Books.size(); i++ ){
                    if (Books.get(i).getIsbn().contains(isbnL)){
                        found.add(i);
                    }
                }
                break;
            }
        }
        if(found.size() == 0){
            System.out.println("\nNo se encontró un libro - Por favor intente de nuevo\n");
            return -1;
        }
        System.out.println("\nLibros encontrados:\n");
        for(int i = 0 ; i<found.size(); i++){
            System.out.println("\n"+i+".-"+Books.get(found.get(i)).getTitulo()+"\n");
        }
        System.out.print("Seleccione el numero con el libro deseado para utilizar:\n>");
        int temp5 = -1;
        while(temp5 < 0 || temp5 > (found.size()-1)){
            try{
                temp5 = Integer.parseInt(res.nextLine());
            }catch(Exception e){
                System.out.println("\nERROR: Ingrese un valor numérico\n");
                temp5 = -1;
            }
            if(temp5 < 0 || temp5 > (found.size()-1)){
                System.out.println("\nLibros encontrados:\n");
                for(int i = 0 ; i<found.size(); i++)
                {
                    System.out.println("\n"+i+".-"+Books.get(found.get(i)).getTitulo()+"\n");
                }
                System.out.print("\nSeleccione el numero con el libro deseado para utilizar:\n>");
            }
        }
        libroSel = temp5;
        return found.get(libroSel);
    }

    //Menu para administrar la obtención de un input en string
    public static String getInputStr(String nombreCampo, String oldValue)
    {
        System.out.print("\nIngrese el nuevo valor para "+nombreCampo+"\nValor Actual: '"+oldValue+"'\n>");
        return res.nextLine();
    }

    //Menu para administrar la obtencion de un input en entero
    public static int getInputInt(String nombreCampo, int oldValue)
    {
        int resultado;
        System.out.print("\nIngrese el nuevo valor para "+nombreCampo+"\nValor Actual: '"+oldValue+"'\n>");
        try{
            resultado = Integer.parseInt(res.nextLine());
        }catch(Exception e){
            System.out.println("\nERROR: Ingrese un valor numérico - Se aplica por defecto -1\n");
            resultado = -1;
        }
        return resultado;
    }

    //Menu para administrar la edición de un libro
    public static void editBook()
    {
        int libroeleg = buscarLibroSel();
        if(libroeleg == -1){
            return;
        }
        System.out.print("Seleccione campo a editar para libro '"+Books.get(libroeleg).getTitulo()+"':\n1.Titulo\n2.Autores\n3.Fecha\n4.Paginas\n5.Editorial\n6.Género\n7.ISBN\n8.Ubicación\n9.Estado\n10.Descripción\n\n>");
        int temp5 = -1;
        while(temp5 < 1 || temp5 > 10)
        {
            try{
                temp5 = Integer.parseInt(res.nextLine());
            }catch(Exception e){
                System.out.println("\nERROR: Ingrese un valor numérico\n");
                temp5 = -1;
            }
            if(temp5 < 0 || temp5 > 10)
            {
                System.out.print("Seleccione campo a editar para libro '"+Books.get(libroeleg).getTitulo()+"':\n1.Titulo\n2.Autores\n3.Fecha\n4.Paginas\n5.Editorial\n6.Género\n7.ISBN\n8.Ubicación\n9.Estado\n10.Descripción\n\n>");
            }
        }
        switch(temp5)
        {
            // Titulo
            case 1:{
                String vc = getInputStr("Título", Books.get(libroeleg).getTitulo());
                Books.get(libroeleg).setTitulo(vc);
                break;
            }
            // Autores
            case 2:{
                String vc = getInputStr("Autores", Books.get(libroeleg).getAutores());
                Books.get(libroeleg).setAutores(vc);
                break;
            }
            // Fecha
            case 3:{
                String vc = getInputStr("Fecha", Books.get(libroeleg).getFecha());
                Books.get(libroeleg).setFecha(vc);
                break;
            }
            // Paginas
            case 4:{
                int vc = getInputInt("Paginas", Books.get(libroeleg).getPaginas());
                Books.get(libroeleg).setPaginas(vc);
                break;
            }
            // Editorial
            case 5:{
                String vc = getInputStr("Editorial", Books.get(libroeleg).getEditorial());
                Books.get(libroeleg).setEditorial(vc);
                break;
            }
            // Género
            case 6:{
                String vc = getInputStr("Género", Books.get(libroeleg).getGenero());
                Books.get(libroeleg).setGenero(vc);
                break;
            }  
            // ISBN
            case 7:{
                String vc = getInputStr("ISBN", Books.get(libroeleg).getIsbn());
                Books.get(libroeleg).setIsbn(vc);
                break;
            }
            // Ubicacion
            case 8:{
                Ubicacion vc = UbiCreation(Books.get(libroeleg).getTitulo());
                Books.get(libroeleg).setUbicacion(vc);
                break;
            }
            // Estado
            case 9:{
                String vc = getInputStr("Estado", Books.get(libroeleg).getEstado());
                Books.get(libroeleg).setEstado(vc);
                break;
            }
            // Descripcion
            case 10:{
                String vc = getInputStr("Descripción", Books.get(libroeleg).getDescripcion());
                Books.get(libroeleg).setDescripcion(vc);
                break;
            }

        }
        System.out.println("****[LIBRO CAMBIADO]****");
        System.out.println("Titulo: "+Books.get(libroeleg).getTitulo());
        System.out.println("Autores: "+Books.get(libroeleg).getAutores());
        System.out.println("Fecha Edición: "+Books.get(libroeleg).getFecha());
        System.out.println("Cantidad de paginas: "+Books.get(libroeleg).getPaginas());
        System.out.println("Editorial: "+Books.get(libroeleg).getEditorial());
        System.out.println("Genero: "+Books.get(libroeleg).getGenero());
        System.out.println("ISBN: "+Books.get(libroeleg).getIsbn());
        System.out.println("Ubicación: "+Books.get(libroeleg).getUbicacion().getUbicacion());
        System.out.println("Estado: "+Books.get(libroeleg).getEstado());
        System.out.println("Descripción: "+Books.get(libroeleg).getDescripcion());
        return;
    }

    //Menu para administrar el eliminiado de un libro
    public static void deleteBook()
    {
        int libroeleg = buscarLibroSel();
        if(libroeleg == -1){
            return;
        }
        System.out.print("Esta seguro que desea eliminar el libro '"+Books.get(libroeleg).getTitulo()+"'?\n1. SI\n2. NO\n>");
        int temp6 = -1;
        while(temp6 < 1 || temp6 > 2)
        {
            try{
                temp6 = Integer.parseInt(res.nextLine());
            }catch(Exception e){
                System.out.println("\nERROR: Ingrese un valor numérico\n");
                temp6 = -1;
            }
            if(temp6 < 1 || temp6 > 2)
            {
                System.out.print("Esta seguro que desea eliminar el libro '"+Books.get(libroeleg).getTitulo()+"'?\n1. SI\n2. NO\n>");
            }
        }
        switch(temp6){
            case 1:{
                Books.remove(libroeleg);
                System.out.println("\nLibro eliminado\n");
                return;
            } case 2: {
                System.out.println("\nOperación cancelada\n");
                return;
            }
        }
    }

    //Menú principal para la ejecucion del programa
    public static void main(String[] args)
    {
        Ubicacion ubitest = new Ubicacion(2,"2A","J23",1,2);
        Libro libro = new Libro("Libro de Prueba 1", "Anon1 - Anon2", "01/12/2022", 69, "USM SJ", "Terror", "6969-6969-6969", ubitest, "disponible", "Una novela llena de suspenso y terror, obervando las mayores tragedias de este semestre!");
        Libro libro2 = new Libro("Libro de Prueba 2", "Anon3", "22/12/2022", 22, "USM SJ", "Ciencia Ficción", "1111-2222-3333", ubitest, "prestado", "Prueba");
        Books.add(libro);
        Books.add(libro2);
        String comando = "-1";
        while(comando != "salida")
        {
            System.out.print("BIENVENIDO AL SISTEMA DE BIBLIOTECA\nLibros actuales en sistema: "+Books.size()+"\n\n¿Qué desea hacer?\n1.Crear Libro\n2.Ver Libro\n3.Editar Libro\n4.Borrar Libro\n5.Salir del sistema\n\n>");
            int temp7 = -1;
            //temp7 = Integer.parseInt(res.nextLine());
            while(temp7 < 1 || temp7 > 5)
            {
                try{
                    temp7 = Integer.parseInt(res.nextLine());
                }catch(Exception e){
                    System.out.println("\nERROR: Ingrese un valor numérico\n");
                    temp7 = -1;
                }
                if(temp7 < 1 || temp7 > 5)
                {
                    System.out.print("BIENVENIDO AL SISTEMA DE BIBLIOTECA\nLibros actuales en sistema: "+Books.size()+"\n\n¿Qué desea hacer?\n1.Crear Libro\n2.Ver Libro\n3.Editar Libro\n4.Borrar Libro\n5.Salir del sistema\n\n>");
                }
            }
            switch(temp7)
            {
                case 1:{
                    Books.add(bookCreation());
                    break;
                }
                case 2: {
                    if(Books.size() == 0){
                        System.out.println("La base de datos de libros esta vacía! - Debe crear un libro primero para usar esta función");
                        break;
                    } else {
                        buscarLibro();
                        break;
                    }
                }
                case 3: {
                    if(Books.size() == 0){
                        System.out.println("La base de datos de libros esta vacía! - Debe crear un libro primero para usar esta función");
                        break;
                    } else {
                        editBook();
                        break;
                    }
                }
                case 4: {
                    if(Books.size() == 0){
                        System.out.println("La base de datos de libros esta vacía! - Debe crear un libro primero para usar esta función");
                        break;
                    } else {
                        deleteBook();
                        break;
                    }
                }
                case 5: {
                    System.out.println("Muchas gracias por usar el sistema");
                    comando = "salida";
                    break;
                }
            }
        }
    }
}