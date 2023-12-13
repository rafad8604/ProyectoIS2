package spotyTreasure.finalProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstacionController {
    @GetMapping("/estacion")
    public String estacionesComenzar(){
        return "estacion";
    }
}
