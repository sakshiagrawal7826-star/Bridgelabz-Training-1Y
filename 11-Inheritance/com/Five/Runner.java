package com.Five;
public class Runner {
    public static void main(String[] args) {
        Teacher t = new Teacher("Ankit", 41, "Science");
        Student s = new Student("Anuj", 16, "10th Grade");
        Staff st = new Staff("Vipul", 48, "HOD");
        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
