package tn.esprit.tic.springproj.Controller;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tic.springproj.services.EtudiantService;
@RestController
@AllArgsConstructor

public class EtudiantController {



    EtudiantService Es;
}
