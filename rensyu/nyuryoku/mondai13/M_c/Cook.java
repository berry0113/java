package rensyu.nyuryoku.mondai13.M_c;

// Personから機能を調達する
public class Cook implements Person {
    // 変数の設定
    private String name ="大原太郎";
    private String job = "シェフ";
    private String specialties = "オムライス";

    // 機能を上書きする
    @Override public void introduce(){
        System.out.println("氏名："+name);
        System.out.println("職種："+job);
        System.out.println("得意料理："+specialties);
    }
}
