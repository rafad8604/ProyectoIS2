package spotyTreasure.finalProject.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InicioSesionController {
    @RequestMapping("/login")

    public String iniciarSesion(){
        return "inicioSesion";
    }
}
