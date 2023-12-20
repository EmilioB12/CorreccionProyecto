
package correccionproyectop2;

public class Cliente {
    private String nombre;
    private int edad;
    private String cedula;
    private int numeroUsuario;
    private int numeroLibros;
    public Cliente(){

    }

    public Cliente(String nombre, int edad, String cedula, int numeroUsuario, int numeroLibros) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.numeroUsuario = numeroUsuario;
        this.numeroLibros = numeroLibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public int getNumeroLibros() {
        return numeroLibros;
    }

    public void setNumeroLibros(int numeroLibros) {
        this.numeroLibros = numeroLibros;
    }

}
