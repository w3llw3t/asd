package animals;

import food.Food;

public class Duck extends Herbivore implements Run, Swim, Fly, Voice {

    private String voice;
    @Override
    public int getSatiety() {
        return satiety;
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }

    @Override
    public void run() {
        System.out.println("Утка бегает");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }

    @Override
    public String getVoice() {
        return voice;
    }

}
