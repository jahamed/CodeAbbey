import java.util.Scanner;

public class id005_MinimumOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numElements = in.nextInt();
        int num1;
        int num2;
        int num3;
        for (int i = 0; i < numElements; i++){
            num1 = in.nextInt();
            num2 = in.nextInt();
            num3 = in.nextInt();
            System.out.println(Math.min(Math.min(num1, num2), num3));
        }

        /*Interesting solution:
        if (a<b)
            b = a
        if (b<c)
            c = b
        output c
         */
    }
}

