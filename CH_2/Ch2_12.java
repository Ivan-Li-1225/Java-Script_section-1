import java.util.Scanner;
public class Ch2_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入第一筆數字：");
        int num1 = sc.nextInt();
        System.out.println("請輸入第二筆數字：");
        int num2 = sc.nextInt();
        System.out.println("請輸入第三筆數字：");
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("總和為：" + sum);
        sc.close();
        
    }
}




