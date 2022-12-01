package moduloReg;

import moduloReg.Ubicacion;

// Clase que almacena un objeto del tipo Libro
public class Libro
{
    private String titulo;
    private String autores;
    private String fechaEdicion;
    private int numeroPaginas;
    private String editorial;
    private String genero;
    private String isbn;
    private Ubicacion ubicacion;
    private String estado;
    private String descripcion;

    //Constructor de la clase
    public Libro( String ntitulo, String nautores, String fecha, int paginas, String neditorial, String ngenero, String nisbn, Ubicacion ubi, String nestado, String desc)
    {
        titulo = ntitulo;
        autores = nautores;
        fechaEdicion = fecha;
        numeroPaginas = paginas;
        editorial = neditorial;
        genero = ngenero;
        isbn = nisbn;
        ubicacion = ubi;
        estado = nestado;
        descripcion = desc;
    }

    //Obtener titulo del libro
    public String getTitulo()
    {
        return titulo;
    }

    //Cambiar titulo de libro
    public void setTitulo(String ntitulo)
    {
        titulo = ntitulo;
    }

    //Obtener autores del libro
    public String getAutores()
    {
        return autores;
    }

    //Cambiar autores del libro
    public void setAutores(String nautores)
    {
        autores = nautores;
    }

    //Obtener fechaEdicion del libro
    public String getFecha()
    {
        return fechaEdicion;
    }

    //Cambiar fechaEdicion de libro
    public void setFecha(String nfecha)
    {
        fechaEdicion = nfecha;
    }

    //Obtener numero de paginas de libro
    public int getPaginas()
    {
        return numeroPaginas;
    }

    //Cambia el valor de paginas
    public void setPaginas( int npaginas)
    {
        numeroPaginas = npaginas;
    }

    //Obtiene la editorial del libro
    public String getEditorial()
    {
        return editorial;
    }

    //Cambia la editorial del libro
    public void setEditorial(String neditorial)
    {
        editorial = neditorial;
    }

    //Obtiene el valor para el genero del libro
    public String getGenero()
    {
        return genero;
    }

    //Cambia el valor para el genero del libro
    public void setGenero(String ngenero)
    {
        genero = ngenero;
    }

    //Obtiene el valor para el isbn del libro
    public String getIsbn()
    {
        return isbn;
    }

    //Cambia el valor para el isbn del libro
    public void setIsbn(String nisbn)
    {
        isbn = nisbn;
    }

    //Obtiene el valor para la ubicacion del libro
    public Ubicacion getUbicacion()
    {
        return ubicacion;
    }

    //Cambia el valor para la ubicacion del libro
    public void setUbicacion(Ubicacion nubi)
    {
        ubicacion = nubi;
    }

    //Obtiene el valor para el estado
    public String getEstado()
    {
        return estado;
    }

    //Cambia el valor para el estado
    public void setEstado(String nestado)
    {
        estado = nestado;
    }

    //Obtiene el valor para la descripcion
    public String getDescripcion()
    {
        return descripcion;
    }

    //Cambia el valor para la descripcion
    public void setDescripcion(String ndesc)
    {
        descripcion = ndesc;
    }

}