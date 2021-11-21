package classes;

import java.util.Objects;

public abstract class Substance {
    private String name;

    public Substance(String name) {
        this.name = name;
    }

    public String GetName() {
        return this.name;
    }

    public boolean Contain(Thing thing) {
        for (Status s : Status.values()) {
            if (thing.GetStatus() == s) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Substance substance = (Substance) o;
        return Objects.equals(name, substance.name);
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
