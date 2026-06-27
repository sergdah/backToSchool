package task14;

public enum Gender {
    MALE("Мужской"),
    FEMALE("Женский");

    private final String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

