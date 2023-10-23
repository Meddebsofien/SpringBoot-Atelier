package tn.esprit.tic.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Models.Universite;
import tn.esprit.tic.springproj.Repository.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements  IUniversiteService{

   UniversiteRepository ur;


    @Override
    public List<Universite> retrieveAllUniversities() {
        return ur.findAll();
    }

    @Override
    public Universite addUniversity(Universite u) {
        return ur.save(u);
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return ur.save(u);
    }

    @Override
    public Universite retrieveUniversity(long idUniversity) {
        return ur.findById(idUniversity).get();
    }

    @Override
    public void removeUniversity(long idUniversity) {
        ur.deleteById(idUniversity);

    }
}
