import java.util.Scanner;

public class Ch2_19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入分數：");
        int score = scan.nextInt();
        System.out.println("Score:" + score);

        if (score >= 80) {
            System.out.println("很好");
        } else if (score >= 60) {
            System.out.println("及格");
        } else if (score >= 40) {
            System.out.println("補考");
        } else {
            System.out.println("重修");
        }
        
        
    }


}