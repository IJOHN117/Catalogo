package org.example.catalogo;
public class Proveedores {
    private int clave;
    private String nombre;

    public Proveedores(){

    }
    public Proveedores(int clave, String nombre){
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
    public String toString(){
        return "Proveedor{" + "clave=" + clave + ", nombre=" + nombre + '\'' + '}';
    }
}