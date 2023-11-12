package tn.esprit.tic.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Models.Bloc;
import tn.esprit.tic.springproj.Models.Chambre;
import tn.esprit.tic.springproj.Models.TypeChambre;
import tn.esprit.tic.springproj.Repository.BlocRepository;
import tn.esprit.tic.springproj.Repository.ChambreRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
public class ChamberService implements  IChamberService {


    ChambreRepository chambrerep;
    BlocRepository blocrep;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambrerep.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambrerep.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambrerep.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambrerep.findById(idChambre).get();
    }

    @Override
    public List<Chambre> getChambresParNomBloc(String nomBloc) {
        Bloc bloc = blocrep.getblocbyNom(nomBloc);
        if (bloc == null) {
            System.out.println("Le bloc avec le nom spécifié n'a pas été trouvé.");
            return Collections.emptyList(); // or return null, depending on your requirements
        } else {
            List<Chambre> chambres = bloc.getChambres();
            if (chambres == null) {
                System.out.println("Ce bloc n'a pas de chambre.");
                return Collections.emptyList(); // or return null, depending on your requirements
            } else {
                System.out.println(chambres);
                return chambres;
            }
        }
    }

    @Override
    public long nbChambreParTypeEtBloc(TypeChambre type, long idBloc) {
        Bloc b=blocrep.findById(idBloc).get();
        Long nb = 0L;
        List <Chambre> listchambre = new ArrayList<>();
        listchambre =  b.getChambres();
        for (int i=0;i<listchambre.size();i++){
            if( listchambre.get(i).getType() == type )
            {
                nb+=1;
            }
        }
        return nb;

    }

}
