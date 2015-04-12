package test;

public class test2 {
	public static void main(String[] args) {

		int[] num = { 1, 6, 3, 5, -1 };
		int max = 0;

		for (int i = 0; i < num.length; i++) {

			int sum = 0;

			for (int j = i; j < num.length; j++) {

				if (max < sum + num[j]) {
					max = sum + num[j];
				}
				sum = sum + num[j];
			}
		}
		System.out.println(max);
	}
}
