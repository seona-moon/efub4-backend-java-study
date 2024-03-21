import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

		char[][] str = new char[5][15];

		for (int i = 0; i < str.length; i++) {
			String input = scanner.next();
			for (int j = 0; j < input.length(); j++) {
				str[i][j] = input.charAt(j);
				// System.out.print(str[i][j]); // 입력 확인
			}
		}

		// 세로로 출력
		for (int i = 0; i < 15; i++) { 
			for (int j = 0; j < 5; j++) { 
				if (str[j][i] == '\0') // 빈 문자열이면 출력하지 않기
					continue;
				System.out.print(str[j][i]);

			}
		}
	}
}