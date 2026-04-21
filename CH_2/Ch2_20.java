import java.util.Scanner;

public class Ch2_20 {
    public static void main(String[] args) {
        System.out.println("請輸入動作");
        System.out.println("1. 播放");
        System.out.println("2. 暫停");
        System.out.println("3. 停止");
        Scanner scan = new Scanner(System.in);
        int action = scan.nextInt();
        switch (action) {
            case 1:
                System.out.println("播放");
                break;
            case 2:
                System.out.println("暫停");
                break;
            case 3:
                System.out.println("停止");
                break;
            default:
                System.out.println("輸入錯誤");
                break;
        }

    }
}
