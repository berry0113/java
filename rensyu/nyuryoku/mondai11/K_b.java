package rensyu.nyuryoku.mondai11;
class K_b {
    public static void main(String[] args) {
        // 変数に入力された数値を入れる
        // クラスを引っ張ってくる
        Gyudon abo = new Gyudon();
        abo.tune();
    }
}
// 計算などのクラスの作成
class Gyudon {
    // 型の指定
    static int x = 100;
    static int y = 200;
    // メインのほうに二つの数値を使うことができるようにする
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