package org.cdk.annotation;

import com.example.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("org/cdk/annotation/appCxt.xml");

        org.cdk.annotation.Employee employee = (org.cdk.annotation.Employee) context.getBean("employee");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getPhone());
        System.out.println(employee.getAddress().getCity());
    }
}
