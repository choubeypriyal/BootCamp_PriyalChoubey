import org.junit.Test;
/**
 * Created by choubeyp on 7/28/2017.
 */
public class CalculatorServices {
    @Test
    public void CalculatorServicesTest(){
        Calculator calc = new Calculator();
        calc.compute((double operand1, double operand2) -> {               //addition
            System.out.println(operand1 + operand2);
        },30.000,40.00);

        calc.compute((double operand1, double operand2) -> {              //Subtraction
            System.out.println(operand1 - operand2);
        },30.000,40.00);

        calc.compute((double operand1, double operand2) -> {              // Multiplicationi
            System.out.println(operand1 * operand2);
        },30.000,40.00);

        calc.compute((double operand1, double operand2) -> {              // Division
            System.out.println(operand1 / operand2);
        },30.000,40.00);
    }
}
