package com.example.testedgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestedGameApplication {

    public static void main(String[] args) {

    //    SpringApplication.run(TestedGameApplication.class, args);

        Personaje personaje = new Personaje("pablo", 13, 3);


        System.out.println(personaje.getNombre());


    }
}
