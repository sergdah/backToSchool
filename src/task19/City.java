package task19;

public class City {
    private int id;
    private String name;
    private long population;
    private Continent continent;

    public City(int id, String name, long population, Continent continent) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public Continent getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", continent=" + continent +
                '}';
    }
}
