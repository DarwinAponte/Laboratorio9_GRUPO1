package Beans;

public class Paises {
    private String nombre;
    private int poblacion;
    private int tamano;
    private int idcontinentes;


    public Paises(String nombre, int poblacion, int tamano, int idcontinentes) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.tamano = tamano;
        this.idcontinentes = idcontinentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getIdcontinentes() {
        return idcontinentes;
    }

    public void setIdcontinentes(int idcontinentes) {
        this.idcontinentes = idcontinentes;
    }
}
