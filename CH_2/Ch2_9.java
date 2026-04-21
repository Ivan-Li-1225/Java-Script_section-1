public class Ch2_9 {
    public static void main(String[] args) {

        int h = 180;
        int w = 75;

        int myHeight = 180;
        int myWeight = 65;

        boolean ans = myHeight >= h && myWeight <= w;
        System.out.println("我是否比他高且比他輕？" + ans);

        int age = 75;
        ans = age <= 5 || age >= 65;
        System.out.println("我是否是老人或小孩？" + ans);

        int ticket = 100;
        int myAge = 65;
        int myMoney = 100;
        ans = (myAge >= 18 || myAge >= 65) && myMoney >= ticket;
        System.out.println("我是否可以買全票？" + ans);

    }
}