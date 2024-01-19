package rensyu.nyuryoku;
import java.util.Scanner;
public class K_b {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();
        int z = 0;
        int b = x;
        for (int a = 0; x<=y; x++){
            a += x;
            z = a;
        }
        System.out.println(b +"から"+ y +"までの合計値は"+ z +"です。");
    }
}
