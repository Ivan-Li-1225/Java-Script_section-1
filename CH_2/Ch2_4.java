public class Ch2_4 {
    public static void main(String[] args) {

        int x = 5;
        int y = 2;
        System.out.println("x" + " " + "=" + " " + x);
        System.out.println("==========");
        System.out.println("y" + " " + "=" + " " + y);
        System.out.println("==========");

        int result = x + y;
        System.out.println("x+y" + " " + "=" + " " + result);
        System.out.println("==========");

        result = x - y;
        System.out.println("x-y" + " " + "=" + " " + result);
        System.out.println("==========");

        result = x * y;
        System.out.println("x*y" + " " + "=" + " " + result);
        System.out.println("==========");

        result = x / y;
        System.out.println("x/y" + " " + "=" + " " + result);
        System.out.println("==========");

        float result_float = (float) x / y;
        System.out.println("(float)x/y" + " " + "=" + " " + result_float);
        System.out.println("==========");

        result = x % y;
        System.out.println("x%y" + " " + "=" + " " + result);
        System.out.println("==========");

    }
}
