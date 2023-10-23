package tn.esprit.tic.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Models.Foyer;
import tn.esprit.tic.springproj.Repository.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerService implements  IFoyerService{

    FoyerRepository foyerrepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerrepository.findAll();

    }

    @Override
    public Foyer addFoyer(Foyer f) {
      return   foyerrepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerrepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
       return   foyerrepository.findById(idFoyer).get();

    }

    @Override
    public void archiverFoyer(long idFoyer) {

    }
}
