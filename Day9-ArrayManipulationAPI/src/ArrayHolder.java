import java.util.List;
/**
 * Created by choubeyp on 7/28/2017.
 */
public class ArrayHolder {
    List<Integer> array;

    public ArrayHolder(List<Integer> array) {
        this.array = array;
    }

    void forEach(ForEach forEach) {       //for each method using consumer
        for (int i : array
                ) {
            forEach.operation(i);
        }
    }

    int modify(Modify modify, int operand) {
        return modify.modify(operand);
    }          //modify using function

    void delete(Delete operation, int operand) {                                      //delete using predicate
        if (operation.check(operand) == true) {
            array.remove(operand);
        }
    }


    int calculator(sumAll sumAll, int sum) {                       //using lambda
        return sumAll.calculator(sum);
    }
}
