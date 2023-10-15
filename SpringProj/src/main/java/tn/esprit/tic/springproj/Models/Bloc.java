package tn.esprit.tic.springproj.Models;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;

    @ManyToOne
    private Foyer  foyerr;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "blocch")

    private List<Chambre> chambres;
}
