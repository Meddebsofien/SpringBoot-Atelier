package tn.esprit.tic.springproj.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.springproj.Models.Bloc;
import tn.esprit.tic.springproj.services.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/bloc")

public class BlocController {

    IBlocService  blocs;


    @GetMapping ("/getAllBloc")
    public List<Bloc> getAllBlocs(){
      return   blocs.retrieveBlocs();
    }

    @PostMapping("/addBloc")
   public  Bloc AjouterBloc ( @RequestBody Bloc b){
        Bloc bloc = blocs.addBloc(b);
        return  bloc;

    }

    @GetMapping("getblocbyId/{idbloc}")
   public Bloc getBlocById ( @PathVariable("idbloc")  long idbloc){
        return  blocs.retrieveBloc(idbloc);

    }
@PutMapping("/archivebloc/{idb}")
    void archiverBloc ( @PathVariable("idb") long idb){
         blocs.archiverBloc (idb);

    }
   @PostMapping("/affecte-chambres-bloc/{nomBloc}")
    public Bloc affecterChambresABloc( @RequestBody List<Long> numChambre , @PathVariable("nomBloc") String nomBloc){
           return     blocs.affecterChambresABloc(numChambre,nomBloc);
    }
}
