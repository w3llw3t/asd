package animals;

public class Fish extends Carnivorous implements Swim {

    @Override
    public int getSatiety() {
        return satiety;
    }
    @Override
    public void swim() {
        System.out.println("Рыбка плавает");
    }
}
