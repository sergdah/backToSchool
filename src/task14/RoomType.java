package task14;

public enum RoomType {
    MALE_ROOM("Мужская"),
    FEMALE_ROOM("Женская");

    private final String description;

    RoomType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
