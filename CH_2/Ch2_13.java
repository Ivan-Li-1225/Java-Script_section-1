import java.util.Scanner;

public class Ch2_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入身高(公尺)：");
        double height = sc.nextDouble();
        System.out.println("請輸入體重(公斤)：");
        double weight = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("您的BMI為：" + (int) (bmi * 100) / 100.0);
        sc.close();
    }
}
