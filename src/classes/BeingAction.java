package classes;

public interface BeingAction {
    void PutTrying(Thing thing, Substance substance);

    void MakeEvrica();

    void MeasureTemperature(Thing thing1, Thing thing2) throws BorderException;

    void MeasureDensity(Thing thing1, Thing thing2) throws BorderException;

    void PutWearOn(Thing thing);

    void PutWearOff(Thing thing);

    void LookAtObject(Thing thing);

    void Tell(String message);

    void WakeUpSpontaneous();

    void MakeGymnastic();

    void MakeUborka(int NumberOfActions);
}
