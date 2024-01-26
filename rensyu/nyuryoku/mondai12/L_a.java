package rensyu.nyuryoku.mondai12;
import java.util.Scanner;

class Calculator {
    int x, y;
    // 一つ目のクラスの中身
    Calculator(int x, int y) {this.x = x; this.y = y;}
    // 足し算
    void calcSum(int x, int y){
        int z = x + y;
        System.out.println("Sum "+x+" and "+y+" = "+z);
    }
    // 平均


    void calcAve(int x, int y){
        double z = (x + y)/2;
        System.out.println("Average "+x+" and "+y+" = "+z);
    }
}

class MoreCalc extends Calculator {
    // 一つ目のクラスを継承して二つ目のクラスを作る
    MoreCalc(int x, int y){super(x, y);}
    // 掛け算
    void calcPow(int x, int y){
        double z = Math.pow(x, y);
        System.out.println("Power "+x+" of "+y+" = "+z);
    }
}

class L_a {
    public static void main(String[] args) {
        // 入力してもらう
        Scanner stdIn = new Scanner(System.in);
        System.out.println("整数を入力してください：");
        int x = stdIn.nextInt();
        System.out.println("整数を入力してください：");
        int y = stdIn.nextInt();
        // サブクラスを変数に入れて全部使う
        MoreCalc a = new MoreCalc(x, y);
        a.calcSum(x, y);
        a.calcAve(x, y);
        a.calcPow(x, y);

    }
}
