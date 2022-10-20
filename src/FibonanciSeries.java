import java.util.Scanner;

public class FibonanciSeries {
    public static void main(String[] args) {
        int n = 0, first = 0, second = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; ++i) {
            System.out.print(first + ", ");

            // compute the next term
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
    }
}
