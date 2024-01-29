package rensyu.nyuryoku.mondai14;
import java.util.Scanner;

public class N_c {
    public static void main(String[] args) {
        // ユーザからの入力を受け取る
        Scanner scanner = new Scanner(System.in);
        System.out.print("文字列を入力してください: ");
        String userInput = scanner.nextLine();

        // StringBuilderを使用して文字列を生成
        StringBuilder generatedString = new StringBuilder(userInput);

        // 文字列の長さが11文字以上の場合、11文字以降を削除
        if (generatedString.length() >= 11) {
            generatedString.setLength(10);
        }

        // 結果を表示
        System.out.println("結果文字列: " + generatedString.toString());

        // Scannerを閉じる
        scanner.close();
    }
}
