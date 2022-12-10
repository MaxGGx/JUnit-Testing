package moduloReg;

// Clase que almacena la Ubicacion del libro
public class Ubicacion
{
    private int pisoBiblioteca;
    private String pasillo;
    private String estante;
    private int[] posicion = new int[2];

    // constructor de la clase
    public Ubicacion(int piso, String npasillo, String nestante, int posicion1, int posicion2)
    {
        pisoBiblioteca = piso;
        pasillo = npasillo;
        estante = nestante;
        posicion[0] = posicion1;
        posicion[1] = posicion2;
    }

    //Obtiene la ubicacion en formato string
    public String getUbicacion()
    {
        return ("La ubicación es en el piso: "+pisoBiblioteca+"\nPasillo:"+pasillo+"\nEstante:"+estante+"\nPosición:"+posicion[0]+" , "+posicion[1]+"\n");
    }

    //Configura la ubicación a partir del reingreso de todas las variables
    public void setUbicacion(int piso, String npasillo, String nestante, int posicion1, int posicion2)
    {
        pisoBiblioteca = piso;
        pasillo = npasillo;
        estante = nestante;
        posicion[0] = posicion1;
        posicion[1] = posicion2;
    }

    //Cambia el valor para el piso del libro
    public void setPiso(int piso)
    {
        pisoBiblioteca = piso;
    }
    
    //Obtiene el valor para el piso del libro
    public int getPiso()
    {
        return pisoBiblioteca;
    }
    
    //Cambia el valor para el pasillo del libro
    public void setPasillo(String npasillo)
    {
        pasillo = npasillo;
    }
    
    //Obtiene el valor para el pasillo del libro
    public String getPasillo()
    {
        return pasillo;
    }
    
    //Cambia el valor para el estante del pasillo
    public void setEstante(String nestante)
    {
        estante = nestante;
    }
    
    //Obtiene el valor para el estante del libro
    public String getEstante()
    {
        return estante;
    }
    
    //Cambia el valor para la posicion del libro
    public void setPosicion(int posicion1, int posicion2)
    {
        posicion[0] = posicion1;
        posicion[1] = posicion2;
    }
    
    //Obtiene el valor para la posicion del libro
    public int[] getPosicion()
    {
        return posicion;
    }

}