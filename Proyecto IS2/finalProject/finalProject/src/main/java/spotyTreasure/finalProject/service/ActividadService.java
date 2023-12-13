package spotyTreasure.finalProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spotyTreasure.finalProject.entity.Actividad;
import spotyTreasure.finalProject.repository.ActividadRespository;

import java.util.Optional;

@Service
public class ActividadService {
    @Autowired
    private ActividadRespository actividadRespository;

    public Actividad guardarActividad(Actividad actividad){
        return actividadRespository.save(actividad);

    }
    public Optional<Actividad> buscarActividad(Long id){
        return actividadRespository.findById(id);}
}
