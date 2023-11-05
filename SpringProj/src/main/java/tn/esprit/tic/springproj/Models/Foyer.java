package tn.esprit.tic.springproj.Models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Foyer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capacitiFoyer;
    private boolean archived = false;

    @OneToOne( mappedBy =  "foyer")
     private Universite universite;

    @OneToMany( cascade = CascadeType.ALL , mappedBy = "foyerr")
    private List<Bloc> Blocs ;


}
