package rensyu.nyuryoku.mondai11;
import java.util.Scanner;
// メインの機能
class K_a {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // 半径を入力
        System.out.print("半径を整数値を入力：");
        // 変数にクラスを入れ引き出してそれぞれの数値を代入
        Circle a =new Circle(stdIn.nextInt(), 3.1415);
        // Circleクラスのprinterを持ってくる
        a.printer();
    }
}
// 計算などのクラスの作成
class Circle {
    // それぞれの型の指定
    int x;
    double a;
    double b;
    double c;
    // 二つの数値を使えるようにする
    Circle(int x, double a){
        this.x = x;
        this.a = a;
    }
    public void printer(){
        // 円周と円の面積の公式を当てはめる
        b = x*2*a;
        c = x*x*a;
        // 表示させる
        System.out.println("円周の長さは"+b+"です。");
        System.out.println("円の面積は"+c+"です。");

    }

}