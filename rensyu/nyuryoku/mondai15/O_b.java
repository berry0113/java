package rensyu.nyuryoku.mondai15;
import java.util.InputMismatchException;
import java.util.Scanner;

class O_b {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数を入力 = ");
        try{
            // 整数値を入力してもらい
            int a = stdIn.nextInt();
            // 入力された数値が偶数なら
            if (isEven(a))
            // 表示する
                System.out.println(a+"は偶数");
            // 奇数なら
            else
                // 表示する
                System.out.println(a+"は奇数");
        // 入力されたものが違う型なら
        }catch (InputMismatchException e){
            // 表示する
            System.out.println("整数と認識できません！！");
        }
    }
    // 奇数か偶数か判断するメソッド
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
