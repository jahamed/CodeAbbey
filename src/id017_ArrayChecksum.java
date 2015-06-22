import java.util.Scanner;

/**
 * Created by jahamed on 6/12/15.
 */
public class id017_ArrayChecksum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] input = new int[n];
        long checksum = 0;

        for(int i = 0; i < n; i++) {
            input[i] = in.nextInt();
            checksum += input[i];
            checksum *= 113;
            checksum %= 10000007;
        }

        System.out.println(checksum);
    }
}
