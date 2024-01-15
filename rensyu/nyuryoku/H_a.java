package rensyu.nyuryoku;
import java.util.Scanner;
class H_a {
    static int[] al(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = i;
        return a;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] x = al(n);

        for (int i = 0; i <= 10; i++){
            System.out.println("list["+i+"]="+x[(i+1)]);
        }
    }
}
