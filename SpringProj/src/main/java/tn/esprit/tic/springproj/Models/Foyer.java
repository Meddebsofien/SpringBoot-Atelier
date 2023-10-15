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

    @OneToOne( mappedBy =  "foyer")
     private Universite universite;

    @OneToMany( cascade = CascadeType.ALL , mappedBy = "foyerr")
    private List<Bloc> Blocs ;

}
