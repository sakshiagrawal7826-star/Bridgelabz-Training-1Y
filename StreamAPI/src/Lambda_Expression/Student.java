package Lambda_Expression;

import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Student {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
    public static void main(String[] args) {
        ArrayList<Student> s= new ArrayList<>();
        s.add(new Student(67,"Sakshi",99));
        s.add(new Student(83,"Anjali",98));
        s.add(new Student(45,"Lovely",68));
        for(Student a:s){
            System.out.println(a);
        }
        Collections.sort(s,(a,b)-> a.marks-b.marks);
        System.out.println(s);


    }
}