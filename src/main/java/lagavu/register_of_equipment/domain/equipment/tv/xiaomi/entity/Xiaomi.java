package lagavu.register_of_equipment.domain.equipment.tv.xiaomi.entity;

import lagavu.register_of_equipment.domain.equipment.common.entity.embedded.Management;
import lagavu.register_of_equipment.domain.equipment.tv.common.entity.Tv;
import lagavu.register_of_equipment.domain.equipment.tv.common.entity.embedded.Characteristic;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue(value= "xiaomi")
@NoArgsConstructor
public class Xiaomi extends Tv {

    @NotNull
    @Column
    private Boolean hasXiaomiSystem;

    public Xiaomi(String name, String country, String manufacturer, Management management, String serialNumber,
                  Characteristic characteristic, Integer price, String category, String technology,
                  Boolean hasXiaomiSystem) {
        super(name, country, manufacturer, management, serialNumber, characteristic, price, category, technology);
        this.hasXiaomiSystem = hasXiaomiSystem;
    }

    public Boolean getHasXiaomiSystem() {
        return hasXiaomiSystem;
    }
}
