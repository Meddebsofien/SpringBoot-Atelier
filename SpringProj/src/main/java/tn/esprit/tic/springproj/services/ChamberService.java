package tn.esprit.tic.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Models.Chambre;
import tn.esprit.tic.springproj.Repository.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ChamberService implements  IChamberService {


    ChambreRepository chambrerep;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambrerep.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambrerep.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambrerep.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambrerep.findById(idChambre).get();
    }
}
