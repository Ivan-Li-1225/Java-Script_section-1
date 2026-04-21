import java.util.Scanner;

public class Ch2_11 {
    public static void main(String[] args) {

        // 顯示輸入年齡
        // 判斷是否為成年人
        // 是否小於等於5或大於等於65並顯示true或false

        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入年齡：");
        int age = scan.nextInt();
        System.out.println("您輸入的年齡是：" + age);
        boolean isAdult = age >= 18;
        System.out.println("是否為成年人：" + isAdult);
        boolean isChildOrSenior = age <= 5 || age >= 65;
        System.out.println("是否為老人或小孩：" + isChildOrSenior);
        scan.close();

    }
}
