package br.com.raul.aulaErudio.controller;

import br.com.raul.aulaErudio.modell.Greeting;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private static final String template = "Ola, %s";
    private Integer id = 0;

    @GetMapping()
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(id++, String.format(template, name));
    }

}
