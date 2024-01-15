package rensyu.nyuryoku;
import java.util.Scanner;
class C_m {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("長方形の面積を求めます");
        System.out.print("横の長さ："); int h = stdIn.nextInt();
        System.out.print("縦の長さ："); int w = stdIn.nextInt();
        System.out.println("長方形の面積＝"+(h*w));
    } 
}
