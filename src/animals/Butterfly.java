package animals;

public class Butterfly extends Herbivore implements Fly {

    @Override
    public int getSatiety() {
        return satiety;
    }

    @Override
    public void fly() {
        System.out.println("Бабочка летает");
    }
}
