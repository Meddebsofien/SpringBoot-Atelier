package tn.esprit.tic.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.springproj.Models.Bloc;
import tn.esprit.tic.springproj.Models.Chambre;
import tn.esprit.tic.springproj.Repository.BlocRepository;
import tn.esprit.tic.springproj.Repository.ChambreRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BlocService implements IBlocService {

    BlocRepository blocrepository;
    ChambreRepository chr;
    @Override
    public List<Bloc> retrieveBlocs() {
        return  blocrepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocrepository.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocrepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocrepository.findById(idBloc).get();
    }

    @Override
    public void archiverBloc(long idBloc) {
        blocrepository.getReferenceById(idBloc).setArchived(true);
    }

/*    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) {
        Bloc bloc  = blocrepository.getblocbyNom(nomBloc);
       Chambre ch = new Chambre();
       List<Chambre> listchambre= new ArrayList<Chambre>();
        for (int i=0 ; i<numChambre.size() ;i++){
            ch = chr.findById(numChambre.get(i)).get();
            listchambre.add(ch);
        }
        bloc.setChambres(listchambre);
        blocrepository.save(bloc);
        return  bloc;
    }
public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) {
    Bloc bloc  = blocrepository.getblocbyNom(nomBloc);
    List<Chambre> listchambre= new ArrayList<Chambre>();
    Chambre chambre = new Chambre();
    for (int i=0 ; i<numChambre.size() ;i++){
        chambre = chr.getchambrebynum(numChambre.get(i));

        listchambre.add(chambre);
    }
    bloc.getChambres().addAll(listchambre);
    blocrepository.save(bloc);
    return bloc;

}*/
public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) {
    Bloc bloc  = blocrepository.getblocbyNom(nomBloc);
    List<Chambre> listchambre= new ArrayList<Chambre>();
    Chambre chambre = new Chambre();
    for (int i=0 ; i<numChambre.size() ;i++){
        chambre = chr.getchambrebynum(numChambre.get(i));

        listchambre.add(chambre);
    }
    bloc.getChambres().forEach(chambre1 -> {
        chambre1.setBlocch(bloc);
        chr.save(chambre1);
    });
  //  blocrepository.save(bloc);
    return bloc;

}

}
