package animals;

public class Camel extends Herbivore implements Run {

    @Override
    public int getSatiety() {
        return satiety;
    }

    @Override
    public void run() {
        System.out.println("Верблюд бегает");
    }
}
