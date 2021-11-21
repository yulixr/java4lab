package classes;

public class SetTime {
    private TimeOfDay time;

    public SetTime() {
        this.time = TimeOfDay.day;
    }

    void SetNight() {
        time = TimeOfDay.night;
        System.out.println("Время сменилось на ночь");
    }

    void SetDay() {
        time = TimeOfDay.day;
        System.out.println("Время сменилось на день");
    }

    void SetMorning() {
        time = TimeOfDay.morning;
        System.out.println("Время сменилось на утро");
    }

    TimeOfDay GetTime() {
        return this.time;
    }
}
