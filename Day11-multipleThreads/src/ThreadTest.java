import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by choubeyp on 7/31/2017.
 */
public class ThreadTest {
    int i=0;

    @Test
    public void testThread() {
        new ThreadTest();
    }

    public ThreadTest(){                             //two concurrent threads trying to access shared memory of i
        Thread thread1 = new Thread(()-> {
            for (int j = 0; j < 20000000; j++) {              //this thread incrementing i
                i++;
            }
        });


        Thread thread2 = new Thread(()-> {                   //this thread displaying i
            for (int j = 0; j < 100; j++) {
                System.out.println(i);
            }
        });
        thread1.start();
        thread2.start();
    }
}
