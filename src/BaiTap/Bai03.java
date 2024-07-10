package BaiTap;

import java.util.Scanner;

//public class Bai03 {
//	public static void main(String[] args) {
////	- Nếu số điện <= 100 => số tiền = số điện x 1000
////			- Nếu số điện > 100
////			=> số tiền = 100 * 1000 + (số điện - 100) * 1500
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Chương trình tính tiền điện");
//		System.out.print("Nhập vào số điện: ");
//		int a = scanner.nextInt();
//		if (a <= 100) {
//			int money = a * 1000;
//			System.out.println("Số điện điện = " + money);
//		} else {
//			int money = 100 * 1000 + (a - 100) * 1500;
//			System.out.println("Số điện điện = " + money);
//		}
//		scanner.close();
//
//	}
//}

public class Bai03 {
	public static void bai01() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 1 <<");
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

	public static void bai02() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 2 <<");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào biến a = ");
		int a = scanner.nextInt();
		System.out.print("Nhập vào biến b = ");
		int b = scanner.nextInt();

		System.out.print("Nhập vào biến c = ");
		int c = scanner.nextInt();

		System.out.printf("Giải phương trình bậc hai %dx^2 + %dx + %d = 0 \n", a, b, c);
//			- Nếu a = 0 => làm tương tự ví dụ bài 1
//			- Nếu a # 0:
//			  - Tính delta = b^2 - 4ac.
//			  - Nếu delta < 0 => thông báo "phương trình vô nghiệm"
//			  - Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
//			  - Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
//			   x1 = (-b + căn(delta))/(2*a)
//			   x2 = (-b - căn(delta))/(2*a)

		if (a == 0) {
			// viết logic giải phương trình bậc nhất

		} else {
			int delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương vô nghiệm ");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Phương vô nghiệm kép x = %.3f ", x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Phương có 2 nghiệm riêng biệt, x1=%.3f , x2 =%.3f ", x1, x2);
			}
		}

		scanner.close();

	}

	public static void bai03() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 3 <<");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chương trình tính tiền điện");
		System.out.print("Nhập vào số điện: ");
		int a = scanner.nextInt();
		if (a <= 100) {
			int money = a * 1000;
			System.out.println("Số điện điện = " + money);
		} else {
			int money = 100 * 1000 + (a - 100) * 1500;
			System.out.println("Số điện điện = " + money);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất              |");
		System.out.println("| 2. Giải phương trình bậc hai               |");
		System.out.println("| 3. Tính số tiền điện                       |");
		System.out.println("| 4. Kết thúc                                |");
		System.out.println("++ ------------------ ++");
		System.out.print("Lựa chọn của bạn: ");
		int x = scanner.nextInt();
		switch (x) {
		case 1:
			// giải phương trình bậc nhất
			bai01();
			break;
		case 2:
			bai02();
			break;
		case 3:
			bai03();
			break;
		default:
			System.out.println(">> Bạn đã thoát chương trình <<");
			System.exit(0);
		}
	}
}
