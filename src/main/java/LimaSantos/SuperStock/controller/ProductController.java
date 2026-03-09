package LimaSantos.SuperStock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductController {
    @GetMapping ("/boasVindas")
    public String boasVindas() {
       return "first programm";
    }


}
