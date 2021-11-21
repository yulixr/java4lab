package classes;

import java.util.Set;

public class Story {
    private Znayka znayka;
    private MoonStone moonstone;
    private UsualThing sugar;
    private UsualThing salt;
    private UsualThing probka;
    private UsualThing OkrPredm;
    private UsualThing chemicals;
    private Fire fire;
    private Water water;
    private UsualSubstance tigel;
    private UsualSubstance podokonnik;
    private Wear wear;
    private SetTime time;
    private Znayka.Head head;

    public void AddZnayka(Znayka znayka) {
        this.znayka = znayka;
        this.head = znayka.CreateHead();
    }

    public void AddTime(SetTime time) {
        this.time = time;
    }

    public void AddMoonstone(MoonStone moonstone) {
        this.moonstone = moonstone;
    }

    public void AddChemichals(UsualThing chemicals) {
        this.chemicals = chemicals;
    }

    public void AddSugar(UsualThing sugar) {
        this.sugar = sugar;
    }

    public void AddSalt(UsualThing salt) {
        this.salt = salt;
    }

    public void AddProbka(UsualThing probka) {
        this.probka = probka;
    }

    public void AddOkrPredm(UsualThing OkrPredm) {
        this.OkrPredm = OkrPredm;
    }

    public void AddFire(Fire fire) {
        this.fire = fire;
    }

    public void AddWater(Water water) {
        this.water = water;
    }

    public void AddTigel(UsualSubstance tigel) {
        this.tigel = tigel;
    }

    public void AddPodokonnik(UsualSubstance podokonnik) {
        this.podokonnik = podokonnik;
    }

    public void AddWear(Wear wear) {
        this.wear = wear;
    }


    public void Go() throws NullObjectException, BorderException {
        int i = 0;
        if (znayka != null && moonstone != null && time != null &&
                sugar != null & salt != null && chemicals != null && head != null && fire != null
                && water != null && podokonnik != null) {
            this.znayka.PutWearOff(wear);
            this.time.SetNight();
            this.znayka.GoSleep(time);
            this.znayka.WakeUpSpontaneous();
            this.znayka.LookAtObject(moonstone);
            this.moonstone.MakeFullLightningProcess();
            this.znayka.PutTrying(moonstone, podokonnik);
            this.znayka.GoSleep(time);
            while (i < 2) {
                this.moonstone.MakeLightning((int) (Math.random() * 2));
                i++;
            }
            this.znayka.PutTrying(moonstone, water);
            this.moonstone.NotToReact(water);
            ThingAction chem = new ThingAction() {
                public void AbilityToBlend(){
                    System.out.println("Химикаты растворяют золото");
                }

                @Override
                public void Drown() {
                    System.out.println("Химикаты растворяются");
                }

                @Override
                public void Swim() {
                    System.out.println("Химикаты растворяются");
                }

                @Override
                public void React() {
                    System.out.println("Химикаты растворяются");
                }
            };
            chem.React();
            chem.AbilityToBlend();
            this.moonstone.NotToReact(chemicals);
            this.znayka.Tell("Ничего тут не скажешь!");
            this.znayka.PutTrying(moonstone, tigel);
            this.moonstone.NotDecay(tigel);
            this.znayka.PutTrying(moonstone, fire);
            this.fire.SetFire(moonstone);
            this.moonstone.NotFire();
            this.znayka.PutTrying(moonstone, water);
            this.moonstone.NotDrown();
            this.znayka.PutTrying(sugar, water);
            this.water.GoDrown(sugar);
            this.znayka.PutTrying(salt, water);
            this.water.GoDrown(salt);
            this.znayka.PutTrying(probka, water);
            this.water.GoDrown(probka);
            this.moonstone.SetDensity(900);
            System.out.println(this.moonstone.GetName() + " поменял плотность. Его плотность - " + this.moonstone.GetDensity());
            this.znayka.PutTrying(moonstone, water);
            this.water.GoDrown(moonstone);
            this.znayka.MakeEvrica();
            i = 0;
            while (i < 3) {
                int k = this.moonstone.GetTemperature();
                this.moonstone.SetTemperature((int) (Math.random() * 6) + 22);
                System.out.println(this.moonstone.GetName() + " поменял тепмпературу на " + (this.moonstone.GetTemperature() - k));
                this.znayka.MeasureTemperature(this.moonstone, this.OkrPredm);
                this.moonstone.LuchEnergyOut();
                this.moonstone.WarmEnergyOut(OkrPredm);
                i++;
            }
            System.out.println("ГЛАВА 3");
            this.time.SetMorning();
            this.znayka.WakeUp(time);
            UsualSubstance bed = new UsualSubstance("Кровать"){
                public void Contain1(Being being) {
                    System.out.println(being.GetName() + " на кровати");
                }
            };
            bed.Contain1(znayka);
            this.head.Headache(znayka.GetName());
            this.znayka.MakeGymnastic();
            this.head.HeadNotache(znayka.GetName());
            UsualSubstance room = new UsualSubstance("Комната"){
                public void Contain1(Being being) {
                    System.out.println(being.GetName() + " в комнате");
                }
            };
            room.Contain1(znayka);
            znayka.MakeUborka(znayka.ReturnNumberOfActions());
        } else {
            throw new NullObjectException();
        }
    }

}
