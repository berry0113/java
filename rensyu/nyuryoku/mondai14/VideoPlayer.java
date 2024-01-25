package rensyu.nyuryoku.mondai14;

public class VideoPlayer implements Player {
    private int id;
    private static int count = 0;

    // ---[ コンストラクタ ]---
    // コンストラクタとはファイル名と同じ、返り値がない
    public VideoPlayer() {
        id = ++count;
    }
    // -------------------------


    //interfaceの実装にはOverrideが必要 
    @Override public void play() {
        System.out.println("++ビデオ再生開始！");
    }
    @Override public void stop() {
        System.out.println("++ビデオ再生終了！");
    }
    public void printInfo() {
        System.out.println("++本機の製造番号は["+id+"]です。");
    }
}
