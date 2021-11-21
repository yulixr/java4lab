import classes.*;

public class Main {
    public static void main(String[] args) throws NullObjectException, BorderException {
        Story tale = new Story();

        tale.AddZnayka(new Znayka("Знайка", 3));
        tale.AddFire(new Fire("Огонь"));
        tale.AddWater(new Water("Вода"));
        tale.AddMoonstone(new MoonStone("Лунный камень", 25, 2500));
        tale.AddProbka(new UsualThing("Пробка", 20, 600));
        tale.AddSalt(new UsualThing("Соль", 20, 1200));
        tale.AddSugar(new UsualThing("Сахар", 20, 1400));
        tale.AddOkrPredm(new UsualThing("Окружающие предметы", 20));
        tale.AddTigel(new UsualSubstance("Тигель"));
        tale.AddChemichals(new UsualThing("Химические соединения"));
        tale.AddWear(new Wear("Одежда"));
        tale.AddPodokonnik(new UsualSubstance("Подоконник"));
        tale.AddTime(new SetTime());

        tale.Go();
    }
}
