public class Propietario {
    private String Nombre;
    private int numCedula;
    private String direccion;

    public Propietario() {
    }
    public Propietario(String nombre, int numCedula, String direccion) {
        Nombre = nombre;
        this.numCedula = numCedula;
        this.direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(int numCedula) {
        this.numCedula = numCedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

