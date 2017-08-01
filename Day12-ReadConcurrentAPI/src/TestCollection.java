import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by choubeyp on 8/1/2017.
 */
public class TestCollection {

    @Test
    public void concurrentCollectionTest(){
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        new Thread(() -> {
            int i = (int) (Math.random() * 100);
            queue.offer(i);
            System.out.println("inserted : " + i);
        }).start();

        new Thread(() -> {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        System.out.println("finish");

    }
}
