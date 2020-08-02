package com.java.builder;

public class EmployeeBuilder {
    private String name;
    private int id;
    private String state;

    public EmployeeBuilder() {
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setState(String state) {
        this.state = state;
        return this;
    }
    public Employee build(){
        Employee e = new Employee();
        e.setName(this.name);
        e.setId(this.id);
        e.setState(this.state);
        return  e;
    }

}
