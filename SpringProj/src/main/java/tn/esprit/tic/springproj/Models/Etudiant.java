package tn.esprit.tic.springproj.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Etudiant implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private  long cin;
    private String Ecole;


    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @ManyToMany (cascade = CascadeType.ALL )
    private List<Reservation> ReservationEtudiant;



}
