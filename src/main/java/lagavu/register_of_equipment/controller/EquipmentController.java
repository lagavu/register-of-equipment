package lagavu.register_of_equipment.controller;

import lagavu.register_of_equipment.domain.equipment.common.dto.EquipmentDto;
import lagavu.register_of_equipment.domain.equipment.common.entity.Equipment;
import lagavu.register_of_equipment.domain.equipment.common.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EquipmentController {

    private final EquipmentService equipmentService;

    @Autowired
    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @GetMapping("/equipments")
    public ResponseEntity<List<EquipmentDto>> getList() {
        List<Equipment> equipments = equipmentService.findAll();
        List<EquipmentDto> equipmentDtoList = EquipmentDto.equipmentDtoList(equipmentService.findAll());
        return new ResponseEntity<>(equipmentDtoList, HttpStatus.OK);
    }
//    @GetMapping("/equipments")
//    public int getList() {
//        return 5555;
//    }

//    @Operation(summary = "Get all Tutorials", description = "Returns a list of tutorials", operationId = "tutorials")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "ok, successful operation",
//                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = Tutorial.class)))) ,
//            @ApiResponse(responseCode = "401", description = "Unauthorized"),
//            @ApiResponse(responseCode = "403", description = "Forbidden"),
//            @ApiResponse(responseCode = "404", description = "Not found")})
//    @GetMapping(value = "/tutorials", produces = "application/json")
//    public ResponseEntity<List<Tutorial>> tutorials() {
//        List<Tutorial> tutorials = new ArrayList<>();
//        tutorials.add(new Tutorial());
//        tutorials.add(new Tutorial());
//
//     //   List<Tutorial> tutorials = tutorials;
//        return new ResponseEntity<>(tutorials, HttpStatus.OK);
//    }
}
