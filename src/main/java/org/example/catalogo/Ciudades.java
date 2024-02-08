package org.example.catalogo;

public class Ciudades {
    private int clv_cdd;
    private String nom_cdd;
    public Ciudades(){

    }

    public Ciudades(int clv_cdd, String nom_cdd) {
        this.clv_cdd = clv_cdd;
        this.nom_cdd = nom_cdd;
    }

    public int getClv_cdd() {
        return clv_cdd;
    }

    public void setClv_cdd(int clv_cdd) {
        this.clv_cdd = clv_cdd;
    }

    public String getNom_cdd() {
        return nom_cdd;
    }

    public void setNom_cdd(String nom_cdd) {
        this.nom_cdd = nom_cdd;
    }

    @Override
    public String toString() {
        return "Ciudades{" +
                "clv_cdd=" + clv_cdd +
                ", nom_cdd='" + nom_cdd + '\'' +
                '}';
    }
}
