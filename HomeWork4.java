
package HWork.Java_1.git;

import java.util.Scanner;
import java.util.Random;

public class HomeWork4 {
    public static final char USR = 'X';
    public static final char APP = 'O';
    public static final char EMP = '•';
    public static final int SIZE = 3;
    public static final int VICTORY = 3;
    public static Random rand = new Random(); //не забудь убрать
    public static Scanner scan = new Scanner(System.in);
    public static char[][] pF = new char[SIZE][SIZE];
    public static int x;
    public static int y;
    public static  int turnAI =0;
    public static void createPF(){
        for (int i = 0; i <SIZE ; i++) {
            for (int j = 0; j <SIZE ; j++) {
                pF[i][j]=EMP;
            }
        }
    }
    public static void showPF() {
        for (int i = 0; i < 5; i++) {
            System.out.println();

        }
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i+1+" ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(pF[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean checkWiner ( char player ){
        //проверка по горизонталям
        int win=0;
        for ( y =0; y < SIZE; y++) {
            win = 0;
            for (int i = 0; i < SIZE; i++) {
                if(pF[y][i] == player) win++;
                if (win==VICTORY) return true;
            }
        }
        //проверка по вертикалям
        for (x = 0; x < SIZE; x++) {
            win = 0;
            for (int i = 0; i < SIZE; i++) {
                if(pF[i][x] == player) win++;
                if (win==VICTORY) return true;
            }
        }win = 0;

        //проверка по диагонали слева направо

        for (int i = 0; i < SIZE; i++) {
            if(pF[i][i]==player) win++;
            if (win==VICTORY) return true;
        }
        win=0;
        //проверка по диагонали справа налево
        for (int i = (SIZE-1), j = 0; i>=0; i--, j++){
            if(pF[i][j]==player) win++;
            if (win==VICTORY) return true;
        }
        return false;
    }
    private static void usrTurn() {
        do {

            System.out.println("Ход первого игрока, выберите  координату X");
            x = scan.nextInt() - 1;
            System.out.println("Ход первого игрока, выберите координату Y");
            y = scan.nextInt() - 1;
        }
        while (!checkTurn(x, y));
        pF[y][x] = USR;
    }

    private static void appTurn() {
        do {
            System.out.println("Ход второго игрока, выберите  координату X");
            x = scan.nextInt() - 1;
            System.out.println("Ход второго игрока,выберите  координату Y");
            y = scan.nextInt() - 1;
        }
        while (!checkTurn(x, y));
        pF[y][x] = APP;
    }
    public static void aiTurn(){
        turnAI++;
        switch(turnAI) {
            case 1:   //проверка точки в центре
                if (pF[SIZE / 2][SIZE / 2] == EMP) {
                    pF[SIZE / 2][SIZE / 2] = APP;
                    break;
                }else{
                    checkCell();
                    break;
                }


            case 2://проверка нижнего левого угла
                if (pF[SIZE-1][0] == EMP) {
                    pF[SIZE-1][0] = APP;
                    break;
                }else{
                    checkCell();
                    break;
                }


            case 3://проверка верхнего правого угла
                if (pF[0][SIZE-1] == EMP) {
                    pF[0][SIZE-1] = APP;
                    break;
                } else {
                    checkCell();
                    break;
                }

            case 4://проверка верхнего левого угла
                if (pF[0][0] == EMP) {
                    pF[0][0] = APP;
                    break;
                } else {
                    checkCell();
                    break;
                }

            case 5://проверка нижнего правого угла
                if (pF[SIZE-1][SIZE-1] == EMP) {
                    pF[SIZE-1][SIZE-1] = APP;
                    break;
                } else {
                    checkCell();
                    break;
                }

        }
    }
    public static void checkCell() {
        int win=0;
//проверка горизонталей
        for ( y =0; y < SIZE; y++) {
            win = 0;
            for (int i = 0; i < SIZE; i++) {
                if(pF[y][i] == USR) win++;//?
                if (win==2) {
                    if (checkTurn((SIZE/2), y)) pF[y][i-2]=APP;
                    if (checkTurn((i+1), y)) pF[y][i+1]=APP;
                    if (checkTurn((i-2), y)) pF[y][i-2]=APP;
                }
            }win = 0;
        }
        //проверка вертикалей
        for (x = 0; x < SIZE; x++) {
            win = 0;
            for (int i = 0; i < SIZE; i++) {
                if(pF[i][x] == USR) win++;
                if (win==2) {
                    if (checkTurn(x,(SIZE/2))) pF[SIZE/2][x]=APP;
                    if (checkTurn(x,(i+1))) pF[i+1][x]=APP;
                    if (checkTurn(x,(i-2))) pF[i-2][x]=APP;
                }
            }win = 0;
        }
//проверка диагонали слева направо
        for (int i = 0; i < SIZE; i++) {
            if(pF[i][i]==USR) win++;
            if (win==2) {
                if (checkTurn((i+1),(i+1))) pF[i+1][i+1]=APP;
                if (checkTurn((i+1),(i-2))) pF[i-2][i-2]=APP;

            }
        }
        win = 0;
//проверка диагонали справа налево
        for (int i = (SIZE-1), j = 0; i>=0; i--, j++){
            if(pF[i][j]==USR) win++;
            if (win==2) {
                if (checkTurn((i+1),(j+1))) pF[i+1][j+1]=APP;
                if (checkTurn((i+1),(j-2))) pF[i-2][j-2]=APP;
            }

        }

    }
    public static boolean checkTurn (int x, int y) {

        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (pF[y][x] == EMP) return true;
        return false;
    }

    public static boolean checkNextTurn () {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (pF[i][j] == EMP) return true;
            }
        }
        return false;
    }

    public static boolean tic() {
        showPF();
        usrTurn();
        if (checkWiner(USR)==true) {
            showPF();
            return true;
        }return false;
    }
    public static boolean tac() {
        showPF();
        aiTurn();
//        appTurn();
        if (checkWiner(APP)==true) {
            showPF();
            return true;
        }return false;
    }
    public static void main(String[] args) {
        createPF();
        do {
            if (tic()==true) break;
            if (tac()==true) break;
        } while (checkNextTurn());
    }
}
