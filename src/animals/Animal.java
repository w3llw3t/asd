package animals;

import food.Food;

public abstract class Animal {

    String voice;
    int satiety;

    public int getSatiety() {
        return this.satiety;
    }

    public abstract void eat(Food food);

    public Animal (String voice, int satiety) {
        this.voice = voice;
        this.satiety = satiety;
    }
    public Animal() {

    }
}
