import java.util.Scanner;

public class id004_MinimumOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numElements = in.nextInt();
        int num1;
        int num2;
        for (int i = 0; i < numElements; i++) {
            num1 = in.nextInt();
            num2 = in.nextInt();
            if (num1 <= num2) {
                System.out.println(num1);
            }else {
                System.out.println(num2);
            }
        }
    }
}
