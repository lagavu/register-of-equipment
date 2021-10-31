package lagavu.register_of_equipment.domain.equipment.tv.common.entity;

import lagavu.register_of_equipment.domain.equipment.common.entity.Equipment;
import lagavu.register_of_equipment.domain.equipment.common.entity.embedded.Management;
import lagavu.register_of_equipment.domain.equipment.tv.common.entity.embedded.Characteristic;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value= "tv")
@NoArgsConstructor
public class Tv extends Equipment {

    @Column
    private String serialNumber;

    @Embedded
    private Characteristic characteristic;

    @Column
    private Integer price;

    @Column
    private String category;

    @Column
    private String technology;

    public Tv(String name, String country, String manufacturer, Management management, String serialNumber,
              Characteristic characteristic, Integer price, String category, String technology) {
        super(name, country, manufacturer, management);
        this.serialNumber = serialNumber;
        this.characteristic = characteristic;
        this.price = price;
        this.category = category;
        this.technology = technology;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public Integer getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getTechnology() {
        return technology;
    }
}
