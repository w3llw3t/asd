package animals;

public class Lion extends Carnivorous implements Swim, Run, Voice {

    String voice;

    public Lion (String voice, int satiety) {
        this.voice = voice;
        this.satiety = satiety;
    }
    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
    public int getSatiety() {
        return satiety;
    }

    @Override
    public void run() {
        System.out.println("Лев бегает");
    }

    @Override
    public void swim() {
        System.out.println("Лев плавает");
    }

    @Override
    public String getVoice() {
        return voice;
    }
}
