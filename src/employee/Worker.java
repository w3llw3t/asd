package employee;

import animals.*;
import food.Food;

public class Worker {
    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }
    public void getVoice(Voice animal) {
        animal.getVoice();
    }


}
