package rensyu.nyuryoku;
import java.util.Scanner;
class I_a {
    static void name(String a, String b) {
        System.out.println("学校名："+a);
        System.out.println("名前："+b);
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        String a = stdIn.next();
        String b = stdIn.next();
        name(a,b);
    }
}
