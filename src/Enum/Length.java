package Enum;

public enum Length {

    KROTKI("krótki") {
        public boolean isPretty() {
            return false;
        }
    },
    SREDNI("średni") {
        public boolean isPretty() {
            return false;
        }
    },
    DLUGI("długi") {
        public boolean isPretty() {
            return true;
        }
    };

    private final String displayLength;

    Length(String displayLength) {
        this.displayLength = displayLength;
    }

    public abstract boolean isPretty();


}
