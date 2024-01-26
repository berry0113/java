package rensyu.nyuryoku.mondai14;
import java.util.Scanner;
class N_b {
    public static void main(String[] args){
        // 入力してもらう
        Scanner stdIn = new Scanner(System.in);
        System.out.print("文字列を入力：");
        String a = stdIn.next();
        // lengthを使って何文字あるかを表示する
        System.out.println("入力された文字数は"+a.length()+"です。");
    }
}
