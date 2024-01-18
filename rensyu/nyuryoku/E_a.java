package rensyu.nyuryoku;
import java.util.Scanner;
class E_a {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // A~Dを入力されたら
        System.out.println("A~Dの値を入力してください");
        String n = stdIn.next();
        switch (n) {
            // パターンによって表示させる
            case "A" : System.out.println("ランクAは評価「優」です");   break;
            case "B" : System.out.println("ランクBは評価「良」です");   break;
            case "C" : System.out.println("ランクCは評価「可」です");   break;
            case "D" : System.out.println("ランクDは評価「不可」です"); break;
        }
    }
}
