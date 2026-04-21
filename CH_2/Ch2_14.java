import java.util.Scanner;
public class Ch2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入message：");
        String message = sc.nextLine();
        System.out.println("您輸入的訊息是：" + message);
        sc.close();
    }

}


