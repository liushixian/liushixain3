package test;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入英文句子：");
		String s = sc.nextLine();

		String[] ss = s.split(" ");

		for (int i = ss.length - 1; i >= 0; i--) {
			System.out.print(ss[i] + " ");
		}
	}

}
