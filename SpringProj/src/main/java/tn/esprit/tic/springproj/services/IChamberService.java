package tn.esprit.tic.springproj.services;

import tn.esprit.tic.springproj.Models.Chambre;

import java.util.List;

public interface IChamberService {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c);

    Chambre updateChambre (Chambre c);

    Chambre retrieveChambre (long idChambre);


}
