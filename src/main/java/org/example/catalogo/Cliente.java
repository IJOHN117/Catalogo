package org.example.catalogo;

public class Cliente {

    private int clave;

    private String nombre;

    public Cliente() {
    }

    public Cliente(int clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
