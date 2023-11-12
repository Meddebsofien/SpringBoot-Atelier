package tn.esprit.tic.springproj;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class SpringProjApplication {
    //  ChambreRepository chambreRep;
    public static void main(String[] args) {

        SpringApplication.run(SpringProjApplication.class, args);
        System.out.println("hello");


    }



}
