package com.stark;

public class Dreamcompany {
    public String name;
    public String location;
    public int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void worker(){
        System.out.println("company name:"+name);
        System.out.println("location of company:"+location);
        System.out.println("company package:"+salary);
    }
}
