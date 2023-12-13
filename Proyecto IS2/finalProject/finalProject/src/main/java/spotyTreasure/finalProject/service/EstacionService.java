package spotyTreasure.finalProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spotyTreasure.finalProject.entity.Estacion;
import spotyTreasure.finalProject.repository.EstacionRepository;

import java.util.Optional;

@Service
public class EstacionService {
    @Autowired
    EstacionRepository estacionRepository;

    public Optional<Estacion> buscarEstacion(Long id){
        System.out.println("ENTRO");
        System.out.println(id);
        System.out.println(estacionRepository.findById(id));
        return estacionRepository.findById(id);
    }
}
