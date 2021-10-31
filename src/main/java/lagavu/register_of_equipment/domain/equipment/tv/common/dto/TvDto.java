package lagavu.register_of_equipment.domain.equipment.tv.common.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TvDto {
    private final String serialNumber;
    private String color;
    private Integer size;
    private final Integer price;
    private final String category;
    private final String technology;
}
