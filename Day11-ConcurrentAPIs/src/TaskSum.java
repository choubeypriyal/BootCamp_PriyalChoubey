/**
 * Created by choubeyp on 7/31/2017.
 */
public class TaskSum implements Runnable{

    @Override
    public void run() {
        int sum =0;
        for (int i = 1; i <= 500 ; i++) {
            sum += i;                                      //task which sums numbers from 1 to 500
        }
        System.out.println("Sum of 1 to 500: " + sum);
    }
}
