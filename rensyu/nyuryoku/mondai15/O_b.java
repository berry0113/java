package rensyu.nyuryoku.mondai15;
import java.util.InputMismatchException;
import java.util.Scanner;

class O_b {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数を入力 = ");
        try{
            int a = stdIn.nextInt();
            boolean b = a % 2 ==0;
            if (b == true)
                System.out.println(a+"は偶数");
            else if (b == false)
                System.out.println(a+"は奇数");
        }catch (InputMismatchException e){
            System.out.println("整数と認識できません！！");
        }
    }
}
