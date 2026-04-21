public class Ch2_8 {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;

        // 且或者反向

        boolean ans = b1 && b2; // and
        System.out.println(b1 + " && " + b2 + " = " + ans);
        ans = b1 || b2; // or
        System.out.println(b1 + " || " + b2 + " = " + ans);
        ans = !b1; // not
        System.out.println("!( " + b1 + " ) = " + ans);
        ans = !b2; // not
        System.out.println("!( " + b2 + " ) = " + ans);

    }
}
