import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by choubeyp on 7/31/2017.
 */
public class ConcurrentSum {
    @Test
    public void testConcurrentSum(){
        TaskSum task = new TaskSum();
        Executor workers = Executors.newCachedThreadPool();     //using concurrency threadpool
        // chachedTHreadpool for varying task clause :)

        for (int i = 0; i <40 ; i++) {
            workers.execute(task);
        }

    }
}
