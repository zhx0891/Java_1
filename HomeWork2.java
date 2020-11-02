package HWork;

import java.util.Arrays;

public class HomeWork2 {
    public  static int randomNum (){
        int a = 3+(int) (Math.random() * 15);
        return a;
    }
    public static  void printArr(int arr[]){
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }
    public static int[] randIntArr() {
        int a = randomNum();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = randomNum();
        }
        return arr;
    }

    public static void first() {
        int[] binarr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; //объявляю массив с заданными значениями

        for(int i =0; i < binarr.length; i++){
            if (binarr[i] == 1) {
                binarr[i] = 0;
            } else {
                binarr[i] = 1;
            }
        }
        printArr(binarr);

    }

    public static void second() {
        int value = 0;
        int[] intarr = new int[8];

        for (int i = 0; i < 8; i++) {
            intarr[i] = value;
            value += 3;
        }
        printArr(intarr);
    }

    public static void third() {
        int value;
        int[] intarr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 8; i++) {
            value = intarr[i];
            if (value < 6) {
                intarr[i] = value *= 2;
            }
        }
        printArr(intarr);
        System.out.println();
    }

    public static void fourth() {
        int a = 3+(int) (Math.random() * 10);
        int[][] intarr = new int[a][a];
        int valX = 0;
        int valY = 0;
        for(int i = 0; i < a; i++) {
            intarr[valY][valX] = 1;
            valX += 1;
            valY += 1;
        }
        valY=0;
        valX = a-1;
        for(int i = valX; i >= 0; i--) {
            intarr[valY][valX] = 1;
            valY += 1;
            valX -=1;
        }
        for (int i = 0; i < a; i++){
            for (int j =0; j<a; j++) {
                System.out.print(intarr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void fifth(){
        int indBN =0;
        int biggestNum = 0;
        int intArr [] = randIntArr();
            printArr(intArr);
        for (int i = 0; i <intArr.length ; i++) {
          if (intArr[i]>=biggestNum) {
              biggestNum=intArr[i];
              indBN=i;
          }
        }
        System.out.println("Наибольшее число в массиве = " +biggestNum+", его индекс (от нулевого) "+indBN);
    }
    public static boolean sixth(int arr[]){

        boolean res = false;
        int sumArr = 0;
        for (int i = 0; i < arr.length ; i++) {
             sumArr +=arr[i];
            }
        printArr(arr);
        System.out.println(sumArr +" "+arr.length );
        int rightSum =0 ;
        int leftSum= sumArr;
            for (int i = 1; i < arr.length; i++) {
                rightSum +=arr[arr.length-i];
                leftSum -=arr[arr.length-i];
                if (leftSum == rightSum ){
                    res = true;
                    break;
                }

            }

        return res;
        }

    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
        fifth();
        System.out.println(sixth(randIntArr()));


    }

}



