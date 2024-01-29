package rensyu.nyuryoku.mondai14;
import java.util.Scanner;
class N_e {
    public static void main(String[] args){
        // ユーザからの入力を受け取る
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        String x = stdIn.next();
        String y = stdIn.next();

        // StringBuilderを変数にいれる
        StringBuilder generatedString = new StringBuilder(x);
        
        // xの後ろにyを加える
        generatedString.append(y);
        System.out.println(generatedString);
    }
}
