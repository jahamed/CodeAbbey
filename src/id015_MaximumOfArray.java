import java.util.Scanner;

public class id015_MaximumOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min;
        int max;

        min = in.nextInt();
        max = min;

        for(int i=1; i<300; i++){
            int tmp = in.nextInt();
            max = tmp > max ? tmp : max;
            min = tmp < min ? tmp : min;
        }

        System.out.println(max + " " + min);
    }
    /*
    while (in.hasNext()){} to make nums in list flexible
     */
}
