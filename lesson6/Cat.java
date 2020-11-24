package lesson6;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
   @Override
   boolean run(int weight){
       limit=150;
       return super.run(weight);
   }

    @Override
    boolean swim(int weight) {
        return false;
    }

    @Override
    boolean jump(int height){
        limit=2;
        return super.run(height);

    }



}
