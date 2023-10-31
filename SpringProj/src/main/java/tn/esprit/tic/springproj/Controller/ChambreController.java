package tn.esprit.tic.springproj.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.springproj.Models.Chambre;
import tn.esprit.tic.springproj.services.IChamberService;

import java.util.List;

@RestController
@RequestMapping("chambre")

public class ChambreController {

    IChamberService chabreservice;

    @GetMapping("getallchambre")
    public    List<Chambre> retrieveAllChambres(){
       return chabreservice.retrieveAllChambres();
    }


@PostMapping("ajouterchambre")
 public    Chambre addChambre( @RequestBody  Chambre c){
        Chambre chamb = chabreservice.addChambre(c);
        return  chamb;

}
@PutMapping("modifierchambre")
  public  Chambre updateChambre ( @RequestBody  Chambre c){
    Chambre chambr = chabreservice.updateChambre(c);
    return chambr;
}

    @GetMapping("getchambrebyid/{idChambre}")
     public  Chambre retrieveChambre ( @PathVariable("idChambre") long idChambre){
        return chabreservice.retrieveChambre(idChambre);

  }
}
