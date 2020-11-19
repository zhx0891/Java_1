package lesson7;

import java.util.Scanner;

public class Kitchen {
    static Scanner answer = new Scanner(System.in);
    static Scanner finAns = new Scanner(System.in);
    static int ansValAddFood;

    public static boolean ques = true;

    public static void main(String[] args) {

        Plate pl1 = new Plate();
        Cat[] catsArr = new Cat[5];

        catsArr[0] = new Cat("Муся");
        catsArr[1] = new Cat("Пушок");
        catsArr[2] = new Cat("Буся");
        catsArr[3] = new Cat("Мотя");
        catsArr[4] = new Cat("Элеонора");

        do {
            pl1.info();
            System.out.println("сколько добавить еды?");
            ansValAddFood = answer.nextInt();
            pl1.setFood(ansValAddFood);
            pl1.info();

            for (int i = 0; i < catsArr.length; i++) {
                System.out.println("Сытость " + catsArr[i].name + " " + catsArr[i].toEat(pl1));
                pl1.info();
            }

            System.out.println("все кошки сыты?");
            String ans = finAns.next();

            if (ans.equals("да")) ques = false;

        }
            while (ques);


        }

    }




