package classes;

public class MoonStone extends Thing {
    private int light;
    public MoonStone(String name, int Temperature) {
        super(name, Temperature);
    }

    public MoonStone(String name, int Temperature, int Density) {
        super(name, Temperature, Density);
    }

    public void WarmEnergyOut(Thing thing) {
        if (this.GetTemperature() > thing.GetTemperature())
            System.out.println(this.GetName() + "выделяет тепловую энергию");
    }

    public void LuchEnergyOut() {
            System.out.println(this.GetName() + " выделяет лучистую энергию");
    }

    public void NotDecay(Substance substance) {
        if (substance.Contain(this))
            System.out.println(this.GetName() + " не разлагается");
    }

    public void NotFire() {
        if (this.GetStatus() == Status.in_fire)
            System.out.println(this.GetName() + " не горит");
    }

    public void NotDrown() {
        if (this.GetStatus() == Status.in_water)
            System.out.println(this.GetName() + " не тонет");
    }

    public void MakeFullLightningProcess() {
        light = 1;
        while(light < 4){
            System.out.println(this.GetName() + " светится голубым светом. Сила яркости: " + light);
            light++;
            System.out.println(this.GetName() + " светится розовым. Сила яркости: " + light);
            light++;
            System.out.println(this.GetName() + " светится зеленым. Сила яркости: " + light);
            light++;
        }
        System.out.println(this.GetName() + " достиг максимальной яркости " + light + " и больше не светится");
    }

    public void MakeLightning(int n) {
        if (n == 1)
            System.out.println(this.GetName() + " светится");
        else
            System.out.println(this.GetName() + " не светится");
    }

    public void NotToReact(Thing thing){
        System.out.println(this.GetName() + " не вступает в реакцию с " + thing.GetName());
    }
    public void NotToReact(Substance substance){
        System.out.println(this.GetName() + " не вступает в реакцию с " + substance.GetName());
    }

    public void Dust(){
        if (this.GetStatus() == Status.on_podokonnik)
            System.out.println(this.GetName() + " начал покрываться пылью");
    }
}
