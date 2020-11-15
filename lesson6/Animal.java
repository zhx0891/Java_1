package lesson6;

public  abstract class Animal {
    static int count;
    String name;
    int height;
    int weight;
    int limit;

    public Animal(String name) {
        this.name = name;
        count++;
    }

   boolean run(int weight) {
        int luck=(int) (Math.random() * 100);
        limit+=luck;

        if (weight > limit) {
            return false;
        } else {
            return true;
        }

    }

    boolean swim(int weight) {
        int luck=(int) (Math.random() * 10);
        limit+=luck;
        if (weight > limit) {
            return false;
        } else {
            return true;
        }

    }

    boolean jump(int height) {
        int luck=1+((int) (Math.random() * 3));
        limit+=luck;
        if (weight > limit) {
            return false;
        } else {
            return true;
        }

    }
    void justDoIt(int run, int jump, int swim){
        System.out.println(this.name+ " результаты: ");
        System.out.println(+run+" метров бег "+this.run(run));
        limit=0;
        System.out.println(+jump+" метров прыжок "+this.jump(jump));
        limit=0;
        System.out.println(+swim+" метров плавание "+this.swim(swim));
        System.out.println();
    }
}