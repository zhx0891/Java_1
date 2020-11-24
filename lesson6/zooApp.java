package lesson6;

import java.util.Random;

public class zooApp {
    public static Random rand = new Random();
    static int count;
    static int run = 100+rand.nextInt(400);
    static int jump = 1+rand.nextInt(5);
    static int swim = 1+rand.nextInt(10);

    public static void main(String[] args) {
        Animal cat1 = new Cat(" Мурзик ");
        Animal cat2 = new Cat(" Мурка ");
        Animal dog1 = new Dog("Шарик ");
        Animal dog2 = new Dog("Полкан ");

        cat1.justDoIt(run, jump, swim);
        cat2.justDoIt(run, jump, swim);
        dog1.justDoIt(run, jump, swim);
        dog2.justDoIt(run, jump, swim);
    }
}
