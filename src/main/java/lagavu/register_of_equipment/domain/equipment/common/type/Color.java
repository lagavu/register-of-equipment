package lagavu.register_of_equipment.domain.equipment.common.type;

public enum Color {

    WHITE(Values.WHITE),
    BLACK(Values.BLACK),
    GREEN(Values.GREEN);

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static class Values {
        public static final String WHITE = "white";
        public static final String GREEN = "green";
        public static final String BLACK = "black";
    }
}
