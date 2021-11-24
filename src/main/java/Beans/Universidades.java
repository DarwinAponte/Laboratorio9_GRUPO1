package Beans;

public class Universidades {
    private int numeroAlumnos;
    private String nombre;
    private int ranking;
    private String foto;
    private int idpaises;

    public Universidades(int idpaises, String nombre, String foto, int ranking, int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
        this.nombre = nombre;
        this.ranking = ranking;
        this.foto = foto;
        this.idpaises=idpaises;
    }


    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getIdpaises() {
        return idpaises;
    }

    public void setIdpaises(int idpaises) {
        this.idpaises = idpaises;
    }
}
