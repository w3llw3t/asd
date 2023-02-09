package Animals;

public class Kotik {
    private static final int METHODS = 5;
    private String name;
    private String voice;
    private int satiety;
    private int weight;

    public static int getCount() {
        return count;
    }

    private static int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Kotik(String name, String voice, int weight, int satiety) {
        count++;
        this.name = name;
        this.voice = voice;
        this.weight = weight;
        this.satiety = satiety;
    }

    public Kotik() {
        count++;
    }

    public boolean play() {
        if (this.satiety > 0) {
            this.satiety--;
            return true;
        } else
        return false;
    }

    public boolean sleep() {
        if (this.satiety > 0) {
            this.satiety--;
            return true;
        } else
        return false;
    }

    public boolean wash() {
        if (this.satiety > 0) {
            this.satiety--;
            return true;
        } else
        return false;
    }

    public boolean walk() {
        if (this.satiety > 0) {
            this.satiety--;
            return true;
        } else
        return false;
    }

    public boolean hunt() {
        if (this.satiety > 0) {
            this.satiety--;
            return true;
        } else
        return false;
    }

    public void eat(int energy) {
        satiety += energy;
    }

    public void eat(int energy, String foodName) {
        this.satiety += energy;
        this.food = foodName;
    }

    public void eat() {
        eat(3, "ЕДУ");
    }

    public String[] liveAnotherDay () {
        String[] action = new String[24];
        for (int i = 0; i < action.length; i++) {
            int random = (int) (Math.random() * METHODS) + 1;
            switch (random) {
                case 1:
                    if (play()) {
                        action[i] = i + " - играл ";
                    } else {
                        eat();
                        action[i] = i + " - ел "+ getFood();
                    }
                    break;
                case 2:
                    if (sleep()) {
                        action[i] = i + " - спал ";
                    } else {
                        eat();
                        action[i] = i + " - ел " + getFood();
                    }
                    break;
                case 3:
                    if (wash()) {
                        action[i] = i + " - умывался ";
                    } else {
                        eat();
                        action[i] = i + " - ел " + getFood();
                    }
                    break;
                case 4:
                    if (walk()) {
                        action[i] = i + " - гулял ";
                    } else {
                        eat();
                        action[i] = i + " - ел " + getFood();
                    }
                    break;
                case 5:
                    if (hunt()) {
                        action[i] = i + " - охотился ";
                    } else {
                        eat();
                        action[i] = i + " - ел " + getFood();
                    }
                    break;
            }
        }
        return action;
    }

    private String food;
    public String getFood () {
        return food;
    }
    public void setFood (String food) {
        this.food = food;
    }
}

