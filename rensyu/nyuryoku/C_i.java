package rensyu.nyuryoku;
import java.util.Scanner;
class C_i {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // int型で入力されたものを入れる
        int n = stdIn.nextInt();
        // sはdouble型で使用する
        double s;
        // 半径の公式を当てはめ四捨五入させる
        s = Math.round(n*n*3.14 * 100);
        // 小数点２位以下は出さないように表示させる
        System.out.println(s/100);
    }
}
