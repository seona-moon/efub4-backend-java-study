import java.util.Scanner;
 
// 전략: 금액이 큰 동전을 최대한 많이 사용하자!
public class Problem5 {
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
 
		int N = scanner.nextInt(); // 동전의 종류
        int K = scanner.nextInt(); // 목표 금액
        int[] coin = new int[N];
        int sum = 0;

        // 동전의 크기가 오름차순으로 주어지니, 내림차순으로 정렬
        for(int i = N-1; i >= 0; i--){ 
            coin[i] = scanner.nextInt();
        }

        for(int i=0; i<N; i++){
            sum += K/coin[i];
            K %= coin[i];
        }
        System.out.println(sum);
    }
}