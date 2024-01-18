package rensyu.nyuryoku;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class H_e {
    public static void main(String[] args) {
        // リストの作成
/*        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        // 全部足したものを変数に入れる
        int b = a[0]+a[1]+a[2]+a[3]+a[4]; 
        System.out.println("合計値は"+(b)+"です。");
        System.out.println("平均値は"+(b*10/5/10)+"です。");

        // 要素数が５のリストを作成し、全要素の合計値と平均値を表示する
        // 整数値リスト
        int[] array = {1,2,3,4,5};
        int sum =0;   //合計値

        // 合計値を表示
        for(int i = 0; i < array.length ; i++) {
            sum += array[i];
        }
        // 合計を出力
        System.out.println("合計値は"+sum+"です。");
        // 平均値を出力
        System.out.println("平均値は"+(sum/array.length)+"です。");
// intの本来の形はInregerだからリストを宣言するときなどは使う
*/
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        int sum = 0;
        for(int i = 0; i < array.size() ; i++) {
            sum += array.get(i);
            System.out.println("合計値は"+sum+"です。");
            System.out.println("平均値は"+(sum/array.size())+"です。");
        }

    }
}
