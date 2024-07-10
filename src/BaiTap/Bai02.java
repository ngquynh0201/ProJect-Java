package BaiTap;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		System.out.println("lab 02 bai 01 run");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào biến a = ");
		int a = scanner.nextInt();
		System.out.print("Nhập vào biến b = ");
		int b = scanner.nextInt();

		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình không có nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("Phương trình có nghiệm = %.5f  ", x);
		}

		scanner.close();

	}
}
