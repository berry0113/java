package rensyu.nyuryoku;

class G_d {
    public static void main(String[] args) {
        // 変数の作成
        int x = 0;
        int y = 0;
        // whileで条件達成するまで繰り返す
        while (x <= 100000) {
            x += y;
            y++;
        }
        // 合算した後にyに+1しているからy-1をする
        System.out.print("合計が100000を超えるnは"+(y-1)+"です");
    }
}
