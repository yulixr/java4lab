package classes;

public class Water extends Substance {
    public Water(String name) {
        super(name);
    }

    public void GoDrown(Thing thing) {
        if (thing.GetStatus() == Status.in_water && thing.GetDensity() > 1000) {
            System.out.println(this.GetName() + " заставляет тонуть " + thing.GetName());
            thing.Drown();
        } else {
            System.out.println(this.GetName() + " заставляет плавать " + thing.GetName());
            thing.Swim();
        }

    }
}
