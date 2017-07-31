import org.junit.Test;

/**
 * Created by choubeyp on 7/31/2017.
 */
public class ThreadsTester {
    @Test
    public void ThreadTester (){
        FileReader1 reader1 = new FileReader1();
        FileReader2 reader2 = new FileReader2();
        reader1.start();
        reader2.start();
        //unpredictable behaviour as content to be
        // printed is large and both threads are working concurrently
    }
}
