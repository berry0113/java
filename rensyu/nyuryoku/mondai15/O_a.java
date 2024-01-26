package rensyu.nyuryoku.mondai15;
import java.util.Scanner;
class O_a {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // 入力してもらう
        System.out.print("整数1 = ");
        int num1 = stdIn.nextInt();
        System.out.print("整数2 = ");
        int num2 = stdIn.nextInt();

        // 整数値１わる整数値２をする
        try{
            double sum = num1 / num2;
            System.out.println(num1+" / "+num2+" = "+sum);
        // 入力されたものが０でエラーが起きたときにでてくる
        }catch (ArithmeticException e){
            System.out.println("0による割り算です！！");
        // 最後にこの処理をする
        }finally{
            System.out.println("処理終了");
        }
    }
}
