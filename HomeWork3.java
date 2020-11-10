package java_1.hw;

import java.util.Scanner;

public class HomeWork3 {
    protected static int appInt = (int) (Math.random() * 9);
    public static void main(String[] args) {
        int b =1;
        while (b == 1) {
            String a = "";
            for (int i = 0; i < 3; i++) {
                if (a != "вы угадали, это победа") {
                    System.out.println("введите число от 0 до 9");
                    Scanner scan = new Scanner(System.in);
                    int usrInt = scan.nextInt();
                    a = checkUserInt(usrInt);
                    System.out.println(a);
                }
            }
            System.out.println("Игра окончена, повторить игру еще раз? 1 – да / 0 – нет");
            Scanner scan = new Scanner(System.in);
            b = scan.nextInt();
        }
        System.out.println("GameOver"); // не понимаю почему  это не срабатывает, по идее закрывается while  и это выражение должно выполняться следующим
    }
    private static String checkUserInt(int usr) {
        String ans="";
        if ((usr < 0) || (9 < usr)) {
            ans = "число вне диапазона от 0 до 9";
        }else {
            if (usr == appInt) ans = "вы угадали, это победа";
            if (appInt > usr) ans = "ваше число меньше";
            if (appInt < usr) ans = "ваше число больше";
        }
        return ans;
    }
}
