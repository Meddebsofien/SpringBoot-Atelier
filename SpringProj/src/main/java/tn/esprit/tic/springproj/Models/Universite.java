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
}
