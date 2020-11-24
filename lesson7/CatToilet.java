package lesson7;

public class CatToilet {
    int capacity = 100;
    int fullness = 0;
//    public CatToilet() {
//    }
public void info(){
    System.out.println("Наполненность лотка: "+fullness);
}
    public int catMakesPile(int sizeStomach) {
    if (fullness < capacity) {
            int a = (int) (sizeStomach * 0.8);
            fullness += a;
            return a;
        } else {
            this.info();
            return 0;
        }
    }
}