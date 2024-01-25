package rensyu.nyuryoku.mondai11;
import java.util.Scanner;
class K_c {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // 変数に入力された数値を入れる
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();
        // クラスを引っ張ってくる
        Gyudon2 abo = new Gyudon2(x, y);
        abo.tune();
    }
}
// 計算などのクラスの作成
class Gyudon2{
    // 型の指定
    int x;
    int y;
    
    // メインのほうに二つの数値を使うことができるようにする
    Gyudon2(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void tune(){
        // それぞれ変数をつくる
        int z = 0;
        int b = x;
        // 計算
        for (int a = 0; x<=y; x++){
            a += x;
            z = a;
        }
        // 表示させる
        // aはforの中しか使えないから別の変数に入れて使用している
        System.out.println(b +"から"+ y +"までの合計値は"+ z +"です。");
    }
}