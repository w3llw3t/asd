import animals.*;
import employee.Worker;
import food.*;

public class Zoo {
    public static void main(String[] args) {

        Animal camel = new Camel();
        Animal duck = new Duck();
        Animal fish = new Fish();
        Animal kotik = new Kotik("Java", "meow", 3, 3);
        Animal Butterfly = new Butterfly();
        Animal Lion = new Lion("mur", 3);

        Food Grass = new Grass();
        Food Meat = new Meat();

        Worker worker1 = new Worker();
        worker1.feed(kotik, Grass);
        worker1.feed(kotik, Meat);
        System.out.println(((Voice) Lion).getVoice());

        Swim[] pond = createPond();

        for (Swim swim : pond) {
            swim.swim();
        }
    }

    public static Swim[] createPond() {
        return new Swim[]{new Fish(), new Duck(), new Lion("mur", 3)};
    }
}