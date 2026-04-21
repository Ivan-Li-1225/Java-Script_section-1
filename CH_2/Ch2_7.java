public class Ch2_7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        boolean ans = a > b;
        System.out.println(a + " " + ">" + " " + b + " " + "=" + " " + ans);
        ans = a < b;
        System.out.println(a + " " + "<" + " " + b + " " + "=" + " " + ans);
        ans = a >= b;
        System.out.println(a + " " + ">=" + " " + b + " " + "=" + " " + ans);
        ans = a <= b;
        System.out.println(a + " " + "<=" + " " + b + " " + "=" + " " + ans);
        ans = a == b; // a是否等於b
        System.out.println(a + " " + "==" + " " + b + " " + "=" + " " + ans);
        ans = a != b; // a是否不等於b
        System.out.println(a + " " + "!=" + " " + b + " " + "=" + " " + ans);

    }
}
