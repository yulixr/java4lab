package classes;

public class Fire extends Substance{
    public Fire(String name){
        super(name);
    }
    public void SetFire(Thing thing){
        if (thing.GetStatus() == Status.in_fire)
            System.out.println(this.GetName() + " поджигает " + thing.GetName());
    }
}
