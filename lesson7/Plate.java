package lesson7;

public class Plate {
    private int food = 80+(int)(15+(Math.random()*30));

    public void setFood(int addFood) {
        this.food +=addFood;
    }

    public int getFood() {
        return food;
    }

    public Plate(){

    }
    public void  info (){
        System.out.println("еды в тарелке "+food);
    }
    public boolean decreaseFood(int n){
        if ((food-n)<0) {
            return false;
        }else {
            food-=n;
            return true;
        }
    }
}
