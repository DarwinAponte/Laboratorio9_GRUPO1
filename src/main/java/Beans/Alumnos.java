package Beans;

import javax.sound.midi.Soundbank;

public class Alumnos {
    private String nombre;
    private String apellido;
    private String edad;
    private String codigo;
    private Double promedio;
    private String condicion;
    private int iduniversidades;

    public Alumnos(String nombre, String apellido, String edad, String codigo, Double promedio, String condicion, int iduniversidades) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.codigo = codigo;
        this.promedio = promedio;
        this.condicion = condicion;
        this.iduniversidades = iduniversidades;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public int getIduniversidades() {
        return iduniversidades;
    }

    public void setIduniversidades(int iduniversidades) {
        this.iduniversidades = iduniversidades;
    }
}
