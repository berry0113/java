package rensyu.nyuryoku.mondai14;
import java.util.Scanner;
class N_d {
    public static void main(String[] args){
        // ユーザからの入力を受け取る
        Scanner stdIn = new Scanner(System.in);

        System.out.print("1つ目の文字列を入力：");
        String x = stdIn.next();
        System.out.print("2つ目の文字列を入力：");
        String y = stdIn.next();
        
        // equalsで入力されたものを比較してあっていたら表示する
        if (x.equals(y))
            System.out.println("同じ文字列です。");
    }
}
