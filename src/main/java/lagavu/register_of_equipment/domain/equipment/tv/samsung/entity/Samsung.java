package lagavu.register_of_equipment.domain.equipment.tv.samsung.entity;

import lagavu.register_of_equipment.domain.equipment.common.entity.embedded.Management;
import lagavu.register_of_equipment.domain.equipment.tv.common.entity.Tv;
import lagavu.register_of_equipment.domain.equipment.tv.common.entity.embedded.Characteristic;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue(value= "samsung")
@NoArgsConstructor
public class Samsung extends Tv {

    @NotNull
    @Column
    private Boolean hasSmartTvSupport;

    public Samsung(String name, String country, String manufacturer, Management management, String serialNumber,
                   Characteristic characteristic, Integer price, String category, String technology,
                   Boolean hasSmartTvSupport) {
        super(name, country, manufacturer, management, serialNumber, characteristic, price, category, technology);
        this.hasSmartTvSupport = hasSmartTvSupport;
    }

    public Boolean getHasSmartTvSupport() {
        return hasSmartTvSupport;
    }
}
