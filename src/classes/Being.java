package classes;

import java.util.Objects;

public abstract class Being implements BeingAction, Measuring {
    private String name;

    public Being(String name) {
        this.name = name;
    }

    public String GetName() {
        return this.name;
    }

    public void PutTrying(Thing thing, Substance substance) {
        String name = substance.getClass().getSimpleName();
        if (name.compareTo("Water") == 0)
            thing.SetStatus(Status.in_water);
        if (name.compareTo("Fire") == 0)
            thing.SetStatus(Status.in_fire);
        if (name.compareTo("UsualSubstance") == 0)
            thing.SetStatus(Status.on_surface);
        if (substance.Contain(thing))
            System.out.println(this.GetName() + " положил " + thing.GetName() + " в " + substance.GetName());

    }

    public void MakeEvrica() {
        System.out.println(this.GetName() + " сделал открытие");
    }

    public boolean CompareTemperature(int Temperature1, int Temperature2) {
        return Temperature1 > Temperature2;
    }

    public boolean CompareDensity(int Density1, int Density2) {
        return Density1 > Density2;
    }

    public void MeasureTemperature(Thing thing1, Thing thing2) throws BorderException {
        if (thing1.GetTemperature() == 0 || thing2.GetTemperature() == 0)
            throw new BorderException("Нулевая температура");
        else {
            if (CompareTemperature(thing1.GetTemperature(), thing2.GetTemperature())) {
                System.out.println(this.GetName() + " померил температуру. Температура " + thing1.GetName() + " больше.");
            } else {
                System.out.println(this.GetName() + " померил температуру. Температура " + thing2.GetName() + " больше.");
            }
        }
    }

    public void MeasureDensity(Thing thing1, Thing thing2) throws BorderException {
        if (thing1.GetDensity() == 0 || thing2.GetDensity() == 0)
            throw new BorderException("Нулевая температура");
        else {
            if (CompareDensity(thing1.GetDensity(), thing2.GetDensity())) {
                System.out.println(this.GetName() + " померил вес. Вес " + thing1.GetName() + " больше.");
            } else {
                System.out.println(this.GetName() + " померил вес. Вес " + thing2.GetName() + " больше.");
            }
        }
    }

    public void PutWearOn(Thing thing) {
        System.out.println(this.GetName() + " надел " + thing.GetName());
    }

    public void PutWearOff(Thing thing) {
        System.out.println(this.GetName() + " снял " + thing.GetName());
    }

    public void LookAtObject(Thing thing) {
        System.out.println(this.GetName() + " смотри на " + thing.GetName());
    }

    public void Tell(String message) {
        System.out.println(message);
    }

    public void WakeUpSpontaneous() {
        System.out.println(this.GetName() + " случайно проснулся");
    }

    public void MakeGymnastic() {
        System.out.println(this.GetName() + " делает гимнастику");
    }

    public void MakeUborka(int NumberOfActions) {
        if (NumberOfActions == 1)
            System.out.println(this.GetName() +" подмел пол");
        else if (NumberOfActions == 2)
            System.out.println(this.GetName() +" подмел пол, протер шкафы");
        else if (NumberOfActions == 3)
            System.out.println(this.GetName() +" подмел пол, протер шкафы, разложил книги");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Being being = (Being) o;
        return Objects.equals(name, being.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
