import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by choubeyp on 8/1/2017.
 */
public class PrimeAddition {
    @Test
    public void PrimeAdditionTest (){
        ExecutorService executor =  Executors.newFixedThreadPool(5);

        Future<Integer> future1 = executor.submit(() -> {   //task to sum prime no. bw 1 and 101
            return primeAdder(5,100) + 5;
        });

        Future<Integer> future2 = executor.submit(() -> {  //task to sumprime no. bw 101 and 200
            return primeAdder(101,200);
        });

        Future<Integer> future3 = executor.submit(() -> {        //task to sum prime no. bw 201 and 300
            return primeAdder(201,300);
        });

        Future<Integer> future4 = executor.submit(() -> {   //task to sum prime no. bw 301 and 400
            return primeAdder(301,400);
        });

        Future<Integer> future5 = executor.submit(() -> {  //task to sum prime no. between 401 and 500
            return primeAdder(401,500);
        });

        try {        //print sum of all returned results

            System.out.println(future1.get() + future2.get() + future3.get() + future4.get() + future5.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    int primeAdder(int lowerLimit, int upperLimit){                    //function to check whether number is prime or not
        int sum =0;
        for (int i = lowerLimit; i < upperLimit; i++) {
            int j;
            for (j = 2; j <= Math.sqrt(i) ; j++) {
                if (i%j == 0){
                    break;
                }
            }
            if (j>Math.sqrt(i)){
                sum+=i;
            }
        }
        return sum;
    }
}
