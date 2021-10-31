package lagavu.register_of_equipment.domain.equipment.common.entity.embedded;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
@NoArgsConstructor
public class Management {

    @NotNull
    @Column
    private Boolean canBeOrderedOnline;

    @NotNull
    @Column
    private Boolean canArrangeInstalments;

    @NotNull
    @Column
    private Boolean inStock;

    public Management(Boolean canBeOrderedOnline, Boolean canArrangeInstalments, Boolean inStock) {
        this.canBeOrderedOnline = canBeOrderedOnline;
        this.canArrangeInstalments = canArrangeInstalments;
        this.inStock = inStock;
    }

    public Boolean canBeOrderedOnline() {
        return canBeOrderedOnline;
    }

    public Boolean canArrangeInstalments() {
        return canArrangeInstalments;
    }

    public Boolean isInStock() {
        return inStock;
    }
}
