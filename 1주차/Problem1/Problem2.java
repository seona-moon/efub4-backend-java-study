import java.util.*;

public class Problem2  {
    static ArrayList<Integer> cards = new ArrayList<>();

    public static void main(String [] args){
    
        Scanner scanner = new Scanner(System.in);

        // 카드 20장
        for (int i = 1; i <= 20; i++) {
            cards.add(i);
        }

        // 총 10개의 구간 입력, 인덱스와 맞추기 위해 -1
        for(int i = 0; i < 10; i++){
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            reverse(a, b); }

        for (int i : cards) {
            System.out.print(i + " ");
        }
    
    }

    static void reverse(int start, int end){
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = start; i <= end; i++) {
                temp.add(cards.get(start));
                cards.remove(start);
            }
            for (int i = 0; i < temp.size(); i++) {
                cards.add(start + i, temp.get(temp.size() - 1 - i));
            }
            
    }

}