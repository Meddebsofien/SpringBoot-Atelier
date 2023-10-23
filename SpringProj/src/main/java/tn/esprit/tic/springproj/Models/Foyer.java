package tn.esprit.tic.springproj.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Foyer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capacitiFoyer;
    private boolean archived = false;

    @OneToOne( mappedBy =  "foyer")
     private Universite universite;

    @OneToMany( cascade = CascadeType.ALL , mappedBy = "foyerr")
    private List<Bloc> Blocs ;

    public long getIdFoyer() {
        return idFoyer;
    }

    public void setIdFoyer(long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public long getCapacitiFoyer() {
        return capacitiFoyer;
    }

    public void setCapacitiFoyer(long capacitiFoyer) {
        this.capacitiFoyer = capacitiFoyer;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public Universite getUniversite() {
        return universite;
    }

    public void setUniversite(Universite universite) {
        this.universite = universite;
    }

    public List<Bloc> getBlocs() {
        return Blocs;
    }

    public void setBlocs(List<Bloc> blocs) {
        Blocs = blocs;
    }
}
