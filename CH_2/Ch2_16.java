import java.util.Scanner; // 必須匯入 Scanner 類別

public class Ch2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 建立 Scanner 物件，從鍵盤讀取輸入

        // 在這裡撰寫您的程式碼
        System.out.print("請輸入Score：");
        int score = sc.nextInt();
        System.out.println("Score = " + score);

        // 大於等於60分輸出pass，否則輸出fail
        if (score >= 60) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        sc.close(); // 使用完畢後關閉 Scanner
    }
}
