package com.tarunj.designpatterns.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    private int age;
    private String name;
    private String batch;
    private double marks;

    // Copy Constructor (copy inner class object to main class)
    private Student(StudentHelper studentHelper) throws Exception {

        // make necessary validations in constructor
        if(studentHelper.age > 60 || studentHelper.age < 18) {
            throw new Exception("Invalid Age");
        }

        this.age = studentHelper.age;
        this.name = studentHelper.name;
        this.batch = studentHelper.batch;
        this.marks = studentHelper.marks;
    }

    public static StudentHelper builder() {
        // builder to hide Inner Class
        return new StudentHelper();
    }

    public static class StudentHelper {

        private int age;
        private String name;
        private String batch;
        private double marks;

        // Return Object after setting the variable
        public StudentHelper setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentHelper setName(String name) {
            this.name = name;
            return this;
        }

        public StudentHelper setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public StudentHelper setMarks(double marks) {
            this.marks = marks;
            return this;
        }

        // Copy Constructor to Build the Main Object
        public Student build() throws Exception {
            return new Student(this);
        }
    }
}
