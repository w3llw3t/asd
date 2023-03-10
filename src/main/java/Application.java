import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik = new Kotik("Java", "harRRRD", 12, 4);

        Kotik kotik2 = new Kotik();
        kotik2.setName("WAW");
        kotik2.setVoice("JIJA");
        kotik2.setWeight(8);
        kotik2.setSatiety(4);

        String[] array = kotik2.liveAnotherDay();
        for (String s : array) {
            System.out.println(s);
        }
/*
        System.out.print("Котика зовут " + kotik2.getName());
        System.out.println(", его вес = " + kotik2.getWeight());

        System.out.println("Одинаково ли разговаривают котики? = " +compareVoice(kotik,kotik2));
        int count = Kotik.getCount();
        System.out.println("Создано экземпляров в классе Animals.Kotik = "+count);
    }
    public static boolean compareVoice (Kotik kotik, Kotik kotik2) {
        if(kotik == null || kotik2 == null) {
            return false;
        }
        return kotik.getVoice().equals(kotik2.getVoice());
    }

     */
    }
}
