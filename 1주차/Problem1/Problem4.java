import java.util.Scanner;
 
public class Problem4 {
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
 
		int[] numCount = new int[10];
 
		int input = scanner.nextInt();
 
        // 숫자크기정해주기 = 개수 세기
		while (input != 0) {
			numCount[input % 10]++;
			input /= 10;
		}
 
		for (int i = 9; i >= 0; i--) {
			while (numCount[i]-- > 0) {
				System.out.print(i);
			}
		}

	}
}