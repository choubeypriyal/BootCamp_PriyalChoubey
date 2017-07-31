
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by choubeyp on 7/29/2017.
 */
public class EmployeeAnalysis {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(90, "Priyal", 40000),
                new Employee(20, "Ritu", 46000),
                new Employee(30, "Aakriti", 500000),
                new Employee(40, "Priya", 900000),
                new Employee(50, "Sidharth", 230000),
                new Employee(60, "Aditya", 198989),
                new Employee(70, "Binay", 678909),
                new Employee(80, "Snigdha", 12345),
                new Employee(90, "Sneh", 45678),
                new Employee(100, "Bhoomi", 109478),
                new Employee(110, "Pranali", 345678),
                new Employee(120, "Ishan", 7428174),
                new Employee(130, "Rajan", 123456),
                new Employee(140, "Arshi", 789999),
                new Employee(150, "Mukta", 456700),
                new Employee(160, "Sushant", 2355),
                new Employee(170, "Harshala", 23456),
                new Employee(180, "Harshita", 78922),
                new Employee(190, "Kamal", 123400),
                new Employee(200, "Nitesh", 1));
        double tds = list.stream().
                filter((Employee emp) -> emp.getSalary() > 50000).
                map((Employee emp) -> 0.10*emp.getSalary()).
                reduce((acc, salary) -> acc + salary).get();
        System.out.println(tds);

        System.out.println((long) list.size());  //total number of employee

        System.out.println(                          // total salary
                list.stream().collect(Collectors.summingDouble((Employee employee) ->{return  employee.getSalary();}))
        );

        System.out.println(                          // average salary
                list.stream().collect(Collectors.averagingDouble((Employee employee) -> {return  employee.getSalary();}))
        );

        System.out.println(                         //max salary
                list.stream().collect(Collectors.maxBy((Object o1, Object o2) -> {
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee) o2;
                    return (int)(e1.getSalary()-e2.getSalary());
                })).get()
        );

        System.out.println(                        //min salary
                list.stream().collect(Collectors.minBy((Object o1, Object o2) -> {
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee) o2;
                    return (int)(e1.getSalary()-e2.getSalary());
                })).get()
        );


    }
}
