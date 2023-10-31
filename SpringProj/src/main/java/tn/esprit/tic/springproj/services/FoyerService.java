package tn.esprit.tic.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Models.Foyer;
import tn.esprit.tic.springproj.Repository.BlocRepository;
import tn.esprit.tic.springproj.Repository.FoyerRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FoyerService implements  IFoyerService{

    FoyerRepository foyerrepository;
    BlocRepository blocRep;

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
     foyerrepository.getReferenceById(idFoyer).setArchived(true);


    }

    @Override
    public Foyer addFoyerWithBloc(Foyer f) {
       Foyer foyer = foyerrepository.save(f);
       foyer.getBlocs().forEach(bloc -> {
            bloc.setFoyerr(foyer);
            blocRep.save(bloc);
       });
       return foyer;
    }
}
