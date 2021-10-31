package lagavu.register_of_equipment.domain.equipment.common.repository;

import lagavu.register_of_equipment.domain.equipment.common.entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEquipmentRepository extends JpaRepository<Equipment, Long> {
}
