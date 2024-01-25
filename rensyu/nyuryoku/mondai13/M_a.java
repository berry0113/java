package rensyu.nyuryoku.mondai13;

import rensyu.nyuryoku.mondai13.M_c.Teacher;

/**
 * 人クラス
 * 
*/
abstract class Person {
    // 名前
    String name = "";
    // 職業
    String job = "";

    
    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     */
    Person(String name, String job){
        this.name = name;
        this.job = job;
    }

    /**
     * 自己紹介
     * 
     */
    abstract void introduce();
}
        

/**
 * 教師クラス
 * 
 */
class Teacher extends Person {

    // ----- [ プロパティ ] -----
    // 担当科目
    String subject = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     * @param subject 担当科目
     */
    public Teacher(String name, String job, String subject) {
        // 親クラスのコンストラクタを呼び出し
        super(name,job);
        this.subject = subject;
    }

    /**
     * 自己紹介
     * 
     */
    @Override void introduce() {
        System.out.println("氏名："+this.name);
        System.out.println("職業："+this.job);
        System.out.println("担当科目："+this.subject);
    }
}
    
/**
 * 料理人クラス
 * 
 */
class Cook extends Person {

    // 得意料理
    String specialites = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     * @param specialities 得意料理
     */
    public Cook(String name, String job, String specialities) {
        // 親クラスのコンストラクタを呼び出し
        super(name, job);
        this.specialites = specialities;
    }

    /**
     * 自己紹介
     * 
     */
    @Override void introduce() {
        System.out.println("氏名："+this.name);
        System.out.println("職業："+this.job);
        System.out.println("得意料理："+this.specialites);
    }
}

/**
 * メイン処理クラス
 */
public class M_a { 
    public static void main(String[] args) {
        // 教師クラス作成
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");
        // 料理人クラス作成
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");
        
        // 自身の情報を表示
        teacher.introduce();
        System.out.println("");
        cook.introduce();
    }
}

