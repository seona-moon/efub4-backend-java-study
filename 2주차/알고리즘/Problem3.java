import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;  //검은 영역의 넓이
        int n = Integer.parseInt(br.readLine());  //색종이 개수
        boolean[][] arr = new boolean[101][101];  //도화지
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        total++;
                    }
                }
            }
        }
        System.out.print(total);
    }
}