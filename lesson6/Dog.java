package lesson6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    boolean run(int weight){
        limit=400;
        return super.run(weight);
    }

    @Override
    boolean swim(int weight) {
        limit=5;
        return super.swim(weight);
    }

    @Override
    boolean jump(int height){
        limit=2;
        return super.run(height);
    }

}
