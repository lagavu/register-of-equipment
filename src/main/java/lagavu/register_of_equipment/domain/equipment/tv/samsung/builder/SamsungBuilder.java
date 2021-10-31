package lagavu.register_of_equipment.domain.equipment.tv.samsung.builder;

import lagavu.register_of_equipment.domain.equipment.common.dto.EquipmentDto;
import lagavu.register_of_equipment.domain.equipment.common.entity.embedded.Management;
import lagavu.register_of_equipment.domain.equipment.common.type.Color;
import lagavu.register_of_equipment.domain.equipment.tv.common.dto.TvDto;
import lagavu.register_of_equipment.domain.equipment.tv.common.entity.embedded.Characteristic;
import lagavu.register_of_equipment.domain.equipment.tv.samsung.entity.Samsung;

public class SamsungBuilder {
    private final EquipmentDto equipmentDto;
    private final TvDto tvDto;
    private Boolean hasSmartTvSupport;

    public SamsungBuilder(EquipmentDto equipmentDto, TvDto tvDto) {
        this.equipmentDto = equipmentDto;
        this.tvDto = tvDto;
    }

    public SamsungBuilder hasSmartTvSupport(Boolean hasSmartTvSupport) {
        this.hasSmartTvSupport = hasSmartTvSupport;
        return this;
    }

    public Samsung build() {
        return new Samsung(
                equipmentDto.getName(),
                equipmentDto.getCountry(),
                equipmentDto.getProducer(),
                new Management(equipmentDto.getCanBeOrderedOnline(), equipmentDto.getCanArrangeInstalments(),
                        equipmentDto.getInStock()),
                equipmentDto.getSerialNumber(),
                new Characteristic(Color.valueOf(tvDto.getColor()), tvDto.getSize()),
                tvDto.getPrice(),
                tvDto.getCategory(),
                tvDto.getTechnology(),
                this.hasSmartTvSupport
        );
    }
}
