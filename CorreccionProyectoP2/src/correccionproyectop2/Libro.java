
package correccionproyectop2;

public class Libro {
    private String nombre;
    private String autor;
    private String editorial;
    private int codigo;

    public Libro(){

    }

    public Libro(String nombre, String autor, String editorial, int codigo) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
