package tn.esprit.tic.springproj.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity

public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private  TypeChambre type;

    @ManyToOne
    private Bloc blocch;

    @OneToMany
    private List<Reservation> ReservationsChambre;


    public Chambre() {
    }

    public Chambre(long idChambre, long numeroChambre, TypeChambre type, Bloc blocch, List<Reservation> reservationsChambre) {
        this.idChambre = idChambre;
        this.numeroChambre = numeroChambre;
        this.type = type;
        this.blocch = blocch;
        ReservationsChambre = reservationsChambre;
    }

    public long getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(long idChambre) {
        this.idChambre = idChambre;
    }

    public long getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public TypeChambre getType() {
        return type;
    }

    public void setType(TypeChambre type) {
        this.type = type;
    }

    public Bloc getBlocch() {
        return blocch;
    }

    public void setBlocch(Bloc blocch) {
        this.blocch = blocch;
    }

    public List<Reservation> getReservationsChambre() {
        return ReservationsChambre;
    }

    public void setReservationsChambre(List<Reservation> reservationsChambre) {
        ReservationsChambre = reservationsChambre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chambre chambre)) return false;
        return getIdChambre() == chambre.getIdChambre() && getNumeroChambre() == chambre.getNumeroChambre() && getType() == chambre.getType() && Objects.equals(getBlocch(), chambre.getBlocch()) && Objects.equals(getReservationsChambre(), chambre.getReservationsChambre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdChambre(), getNumeroChambre(), getType(), getBlocch(), getReservationsChambre());
    }

    @Override
    public String toString() {
        return "Chambre{" +
                "idChambre=" + idChambre +
                ", numeroChambre=" + numeroChambre +
                ", type=" + type +
                ", blocch=" + blocch +
                ", ReservationsChambre=" + ReservationsChambre +
                '}';
    }
}
