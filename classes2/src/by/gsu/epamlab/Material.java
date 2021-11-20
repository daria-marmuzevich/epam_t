package by.gsu.epamlab;

public class Material {
    private String name;
    private double density;

    public Material() {
    }

    public Material(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return name+";"+density;
    }


}
