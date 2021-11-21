package classes;

public class Znayka extends Being implements BeingAction {
    private static int NumberOfActions;
    public Znayka(String name) {
        super(name);
    }
    public Znayka(String name, int Num) {
        super(name);
        NumberOfActions = Num;
    }
    public void GoSleep(SetTime time){
        if (time.GetTime() == TimeOfDay.night)
            System.out.println(this.GetName() + " лег спать");
    }

    public void WakeUp(SetTime time){
        if (time.GetTime() == TimeOfDay.morning)
            System.out.println(this.GetName() + " проснулся");
    }
    public class Head{
        public void Headache(String name){
            System.out.println("голова болит у " + name);
        }
        public void HeadNotache(String name){
            System.out.println("голова не болит у " + name);
        }
    }
    public Head CreateHead(){
        return new Head();
    }

    public int ReturnNumberOfActions() throws BorderException{
        if (NumberOfActions>0)
            return NumberOfActions;
        else
            throw new BorderException("Нет никаких действий. Добавьте их количество в знайку");
    }

}
