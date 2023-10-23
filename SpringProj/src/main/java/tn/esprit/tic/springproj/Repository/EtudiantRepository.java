package tn.esprit.tic.springproj.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.Models.Etudiant;
public interface EtudiantRepository    extends JpaRepository<Etudiant,Long> {

}
