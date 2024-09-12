package com.example.celsiusfareihnheit.celsiusfareihnheit;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MyController {


    @GetMapping("/celsius")
    public double calculaCelsius(@RequestParam double valorFarei) {
        double resultado = ((valorFarei - 32) * 5) / 9;

        return resultado;
    }

    @GetMapping("/farei")
    public double calculaFareihnheit(@RequestParam double valorCelsius) {
        double resultado = ((valorCelsius * 9) + (5 * 32)) / 5;

        return  resultado;
    }
}
