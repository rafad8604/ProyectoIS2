package spotyTreasure.finalProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import spotyTreasure.finalProject.entity.Estacion;
import spotyTreasure.finalProject.service.EstacionService;

import java.util.Optional;

@RestController
@RequestMapping("/estaciones")
@RequiredArgsConstructor
public class EstacionesController {
    private final EstacionService estacionService;
    @GetMapping("/{contador}")
    public ResponseEntity<Estacion> obtenerDtaosEstacion(@PathVariable Long contador){
        System.out.println(contador);
        Optional<Estacion> estacion =estacionService.buscarEstacion((contador));
        Estacion estacionTem = estacion.get();
        System.out.println(estacionTem);
        return ResponseEntity.ok(estacionTem);
    }
}
