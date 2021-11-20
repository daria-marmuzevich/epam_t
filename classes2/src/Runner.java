import by.gsu.epamlab.Material;
import by.gsu.epamlab.Subject;

public class Runner {
    public static void main(String[] args) {
        Material steel = new Material("steel", 7850.0);
        Subject wire = new Subject("wire", steel, 0.03);
        System.out.println(wire.toString());
        Material copper = new Material("copper", 8500.0);
        wire.setMaterial(copper);
        System.out.printf("The %s mass is %.1f kg.", wire.getName(), wire.getMass());
    }
}
