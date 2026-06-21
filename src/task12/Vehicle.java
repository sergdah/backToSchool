package task12;

public class Vehicle {
    private String name;
    private Integer emissions;

    public Vehicle(String name, Integer emissions) {
        this.name = name;
        this.emissions = emissions;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getEmissions() { return emissions; }
    public void setEmissions(Integer emissions) { this.emissions = emissions; }
}