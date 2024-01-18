package rensyu.nyuryoku;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("半径を整数値を入力：");
        int x = stdIn.nextInt();
        double PI = 3.1415;
        double a = x*2*PI;
        double b = x*x*PI;
        System.out.println("円周の長さは"+a+"です。");
        System.out.println("円の面積は"+b+"です。");
    }
}
