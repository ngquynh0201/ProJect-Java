package BaiTap;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("fist name: ");
		String fistname = scanner.nextLine();
		System.out.println("Diem: ");
		int diem = scanner.nextInt();
		System.out.println("My name is: "+fistname+",diem: "+diem);
		scanner.close();
	}

}
