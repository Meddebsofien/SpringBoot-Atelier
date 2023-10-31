package tn.esprit.tic.springproj.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.springproj.Models.Reservation;
import tn.esprit.tic.springproj.services.IReservationService;

import java.util.List;

@RestController
@RequestMapping("reservation")

public class ReservationController {

    IReservationService resservice;

@GetMapping("getallres")
  public   List<Reservation> retrieveAllReservation(){
    return  resservice.retrieveAllReservation();
}

@PutMapping("modifierres")
   public Reservation updateReservation ( @RequestBody  Reservation res){
    Reservation r = resservice.updateReservation(res);
    return r;
}
@GetMapping("getresbyid/{idReservation}")
   public  Reservation retrieveReservation ( @PathVariable("idReservation") String idReservation){
    Reservation r = resservice.retrieveReservation(idReservation);
    return r;
}
}
