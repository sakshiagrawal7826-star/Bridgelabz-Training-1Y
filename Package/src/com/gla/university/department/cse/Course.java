package com.gla.university.department.cse;
public class Course {
    String courseName;
    int courseId;
    public Course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
    }
    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course ID: " + courseId);
    }
}