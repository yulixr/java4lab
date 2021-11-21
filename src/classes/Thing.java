package classes;

import java.util.Objects;

public abstract class Thing implements ThingAction {
    private String name;
    private int Temperature;
    private Status status;
    private int Density;

    public Thing(String name, int Temperature, Status status) {
        this.name = name;
        this.Temperature = Temperature;
        this.status = status;
    }

    public Thing(String name, int Temperature) {
        this.name = name;
        this.Temperature = Temperature;
    }

    public Thing(String name, int Temperature, int Density) {
        this.name = name;
        this.Temperature = Temperature;
        this.Density = Density;
    }

    public Thing(String name) {
        this.name = name;
    }

    public String GetName() {
        return this.name;
    }

    public int GetTemperature() {
        return this.Temperature;
    }

    public int GetDensity() {
        return this.Density;
    }

    public void SetDensity(int Density) {
        this.Density = Density;
    }

    public void SetTemperature(int Temperature) {
        this.Temperature = Temperature;
    }

    public Status GetStatus() {
        return this.status;
    }

    public void SetStatus(Status status) {
        this.status = status;
    }

    public void Drown() {
        if (this.GetStatus() == Status.in_water)
            System.out.println(this.GetName() + " тонет");
    }

    public void Swim() {
        if (this.GetStatus() == Status.in_water)
            System.out.println(this.GetName() + " плывет");
    }
    public void React()
    {
        System.out.println(this.GetName() + " реагирует");
    }
    public void AbilityToBlend(){}
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Thing thing = (Thing) o;
        return Temperature == thing.Temperature && Objects.equals(name, thing.name) && status == thing.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Temperature, status);
    }

    @Override
    public String toString() {
        return name;
    }
}
