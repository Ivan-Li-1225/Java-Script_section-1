import java.util.Scanner;

public class Ch2_18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  
        System.out.println("請輸入Score：");
        int score = scan.nextInt();
        if (score >= 90) {
            System.out.println("優");
        } else if (score >= 80 && score < 90) {
            System.out.println("甲");
        } else if (score >= 70 && score < 80) {
            System.out.println("乙");
        } else if (score >= 60 && score < 70) {
            System.out.println("丙");
        } else {
            System.out.println("不及格");
        }
        
    }
}
    

