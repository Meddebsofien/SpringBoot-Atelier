package tn.esprit.tic.springproj.Models;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;
    private boolean Archived=false;
    @ManyToOne
    private Foyer  foyerr;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "blocch")

    private List<Chambre> chambres;


    public long getIdBloc() {
        return idBloc;
    }

    public void setIdBloc(long idBloc) {
        this.idBloc = idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public long getCapaciteBloc() {
        return capaciteBloc;
    }

    public void setCapaciteBloc(long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }

    public boolean isArchived() {
        return Archived;
    }

    public void setArchived(boolean archived) {
        Archived = archived;
    }

    public Foyer getFoyerr() {
        return foyerr;
    }

    public void setFoyerr(Foyer foyerr) {
        this.foyerr = foyerr;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    public Bloc() {
    }

    public Bloc(long idBloc, String nomBloc, long capaciteBloc, boolean archived, Foyer foyerr, List<Chambre> chambres) {
        this.idBloc = idBloc;
        this.nomBloc = nomBloc;
        this.capaciteBloc = capaciteBloc;
        Archived = archived;
        this.foyerr = foyerr;
        this.chambres = chambres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bloc bloc)) return false;
        return getIdBloc() == bloc.getIdBloc() && getCapaciteBloc() == bloc.getCapaciteBloc() && isArchived() == bloc.isArchived() && Objects.equals(getNomBloc(), bloc.getNomBloc()) && Objects.equals(getFoyerr(), bloc.getFoyerr()) && Objects.equals(getChambres(), bloc.getChambres());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdBloc(), getNomBloc(), getCapaciteBloc(), isArchived(), getFoyerr(), getChambres());
    }

    @Override
    public String toString() {
        return "Bloc{" +
                "idBloc=" + idBloc +
                ", nomBloc='" + nomBloc + '\'' +
                ", capaciteBloc=" + capaciteBloc +
                ", Archived=" + Archived +
                ", foyerr=" + foyerr +
                ", chambres=" + chambres +
                '}';
    }
}
