package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.tic.springproj.Models.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {

    @Query("select c from Chambre c where  c.numeroChambre= :num")
    Chambre getchambrebynum(@Param("num") Long num);


   @Query("SELECT CONCAT( c.numeroChambre, '-', b.nomBloc) FROM Chambre c " +
           "JOIN c.blocch b  where  c.idChambre = :id")
    String concatnumchambreNomBloc(@Param("id") Long id);






}
