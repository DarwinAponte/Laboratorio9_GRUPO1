package Beans;

public class Participantes {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private int idpaises;


    public Participantes(String nombre, String apellido, int edad, String genero, int idpaises) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.idpaises = idpaises;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdpaises() {
        return idpaises;
    }

    public void setIdpaises(int idpaises) {
        this.idpaises = idpaises;
    }
}
