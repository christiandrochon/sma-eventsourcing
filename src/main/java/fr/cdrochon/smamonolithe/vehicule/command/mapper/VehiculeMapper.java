package fr.cdrochon.smamonolithe.vehicule.command.mapper;

import fr.cdrochon.smamonolithe.vehicule.query.dtos.VehiculeResponseDTO;
import fr.cdrochon.smamonolithe.vehicule.query.dtos.VehiculeResponseRestDTO;
import fr.cdrochon.smamonolithe.vehicule.query.entities.Vehicule;
import org.springframework.stereotype.Component;

@Component
public class VehiculeMapper {
    
    public static VehiculeResponseDTO convertVehiculeToVehiculeDTO(Vehicule vehicule){
        VehiculeResponseDTO dto = new VehiculeResponseDTO();
        dto.setIdVehicule(vehicule.getIdVehicule());
        dto.setImmatriculationVehicule(vehicule.getImmatriculationVehicule());
        dto.setDateMiseEnCirculationVehicule(vehicule.getDateMiseEnCirculationVehicule());
        
        return dto;
    }
}
