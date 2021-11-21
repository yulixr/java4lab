package classes;

public class UsualThing extends Thing {
    public UsualThing(String name) {
        super(name);
    }

    public UsualThing(String name, int Temperature) {
        super(name, Temperature);
    }

    public UsualThing(String name, int Temperature, int Density) {
        super(name, Temperature, Density);
    }

    public UsualThing(String name, int Temperature, Status status) {
        super(name, Temperature, status);
    }

}
