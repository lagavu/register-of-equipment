package lagavu.register_of_equipment.domain.equipment.common.service;

import lagavu.register_of_equipment.domain.equipment.common.entity.Equipment;
import lagavu.register_of_equipment.domain.equipment.common.repository.IEquipmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {

    private final IEquipmentRepository equipmentRepository;

    public EquipmentService(IEquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    public List<Equipment> findAll() {
        return equipmentRepository.findAll();
    }
}
