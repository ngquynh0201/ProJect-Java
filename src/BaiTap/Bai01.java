package BaiTap;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lựa chọn bạn chọn");
		int value = scanner.nextInt();
		switch (value) {
		case 1:
			System.out.println("Phép tính cộng");
			break;
		case 2:
			System.out.println("Phép tính trừ");
			break;
		default:
			System.out.println("Bạn lụa chọn thoát chương trình");
			System.exit(0);
		}

		int value1 = scanner.nextInt();
		scanner.close();
	}
}
