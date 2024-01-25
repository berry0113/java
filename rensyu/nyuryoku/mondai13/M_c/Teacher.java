package rensyu.nyuryoku.mondai13.M_c;

// Personから機能を調達する
public class Teacher implements Person {
    // 変数の設定
    private String name ="竹井一馬";
    private String job = "教員";
    private String subject = "情報処理";

    // 機能を上書きする
    @Override public void introduce(){
        System.out.println("氏名："+name);
        System.out.println("職種："+job);
        System.out.println("担当科目："+subject);
    }
}