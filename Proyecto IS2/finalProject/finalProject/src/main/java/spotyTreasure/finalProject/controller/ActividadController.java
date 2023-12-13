package spotyTreasure.finalProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActividadController {
    @GetMapping("/actividad")
    public String cargarActividad(){
        return "actividad";
    }
}
