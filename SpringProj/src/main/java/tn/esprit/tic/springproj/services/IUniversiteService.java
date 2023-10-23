package tn.esprit.tic.springproj.services;

import tn.esprit.tic.springproj.Models.Universite;

import java.util.List;

public interface IUniversiteService {

    List<Universite> retrieveAllUniversities();
    Universite addUniversity (Universite u);
    Universite updateUniversity (Universite u);
    Universite retrieveUniversity (long idUniversity);
    void removeUniversity  (long idUniversity );
}
