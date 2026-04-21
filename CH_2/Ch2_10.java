import java.util.Scanner;

public class Ch2_10 {
    public static void main(String[] args) {
        System.out.println("請輸入一個整數：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 接收使用者輸入的整數
        System.out.println("您輸入的整數是：" + num);
        sc.close();

    }
}
