package lesson7;

public class Cat {
    String name;
    private int sizeStomach=15+(int)(5+Math.random()*10);//уникальный желудок
    boolean satiety = false; //удовлетворённость

    int makePile(CatToilet toilet){  //метод создания кучки
        if(satiety==true) {
            System.out.println(name + " отложил кучку");
            return toilet.catMakesPile(sizeStomach);
        }else{
            System.out.println("у " +name+" желудок пуст, невозможно сделать кучу, мяв!");
            return 0;
        }
    }

    boolean toEat (Plate pl){
        if (satiety==false) {
           this.satiety=false;
            boolean a = pl.decreaseFood(sizeStomach);
        if (a) this.satiety=true;

       return a;
    }else{

        return true;
         }
    }

//    public int getHunger() {
//        return sizeStomach;
//    }

public Cat(String name){
        this.name=name;


}
}

