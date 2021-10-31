package lagavu.register_of_equipment.domain.equipment.common.entity;

import lagavu.register_of_equipment.domain.equipment.common.entity.embedded.Management;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "equipments")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "equipment",
        discriminatorType = DiscriminatorType.STRING)
@NoArgsConstructor
public abstract class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column
    private String name;

    @NotNull
    @Column
    private String country;

    @NotNull
    @Column
    private String producer;

    @Embedded
    private Management management;

    public Equipment(String name, String country, String producer, Management management) {
        this.name = name;
        this.country = country;
        this.producer = producer;
        this.management = management;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getProducer() {
        return producer;
    }

    public Management getManagement() {
        return management;
    }

    @Transient
    public String getDecriminatorValue() {
        return this.getClass().getAnnotation(DiscriminatorValue.class).value();
    }
}
