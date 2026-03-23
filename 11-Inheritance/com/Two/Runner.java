package  com.Two;
public class Runner {
    public static void main(String[] args) {
        Employee e1 = new Manager("Sneha", 101, 70000, 15);
        Employee e2 = new Developer("Riya", 102, 90000, "Java");
        Employee e3 = new Intern("Priya", 103, 60000, 5);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
