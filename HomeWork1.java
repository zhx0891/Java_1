package HWork;

public class HomeWork1 {
    public static byte a = 127; //8 бит от -128 до 127//
    public static short b = 15000; // 16 бит от - 32768 до 32767
    public static int c = 2; //32бита  2,9 млрд
    public static long d = 3456346; //64 бита
    public static float e = 0.1f;  //32 бита
    public static double f = 3.0; //64 бита
    public static char g = 5; //один, любой символ
    public static boolean h = true; //истина или  ложь
    public static String i = "Ерлан"; //строка

    public  static void third (byte a, short b, int c, long d) {
        System.out.println(a * (b + (c / d)));
    }
    public static boolean fourth (int a1, int a2) {
        boolean res;
        int sum = a1 + a2;
        if (sum >= 10 && sum <= 20) {
            res = true;
        }else{
            res =false;
        }
        return res;
    }
    public static void fifth (int a) {
        if (a >= 0) {
            System.out.println("число положительное");
        }else {
            System.out.println("число отрицательное");
        }
    }
    public static boolean sixth (int num) {
        boolean res;
        if (num >= 0) {
            res = false;
        }else {
            res =true;
        }
        return res;
    }
    public static void seventh (String name) {
        System.out.println("Привет, " +name);
    }
    public static void eigth ( int year) {
        boolean a8 = (year % 4) == 0;
        boolean b8 =  (year % 100) != 0;
        boolean c8 = (year % 400) == 0;

        if (a8 & (b8 | c8) ) {
            System.out.println(year + " год  является високосным");
        } else {
            System.out.println(year+ " год не является високосным");
        }
    }


    public static void main(String[] args) {

        third (a,b,c,d);
        System.out.println(fourth(4,10));
        fifth(0);
        System.out.println( sixth(80));
        seventh(i);
        eigth(2024);
    }
}
