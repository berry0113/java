package rensyu.nyuryoku;
import java.util.Scanner;
class G_c {
    public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in);
        int x;
        // 一回目のループで変数に数値を入力してもらう
        do {
            System.out.print("整数値を入力：");
            x = stdIn.nextInt();
        } while(x<=0);
        // x>0のとき入力されたものを逆順で表示してもらう
        while (x > 0) {
            System.out.print(x % 10);
            x/=10;
        }
    }
}
