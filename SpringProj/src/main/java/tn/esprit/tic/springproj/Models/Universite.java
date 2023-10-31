package tn.esprit.tic.springproj.Models;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity

public class Universite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;
    private String nomUniversite;
private String adresse;

@OneToOne
    private Foyer foyer ;

    public long getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "idUniversite=" + idUniversite +
                ", nomUniversite='" + nomUniversite + '\'' +
                ", adresse='" + adresse + '\'' +
                ", foyer=" + foyer +
                '}';
    }
}
