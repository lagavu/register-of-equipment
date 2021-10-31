package lagavu.register_of_equipment.domain.equipment.tv.common.entity.embedded;

import lagavu.register_of_equipment.domain.equipment.common.type.Color;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
public class Characteristic {

    @Column
    private Color color;

    @Column
    private Integer size;

    public Characteristic(Color color, Integer size) {
        this.color = color;
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public Integer getSize() {
        return size;
    }
}
