public class Ch1_2 {

	public static void main(String[] args) {

		System.out.println("變數!");
		System.out.println("==================");

		// 整數-無小數點
		// byte -128~127
		// short -32768~32767
		// int -2147483648~2147483647
		// long -9223372036854775808~9223372036854775807

		// 浮點數-有小數點
		// float
		// double

		// 字元-單引號
		// char

		// 布林-true/false
		// boolean

		byte b1 = 25;
		System.out.println("byte:" + b1);
		System.out.println("==================");
		short s1 = 256;
		System.out.println("short:" + s1);
		System.out.println("==================");
		int i1 = 1024;
		System.out.println("int:" + i1);
		System.out.println("==================");
		long l1 = 2147483647;
		System.out.println("long:" + l1);
		System.out.println("==================");
		long l2 = 2147483648L;
		System.out.println("long:" + l2);
		System.out.println("==================");
		float f1 = 3.123456789f;
		System.out.println("float:" + f1);
		System.out.println("==================");
		double d1 = 3.123456789123456789;
		System.out.println("double:" + d1);
		System.out.println("==================");

	}

}
