package rensyu.nyuryoku.mondai15;
import java.util.Scanner;
class O_a {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数1 = ");
        int num1 = stdIn.nextInt();
        System.out.print("整数2 = ");
        int num2 = stdIn.nextInt();
        try{
            double sum = num1 / num2;
            System.out.println(num1+" / "+num2+" = "+sum);
        }catch (ArithmeticException e){
            System.out.println("0による割り算です！！");
        }finally{
            System.out.println("処理終了");
        }
    }
}
