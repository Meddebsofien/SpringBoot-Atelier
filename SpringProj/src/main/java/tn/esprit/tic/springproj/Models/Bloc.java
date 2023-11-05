package tn.esprit.tic.springproj.Models;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

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





}
