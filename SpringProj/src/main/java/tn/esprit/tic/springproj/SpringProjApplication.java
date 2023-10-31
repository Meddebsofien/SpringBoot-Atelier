package tn.esprit.tic.springproj;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.esprit.tic.springproj.Repository.ChambreRepository;

@SpringBootApplication
@AllArgsConstructor
public class SpringProjApplication {
      //  ChambreRepository chambreRep;
    public static void main(String[] args) {

        SpringApplication.run(SpringProjApplication.class, args);
        System.out.println("hello");

    }


}
