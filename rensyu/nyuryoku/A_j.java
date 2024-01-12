package rensyu.nyuryoku;
import java.util.Scanner;
class A_j{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        System.out.print("文字の入力：");
        String y = stdIn.next();
        System.out.print("整数の入力：");
        int x = stdIn.nextInt();
        System.out.print("小数の入力：");
        double z = stdIn.nextDouble();
        System.out.println("入力された文字 = " + y);
        System.out.println("入力された整数 = " + x);
        System.out.println("入力された小数 = " + z);
    }
}

