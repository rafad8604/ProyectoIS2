package spotyTreasure.finalProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spotyTreasure.finalProject.entity.Actividad;
import spotyTreasure.finalProject.entity.Estacion;
import spotyTreasure.finalProject.service.ActividadService;
import spotyTreasure.finalProject.service.EstacionService;

import java.util.Optional;

@RestController
@RequestMapping("/actividades")
@RequiredArgsConstructor
public class ActividadesController {
    private final ActividadService actividadService;
    @GetMapping("/{contador}")
    public ResponseEntity<Actividad> obtenerDtaosActividad(@PathVariable Long contador){
        System.out.println("SI ENTRO");
        System.out.println(contador);
        Optional<Actividad> actividad =actividadService.buscarActividad(contador);
        System.out.println(actividad);
        Actividad actividadTem = actividad.get();
        System.out.println(actividadTem);
        return ResponseEntity.ok(actividadTem);
    }
}
