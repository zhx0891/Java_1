package java_1.hw;

import java.util.Scanner;

public class HomeWork3 {

  public static int app = (int) (Math.random() * 9);
  public static int checkVal(int app, int count) {

      Scanner sc = new Scanner(System.in);
      int usr = sc.nextInt();


      if (usr>= 0 & 9 >=usr) {
        if(app==usr){
            System.out.println("вы угадали, это победа");
            count=5;
        }else if(app>usr){
            System.out.println("ваше число меньше");
            count++;
        }else {
            System.out.println("ваше число больше");
            count++;
        }
      }else{
        System.out.println("Число вне диапазона от  0 до 9!");
        count++;
      }return count;
  }

    public static void main(String[] args) {
        System.out.println("угадайте число от 0 до 9");
        int count = 1;
        while (count <= 4) {
            switch (count) {
                case 1:
                    System.out.println("первая попытка");
                    count = checkVal(app, count);
                    break;
                case 2:
                    System.out.println("вторая попытка");
                    count = checkVal(app, count);
                    break;
                case 3:
                    System.out.println("третья попытка");
                    count = checkVal(app, count);
                    break;
                case 4:
                    System.out.println("ваши шансы истекли, конец игры");
                    count=6;
                    break;
            }
        }
    }
}
