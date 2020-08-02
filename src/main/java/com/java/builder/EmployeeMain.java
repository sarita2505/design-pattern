package com.java.builder;

import com.java.builder.Employee;
import com.java.builder.EmployeeBuilder;

/**
 * Hello world!
 *
 */
public class EmployeeMain
{
    public static void main( String[] args )

    {
        Employee builder=new EmployeeBuilder().setName("sarita").setId(1).build();
        Employee builder1=new EmployeeBuilder().setName("sarita").setId(1).setState("odisha").build();
        System.out.println(builder);
        System.out.println(builder1);
    }
}
