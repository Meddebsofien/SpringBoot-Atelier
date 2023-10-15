package tn.esprit.tic.springproj.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Reservation implements  Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idReservation;
    private Date anneUniv;
    private Boolean valid;

    @ManyToMany(cascade =  CascadeType.ALL,mappedBy = "ReservationEtudiant")
    private List<Etudiant> etudiantRes;



    }
