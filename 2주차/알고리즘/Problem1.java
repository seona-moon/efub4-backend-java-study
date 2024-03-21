import java.util.Scanner;

public class Problem1  {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder results = new StringBuilder();
        String[] yut = {"D", "C", "B", "A", "E"};

        for(int i=0; i<3; i++){
            int sum = 0;
            for(int j=0; j<4; j++){
                int input = scanner.nextInt();
                sum += input;
            }

            results.append(yut[sum]).append("\n");
            // 기존 코드 -> 배열로 변경
            // if (sum == 4) {
            //     results.append("E\n"); // 모
            // } else if (sum == 3) {
            //     results.append("A\n"); // 도
            // } else if (sum == 2) {
            //     results.append("B\n");  // 개
            // } else if (sum == 1) {
            //     results.append("C\n");  // 걸
            // } else if (sum == 0) {
            //     results.append("D\n");  // 윷
            // }

        } 
        System.out.println(results.toString());

    }
}