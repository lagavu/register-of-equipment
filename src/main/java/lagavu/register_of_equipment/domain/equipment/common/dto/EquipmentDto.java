package lagavu.register_of_equipment.domain.equipment.common.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lagavu.register_of_equipment.domain.equipment.common.entity.Equipment;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EquipmentDto {
    private String name;
    private String country;
    private String producer;
    private Boolean canBeOrderedOnline;
    private Boolean canArrangeInstalments;
    private Boolean inStock;
    private String serialNumber;
    private String equipment;

 //   private TvDto tvDto;

    public static EquipmentDto fromEquipment(Equipment equipment) {
        EquipmentDto equipmentDto = new EquipmentDto();

        equipmentDto.setName(equipment.getName());
        equipmentDto.setCountry(equipment.getCountry());
        equipmentDto.setProducer(equipment.getProducer());
        equipmentDto.setCanBeOrderedOnline(equipment.getManagement().canBeOrderedOnline());
        equipmentDto.setCanArrangeInstalments(equipment.getManagement().canArrangeInstalments());
        equipmentDto.setInStock(equipment.getManagement().isInStock());
        return equipmentDto;
    }

    public static List<EquipmentDto> equipmentDtoList(List<Equipment> equipments) {
        List<EquipmentDto> equipmentList = new ArrayList<>();
        equipments.forEach(equipment -> equipmentList.add(fromEquipment(equipment)));
        return equipmentList;
    }
}
