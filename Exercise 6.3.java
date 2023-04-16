import java.util.*;
public class Triangle_of_stars {
	public static void printSpace(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" ");
		}
	}
	public static void printStar(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i < n + 1; i++) {
			if (n - i != 0) {
				printSpace(n - i);
			}
			printStar(2 * i - 1);
			System.out.print("\n");
		}
	}
}