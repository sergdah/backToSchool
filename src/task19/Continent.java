package task19;

public enum Continent {
    EUROPE("Европа"),
    ASIA("Азия"),
    AFRICA("Африка"),
    NORTH_AMERICA("Северная Америка"),
    SOUTH_AMERICA("Южная Америка"),
    AUSTRALIA("Австралия"),
    ANTARCTIDA("Антарктида");

    private String displayName;

    Continent(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}