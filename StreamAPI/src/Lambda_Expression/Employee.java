package Lambda_Expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    public static void main(String[] args) {
        List<Employee> list= Arrays.asList(new Employee(67,"Sakshi",10000),new Employee(74,"Utkanshi",86900),new Employee(76,"Payal",56739));

        for(Employee e1:list){
            System.out.println(e1);
        }

    }
}