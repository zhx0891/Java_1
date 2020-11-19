package lesson7;

public class Cat {
    String name;
    private int hunger=15+(int)(5+Math.random()*10);//уникальный желудок
    boolean satiety = false;

    boolean toEat (Plate pl){
        if (satiety==false) {
            boolean a = pl.decreaseFood(hunger);
        if (a) this.satiety=true;
       return a;
    }else{
        return true;
         }
    }

    public int getHunger() {
        return hunger;
    }

public Cat(String name){
        this.name=name;


}
}

