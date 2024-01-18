import java.util.Scanner;
class remake_test {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int sum, ave;
        // 合計値と平均値を入れる変数
        int[] array = new int[5];
        // 整数値リスト
        for (int i = 0; i < array.length; i++){
            System.out.print((i+1)+"教科目の点数を入力してください：");
            array[i] = stdIn.nextInt();
            // i番目に入力された数値をリストに入れる
            if (array[i] > 100){
                System.out.println("不正な点数を検知しました。0点とします。");
                array[i] = 0;
            }
            // 正しくない数値が入ったら表示し0点を入れる
                
            else if (0 > array[i]){
                System.out.println("不正な点数を検知しました。0点とします。");
                array[i] = 0;
            }
                
        
        }
        sum = array[0]+array[1]+array[2]+array[3]+array[4];
        ave = sum/5;
        // 合計値と平均値を表示
        System.out.println("合計点 = "+sum);
        System.out.println("平均点 = "+ave);
    }
}
