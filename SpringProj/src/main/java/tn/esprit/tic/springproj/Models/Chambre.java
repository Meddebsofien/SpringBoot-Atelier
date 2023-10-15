package tn.esprit.tic.springproj.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

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
}
