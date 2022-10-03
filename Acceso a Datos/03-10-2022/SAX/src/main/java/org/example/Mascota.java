package org.example;

public class Mascota {

    public Mascota(){

    }

    private String nombre;
    private int edad;
    private String genero;
    private String tipo;

    public Mascota(String nombre, int edad, String genero, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
