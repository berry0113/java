package rensyu.nyuryoku;
import java.util.Scanner;

class A_i {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        System.out.print("お名前を入力してください＞");
        String str = stdIn.next();
        System.out.println("こんにちは" + str + "さん！");
    }
}
