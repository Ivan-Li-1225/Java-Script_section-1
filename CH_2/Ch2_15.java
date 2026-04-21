import java.util.Scanner;
public class Ch2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入年齡：");
        int age = sc.nextInt();
        System.out.println("您輸入的年齡是：" + age);

        if (age >= 18) {
            System.out.println("您已成年");
        } else {
            System.out.println("您未成年");
        }

        sc.close();
    }
}

