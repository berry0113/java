package rensyu.nyuryoku.mondai11;
import java.util.Scanner;
import java.math.*;
class Student {
    // ----- [ プロパティ ] -----
    int kokugo;
    int suugaku;
    int eigo;
    // --------------------------

    // ----------- [ コンストラクタ ] -----------
    Student(int kokugo, int suugaku, int eigo){
        this.kokugo = kokugo;
        this.suugaku = suugaku;
        this.eigo = eigo;
    }
    // ------------------------------------------

    // ------- [ メソッド ] -------
    // どうやっても小数点以下の切り捨てができなかったので教えてください
    double Average() {
        double goukei = (this.kokugo + this.suugaku + this.eigo)/3;
        return goukei;
    }
    // ----------------------------
}


class K_j {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        // forで入力や表示を三回繰り返す
        // 名前や学生番号、テストの点数を入力してもらう
        for (int a = 0; a <= 2; a++){
            System.out.println("お名前を入力してください：");
            String name = stdIn.next();
            System.out.print("学生番号を入力してください：");
            String number = stdIn.next();
            System.out.println("点数を入力してください：");
            int k = stdIn.nextInt();
            int s = stdIn.nextInt();
            int e = stdIn.nextInt();
            // 変数にクラスを当てはめて
            Student sum = new Student(k, s, e);
            // 表示させる
            System.out.print(number + "番 "+ name +"さん 平均点"+ sum.Average());
        }
    }
}
