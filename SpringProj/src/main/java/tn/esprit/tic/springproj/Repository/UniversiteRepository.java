package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.springproj.Models.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
