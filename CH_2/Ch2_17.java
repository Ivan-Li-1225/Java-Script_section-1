import java.util.Scanner;

public class Ch2_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入Score：");
        int score = sc.nextInt();

        if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

        sc.close();
    }
}