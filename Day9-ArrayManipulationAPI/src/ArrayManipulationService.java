import java.util.Arrays;
import java.util.List;
/**
 * Created by choubeyp on 7/28/2017.
 */
public class ArrayManipulationService {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(10, 50, 90, 200, 47, 122, 698, 567, 23, 132);
        //int[] array = new int[]{10, 50, 90, 200, 47, 122, 698, 567, 23, 132};

        ArrayHolder holder = new ArrayHolder(array);
        holder.forEach((int i) -> {                                        //for-each implementation, doubles each element
            i = i * 2;
            System.out.println(i);
        });

        int m = holder.modify((int operand) -> {                        //if element is divisible by 2, update it to 0
            if (array.get(operand) % 2 == 0) {
                array.set(operand,  0);
            }
            return array.get(operand);
        }, 4);
        System.out.println(m);


        System.out.println(holder.calculator((int sum) -> {           //gives sum of all elements
            for (int i = 0; i < array.size() ; i++) {
                sum += array.get(i);
            }
            return sum;
        }, 0));

        /*
        using streams can be reduced to
                System.out.println(array.stream().reduce((sum, element) -> sum+ element).get());
        */

        holder.delete((int operand) -> {                   // test if element is divisible by 2, deletes it
            if(array.get(operand) % 2 == 0)
            return true;
            else
            return false;
        }, 8);

        /*manipulation.manipulate((int[] arr) -> {                    Before concepts were cleared
                    Arrays.sort(arr);
            for (int i : arr
                    ) {
                System.out.println(i);
            }
        }, array);

        manipulation.manipulate((int[] arr) -> {
            int max = arr[0];
            for (int i=0;i< arr.length;i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            System.out.println(max);
        }, array);

        manipulation.manipulate((int[] arr) -> {
            int min = arr[0];
            for (int i=0;i< arr.length;i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            System.out.println(min);
        }, array);

        manipulation.manipulate((int[] arr) -> {
            int sum = 0;
            for (int i=0;i< arr.length;i++){
                sum = sum + arr[i];
                }
            System.out.println(sum);
        }, array); */
    }

}
