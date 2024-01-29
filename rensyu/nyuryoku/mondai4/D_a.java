package rensyu.nyuryoku.mondai4;
import java.util.Scanner;
class D_a {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // 表示
        System.out.print("0~100までの得点（整数値）を入力してください：");
        // 入力
        int a = stdIn.nextInt();
        // 80以上なら「合格」と表示させる
        if (a >= 80)
            System.out.println("合格です");
    }
}
