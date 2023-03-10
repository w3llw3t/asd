package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal{

    public void eat(int energy) {
        satiety += energy;
    }
    public void eat() {
        eat(3);
    }
    @Override
    public void eat(Food food) {
        if(food instanceof Grass) {
            System.out.println("Хищники не едят траву");
        }
        else this.eat();
    }

}
