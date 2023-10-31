package tn.esprit.tic.springproj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.tic.springproj.Models.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {

    @Query("select r from Reservation  r where r.idReservation=:res")
    Reservation getResbyidRes(@Param("res") String res);



}
