package tn.esprit.tic.springproj.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Reservation implements  Serializable {

    @Id
    private String idReservation;
    private Date anneUniv;
    private Boolean valid;

    @ManyToMany(cascade =  CascadeType.ALL,mappedBy = "ReservationEtudiant")
    private List<Etudiant> etudiantRes;

    public Reservation() {
    }

    public Reservation(String idReservation, Date anneUniv, Boolean valid, List<Etudiant> etudiantRes) {
        this.idReservation = idReservation;
        this.anneUniv = anneUniv;
        this.valid = valid;
        this.etudiantRes = etudiantRes;
    }

    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public Date getAnneUniv() {
        return anneUniv;
    }

    public void setAnneUniv(Date anneUniv) {
        this.anneUniv = anneUniv;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public List<Etudiant> getEtudiantRes() {
        return etudiantRes;
    }

    public void setEtudiantRes(List<Etudiant> etudiantRes) {
        this.etudiantRes = etudiantRes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reservation that)) return false;
        return Objects.equals(getIdReservation(), that.getIdReservation()) && Objects.equals(getAnneUniv(), that.getAnneUniv()) && Objects.equals(getValid(), that.getValid()) && Objects.equals(getEtudiantRes(), that.getEtudiantRes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdReservation(), getAnneUniv(), getValid(), getEtudiantRes());
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "idReservation='" + idReservation + '\'' +
                ", anneUniv=" + anneUniv +
                ", valid=" + valid +
                ", etudiantRes=" + etudiantRes +
                '}';
    }
}
