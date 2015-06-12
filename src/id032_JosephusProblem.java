import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jahamed on 6/12/15.
 */
public class id032_JosephusProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int killId = 0;
        ArrayList<Integer> defendants = new ArrayList<Integer>(n);

        for(int i = 1; i <= n; i++){
            defendants.add(i);
        }

        while(defendants.size() > 1) {
            killId = (killId + k - 1) % defendants.size();
            defendants.remove(killId);
        }

        System.out.println(defendants.get(0));
    }
}
